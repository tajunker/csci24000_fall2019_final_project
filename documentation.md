# Goals

Create a project that illustrates what you’ve done this semester. You have quite a bit of leeway on this project, so pick something interesting. Ideal projects will illustrate the primary ideas of this course.

# Termal is Deployed to Heroku

The Termal Application has been deployed to Heroku using the Heroku Git and Play Framework deployment integration. To visit and interact with the deployed web application, please, point your browser to:  

[https://termalapp.herokuapp.com/](https://termalapp.herokuapp.com/)  

# Documentation

To view documentation in production visit:  

[https://termalapp.herokuapp.com/documentation](https://termalapp.herokuapp.com/documentation)  

# Overview

Termal allows users to input Zip Codes, separated by commas, into the input field. Temperatures for those Zip Codes are fetched from the Accuweather™ API when the user clicks enter or the search button. Fetched data is parsed and displayed in view in the UI. This web application uses MVC design pattern to fully separate view from controller and model (we are not using the model in MVC, as we are not saving anything to a database. Fetched JSON data is also stored in Weather and Location Java classes of application for future use and potential integration with a database. This application uses a number of different technologies to accomplish the previously mentioned goals. The application was developed as part of my learning process for feeling out the following technology stack: Java, Play! Framework 2.2.6, JavaScript, AngularJS, LoDashJS, HTML, CSS, Twitter Bootstrap, Heroku’s Git & Play! app deployment integration, and the Accuweather API and ipify API.

# Installing Play Framework

To install play on your local machine please visit the following Play Framework installation webpage at:  

[https://www.playframework.com/documentation/2.2.x/Installing](https://www.playframework.com/documentation/2.2.x/Installing)

# Running Play Framework Application

Once Play has been installed on your local machine, running the play application is quite simple:  
- cd into the termal application folder  
- type ‘play’ (no quotes) in console (the play application will start compiling)  
- once compiled type ‘run’ (no quotes) in console (the play application will start running)  
- once application is running point your web browser to [http://localhost:9000](http://localhost:9000)  
- you should then be able to see Termal running locally on your machine.

# Input

The user inputs comma separated zip codes into the input box. Temperatures for those zip codes are fetched from the Accuweather API when the user presses enter or clicks the search button.

# Output

JSON data results of fetched zip codes made to Accuweather API are displayed in the UI and styled with Twitter Bootstrap for liquid design purposes and displayed in UI in index.scala.html.

*   The Application uses Twitter Bootstrap in order to recalculate layout depending on users browser window size. Making the web application display data seamlessly regardless of device user is on.
*   Web application renders layout as a mobile application if user is accessing webpage from a mobile device or tablet, and as a standard webpage if on a computer or laptop, adapting to size of user’s browser window.
*   If on a mobile device or tablet, user can save application to Home Screen and appropriate .ico files are utilized in order to make it appear as a native mobile OS application on user’s device homescreen.
*   JSON data is ‘glued’ or passed to html in index.scala.html file via main.js which uses the AngularJS framework.
*   AngularJS also renders separate weather information div containers for each zip code fetched in UI when user presses enter or clicks the search button.
*   JSON object of the first zip code entered is also output to view.
*   A table with returned JSON objects is also output to view.
*   In each weather information div containers the following information is displayed:
    *   City name
    *   Weather text (e.g. cloudy, sunny, etc.)
    *   Feels like (in Celsius and Fahrenheit)
    *   Wind chill (in Celsius and Fahrenheit)
    *   Is it raining?
    *   Is it day time?
    *   Humidity
    *   Precipitation probability
    *   Wind speed
    *   Wind direction
    *   Temperature in Celsius
    *   Temperature in Fahrenheit
    *   Time of observation
    *   Link to accuweather webpage for specific zip code.
*   User can also use a radio button selection to switch Temperature information from Fahrenheit to Celsius and vice-versa, for each individual weather information div containers.
*   The application also fetches user’s IP address for future weather information by IP Address integration.

# Steps

For this program we have one main function called index() and documentation() in Application.java which is handled by the play framework to render the index.scala.html page and the documentation.scala.html page respectively. The following functions are then used.

*   This program uses Play Framework as restful high velocity web framework fro Java and Scala, JavaScript, AngularJS, LoDashJS, HTML, CSS, Twitter Bootstrap, Heroku’s Git & Play! app deployment integration, and the Accuweather API.

*   User inputs comma separated zip codes into the input field in index.scala.html, and clicks search or presses enter.

*   getTemps() in view is handled by AngularJS which makes a call to the getTemps() function in main.js

*   getTemps() calls getIpaddress(), getAllLocations() and getIPLocation() services in MainController of AngularJS framework which uses respective functions in AngularJS factory of demoApp.

*   getAllLocations() calls getAllTemps(), getAllTempsPrecipitation(), and savePostData() from service factory of AngularJS

*   getAllLocations() parses zipcodes, maps zipcode and promises to return an array of location keys and makes an http request to Accuweather Location API for each zip code entered. This is necessary to obtain the Location Key of each zip code in order to make a HTTP GET request to the Accuweather Current Conditions API which uses the Location Key and API key as part of the HTTP GET request URL, instead of a zip code. Since the Accuweather Current Conditions API does not take a zip code as a parameter and instead uses a Location Key, this is a necessary step.

    *   Make a HTTP GET request to Accuweather Locations API to return Location Key for Accuweather Current Conditions API using the following URL replacing ZIPCODE_HERE with user inputed zip code values and API_KEY with API key.
    *   [https://dataservice.accuweather.com/locations/v1/postalcodes/US/search?apikey=API_KEY&q=ZIPCODE_HERE](https://dataservice.accuweather.com/locations/v1/postalcodes/US/search?apikey=API_KEY&q=ZIPCODE_HERE)
*   getAllLocations() returns the array of Location Keys for each zip code entered.

*   getAllTemps() we can then call the function getAllTemps() for each zip code entered with the returned Location Key information obtained from Accuweather Locations API in order to obtain Current weather Conditions for each zip code entered.

    *   The Accuweather Current Conditions API uses the Location Key obtained from Accuweather Location API HTTP GET request to return a JSON object of current conditions for each location key requested.
    *   Makes a HTTP GET request to the Accuweather Current Conditions API using the location key obtained from Accuweather Locations API for each zip code entered using the following URL replacing LOC_KEY with the returned values for Location Key of the Locations API HTTP GET request and API_KEY with API key
    *   [https://dataservice.accuweather.com/currentconditions/v1/LOC_KEY?apikey=API_KEY&details=true](https://dataservice.accuweather.com/currentconditions/v1/LOC_KEY?apikey=API_KEY&details=true)
*   getAllTempsPrecipitation() for precipitation probability we have to make another HTTP GET request to a separate Accuweather API called Forecast API, specifically the 1 Day of Daily Forecasts get method of the Accuweather Forecast API.

    *   The Accuweather Forecast API URL, similarly to the Current Conditions API URL does not take a zip code as a parameter, but rather a Location Key obtained from the HTTP GET request made to the Accuweather Locations API.
    *   Since we have already obtained the Location Keys for each zip code previously in the getAllLocations() function it is unecessary to make a new call to the Accuweather Locations API so we instead use the same values to make the Forecast API HTTP GET request.
    *   Makes a HTTP GET request to the Accuweather Forecast API using the location key obtained from Accuweather Locations API for each zip code entered using the following URL replacing LOC_KEY with the returned values for Location Key of the Locations API HTTP GET request and API_KEY with API key
    *   [https://dataservice.accuweather.com/forecasts/v1/daily/1day/LOC_KEY?apikey=API_KEY&details=true](https://dataservice.accuweather.com/forecasts/v1/daily/1day/LOC_KEY?apikey=API_KEY&details=true)
*   getIpAddress() makes a HTTP GET request to the IPIFY API to obtain user’s IP Address

*   getIpLocation() is similar to getAllLocations() but instead it uses the Accuweather Locations API IP Address Search get method to obtain a Location Key instead of the Accuweather Locations API Postal Code Search get method.

    *   getIpLocation() then also uses that Location Key to call getAllTemps() and getAllTempsPrecipitation()
*   savePostData() makes HTTP POST request to the /save URL which is handled by the Play Framework routes to call the controllers.ApiController.savePost() method in Controllers -> ApiController -> savePost()

    *   in main.js in under MainControllers implementation of savePostData() two objects are created one for weather and one for location
    *   a mergedlist is instantiated with weather and location data which is pushed to locations and weathers arrays
    *   pushed data is stored in postData which is the argument the savePostData function takes as input.
    *   when savePostData() function is called by AngularJS, the /save URL is handled by the Play framework routes functionality to call controllers.ApiController.savePost() in Controllers -> ApiController passing postData as a HTTP POST to the savePost() function in ApiController.java
    *   ApiContoller implements the Jackson Library to bind the JSON data to a JsonNode called json which initializes a PostData.java instance which has a List<Weather> weathers and List<Location> locations as private attributes. A
    *   savePost() then uses the getWeathers and getLocations function in PostData to set values for List<Weather> and List<Location> data object of the Weather.java and Location.java
    *   savePost() uses a Java 8 forEach loop to output to console the originally JSON object as attributes of the Weather.java and Location.java classes.
    *   savePost() then outputs via console the weather and location information via System.out.println(weather) and System.out.println(location) respectively.
*   In index.scala.html the appropriate weather information is displayed in a weather information div container that uses the AngularJS ‘ng-repeat’ to display each of the zip codes weather information in separate containers passing the data handled by AngularJS to the view via the data-ng-controller=“MainController” -> ng-repeat=“result in processedData” AngularJS HTML tags

    *   the getTemps() function in AngularJS demoApp.controller(“MainController”, function($scope, Service, $q) is called from the view in index.scala.html as an onClick action when the user presses enter or clicks the search button using the data-ng-click=“getTemps()” AngularJS HTML tag.
    *   index.scala.html then renders the JSON object of the first zip code entered and outputs it to the UI
    *   index.scala.html then renders the JSON object of each zip code fetched from the Accuweather API in a Table format.