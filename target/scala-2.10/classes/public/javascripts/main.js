var demoApp = angular.module("demoApp", {});

demoApp.controller("MainController", function($scope, Service, $q) {
  $scope.getTemps = function() {
    var zips = $scope.zipcodes.split(",");

    $scope.loading = true;

    Service.getIpaddress().then(
      function(response) {
        console.log("getIPaddress ADDRESS:", response);
        $scope.ip = response.data.ip;

        console.log("getIPaddress response ", response); // success
        $scope.loading = false;
      },
      function(response) {
        // optional
        // failed
        console.log("getIPaddress  failed", response); // success
      }
    );

    Service.getAllLocations(zips).then(
      function(response) {
        const flattened = _.map(response, function(value, idx) {
          return value.data;
        })

        const subresult = [].concat.apply([], flattened);

        let finalResult = [];
        finalResult = _.map(subresult, function(subresult1, idx) {
          return {
            key: subresult1.Key,
            zipcode: subresult1.PrimaryPostalCode,
            timeZoneName: subresult1.TimeZone.Name,
            countryID: subresult1.Country.ID,
            cityName: subresult1.LocalizedName,
            name: subresult1.LocalizedName
          };
        });
        let allTemps = [];
        $q.all([
          Service.getAllTemps(finalResult),
          Service.getAllTempsPrecipitation(finalResult)
        ]).then(
          function(response) {
            let tempsResult = [];
            let precipResult = [];
            tempsResult = [].concat.apply([], response[0]);
            precipResult = [].concat.apply([], response[1]);
            console.log(" tempsResult", tempsResult);
            console.log(" precipResult", precipResult);
            var mergedList = _.map(tempsResult, function(item) {
              return _.extend(
                item,
                _.findWhere(precipResult, { key: item.key })
              );
            });
            $scope.processedData = mergedList;
            console.log(" final Result", mergedList);
            let locations = [];
            let weathers = [];
            var mergedList = _.map(mergedList, function(item) {
              let location = {
                cityName: item.cityName,
                zipCode: item.zipcode,
                timeZoneName: item.timeZoneName,
                countryID: item.countryID
              };
              let weather = {
                tempF: item.imperial.Value,
                tempC: item.metric.Value,
                weatherText: item.WeatherText,
                name: item.name
              };
              locations.push(location);
              weathers.push(weather);
            });
            let postData = {
              weathers: weathers,
              locations: locations
            };
            
            console.log("saving data API request", postData); // success

            Service.savePostData(postData).then(
              function(response) {
                console.log("saving data API resonpse", response); // success
              },
              function(response) {
                // optional
                // failed
                console.log("saving data API failed", response); // success
              }
            );
            $scope.loading = false;
            
          },
          function(error) {
            console.log("result final error", error);
          }
        );
      },
      function(error) {
        console.log("error ", error);
      }
    );
    
    

    var ipAdd = $scope.ip.split(",");
    console.log(ipAdd);
    //console.log($scope.ip)

    Service.getIpLocation(ipAdd).then(
      function(response) {
        const flattened = _.map(response, function(value, idx) {
          return value.data;
        })

        const subresult = [].concat.apply([], flattened);

        let finalResult = [];
        finalResult = _.map(subresult, function(subresult1, idx) {
          return {
            key: subresult1.Key,
            zipcode: subresult1.PrimaryPostalCode,
            timeZoneName: subresult1.TimeZone.Name,
            countryID: subresult1.Country.ID,
            cityName: subresult1.LocalizedName,
            name: subresult1.LocalizedName
          };
        });
        let allTemps = [];
        $q.all([
          Service.getAllTemps(finalResult),
          Service.getAllTempsPrecipitation(finalResult)
        ]).then(
          function(response) {
            let tempsResult = [];
            let precipResult = [];
            tempsResult = [].concat.apply([], response[0]);
            precipResult = [].concat.apply([], response[1]);
            console.log(" tempsResult", tempsResult);
            console.log(" precipResult", precipResult);
            var mergedList = _.map(tempsResult, function(item) {
              return _.extend(
                item,
                _.findWhere(precipResult, { key: item.key })
              );
            });
            $scope.processedDataIP = mergedList;
            console.log(" final Result", mergedList);
            let locations = [];
            let weathers = [];
            var mergedList = _.map(mergedList, function(item) {
              let location = {
                cityName: item.cityName,
                zipCode: item.zipcode,
                timeZoneName: item.timeZoneName,
                countryID: item.countryID
              };
              let weather = {
                tempF: item.imperial.Value,
                tempC: item.metric.Value,
                weatherText: item.WeatherText,
                name: item.name
              };
              locations.push(location);
              weathers.push(weather);
            });
            let postData = {
              weathers: weathers,
              locations: locations
            };
            console.log("saving data API request", postData); // success

            Service.savePostData(postData).then(
              function(response) {
                console.log("saving data API resonpse", response); // success
              },
              function(response) {
                // optional
                // failed
                console.log("saving data API failed", response); // success
              }
            );
            $scope.loading = false;
          },
          function(error) {
            console.log("result final error", error);
          }
        );
      },
      function(error) {
        console.log("error ", error);
      }
    ); 

  };

  initialize();

  function initialize() {
    $scope.loading = false;
    $scope.temp = "f";

    $scope.zipcodes = "10002, 46202, 94109, 90210, 46268";
    //$scope.zipcodes = " 10002, 90210";
    //$scope.ips = "68.58.65.2";
    //
  }
});

demoApp.factory("Service", [
  "$http",
  "$q",
  function($http, $q) {
    var service = {};
    var postalUrl =
      //"https://dataservice.accuweather.com/locations/v1/postalcodes/search?apikey=zKAGOAo03qxkltUTUQmzidvHXLmdJxn5&q=ZIPCODE_HERE";
      "https://dataservice.accuweather.com/locations/v1/postalcodes/US/search?apikey=zKAGOAo03qxkltUTUQmzidvHXLmdJxn5&q=ZIPCODE_HERE";
    var currentUrl =
      "https://dataservice.accuweather.com/currentconditions/v1/LOC_KEY?apikey=zKAGOAo03qxkltUTUQmzidvHXLmdJxn5&details=true";
    var currentUrl2 =
      "https://dataservice.accuweather.com/forecasts/v1/daily/1day/LOC_KEY?apikey=zKAGOAo03qxkltUTUQmzidvHXLmdJxn5&details=true";
    var ipUrl = 
      "https://dataservice.accuweather.com/locations/v1/cities/ipaddress?apikey=zKAGOAo03qxkltUTUQmzidvHXLmdJxn5&q=IP_ADDRESS&details";

    service.getIpaddress = function() {
      return $q.all($http.get("https://api.ipify.org?format=json"));
    };

    service.getAllTemps = function(data) {
      var promises = _.map(data, function(location, idx) {
        let value1 = location.key;

        var config = {
          headers: { Accept: "application/json" }
        };
        var url = currentUrl.replace("LOC_KEY", value1);
        //var url2 = currentUrl2.replace("LOC_KEY", value1);
        return $http.get(url, config);
      });
      return $q.all(promises).then(function(results) {
        var final = [];

        let index = 0;
        angular.forEach(results, function(result) {
          var response = [];

          response = response.concat(result.data);

          //Imperial: {Value: 36, Unit: "F", UnitType: 18}
          //Metric: {Value: 2, Unit: "C", UnitType: 17}
          let ress = _.map(response, function(location, idx) {
            let res1 = {
              key: data[index].key,
              name: data[index].name
            };
            res1.imperial = location.Temperature.Imperial;
            res1.metric = location.Temperature.Metric;
            res1.FeelsLikeMetric = location.RealFeelTemperature.Metric;
            res1.FeelsLikeImperial = location.RealFeelTemperature.Imperial;
            res1.IsDayTime = location.IsDayTime;
            res1.WeatherText = location.WeatherText;
            res1.HasPrecipitation = location.HasPrecipitation;
            res1.MobileLink = location.MobileLink;
            res1.LocalObservationDateTime = location.LocalObservationDateTime;
            res1.WindSpeedMetric = location.Wind.Speed.Metric;
            res1.WindSpeedImperial = location.Wind.Speed.Imperial;
            res1.WindDirectionEnglish = location.Wind.Direction.English;
            res1.WindChillTemperatureMetric =
              location.WindChillTemperature.Metric;
            res1.WindChillTemperatureImperial =
              location.WindChillTemperature.Imperial;
            res1.RelativeHumidity = location.RelativeHumidity;

            if (res1.HasPrecipitation === false) {
              res1.HasPrecipitationString = "No";
            } else {
              res1.HasPrecipitationString = "Yes";
            }

            if (res1.IsDayTime === false) {
              res1.IsDayTimeString = "No";
            } else {
              res1.IsDayTimeString = "Yes";
            }

            //res1.PrecipitationProbability = location.DailyForecasts.Day.PrecipitationProbability;

            return res1;
          });
          final.push(ress);
          index++;
        });
        return final;
      });
    };



    service.getAllTempsPrecipitation = function(data) {
      var promises = _.map(data, function(location, idx) {
        let value1 = location.key;

        var config = {
          headers: { Accept: "application/json" }
        };

        var url = currentUrl2.replace("LOC_KEY", value1);

        return $http.get(url, config);
      });
      return $q.all(promises).then(function(results) {
        var final = [];

        let index2 = 0;
        angular.forEach(results, function(result) {
          var response = [];
          response = response.concat(result.data);
          console.log("forecast data response ", response);
          let res1 = {
            key: data[index2].key,
            name: data[index2].name,
            zipcode: data[index2].zipcode,
            timeZoneName: data[index2].timeZoneName,
            countryID: data[index2].countryID,
            cityName: data[index2].cityName
          };

          if (response) {
            let tempObj = response[0].DailyForecasts;
            res1.PrecipitationProbability =
              tempObj[0].Day.PrecipitationProbability;
          }

          final.push(res1);
          index2++;
        });
        console.log("forecast data ", final);
        return final;
      });
    };

    service.getAllLocations = function(data) {
      var promises = _.map(data, function(value, idx) {
        let value1 = value.split(" ").join("");
        var config = {
          headers: { Accept: "application/json" }
        };
        var url = postalUrl.replace("ZIPCODE_HERE", value1);

        return $http.get(url, config);
      });

      return $q.all(promises);
    };

    
   
    service.getIpLocation = function(data) {
      var promises = _.map(data, function(value, idx) {
        let value1 = value.split(" ").join("");
        var config = {
          headers: { Accept: "application/json" }
        };
        var url = ipUrl.replace("IP_ADDRESS", value1);

        return $http.get(url, config);
      });

      return $q.all(promises);
    }; 

    service.savePostData = function(input) {
      let promise = $http({
        url: "/save",
        method: "POST",
        data: input
      });
      return $q.all(promise);
    };
    return service;
  }
]);