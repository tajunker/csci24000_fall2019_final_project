
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html data-ng-app="demoApp">
	 <head>
	 	<meta charset="utf-8">
	 	<title>Termal App</title>
	 	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	 	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	    <meta name="description" content="">
	    <meta name="author" content="">
	    
	    <!-- Styles -->
	    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.51*/routes/*12.57*/.Assets.at("third/bootstrap/css/bootstrap.css"))),format.raw/*12.104*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.51*/routes/*13.57*/.Assets.at("third/bootstrap/css/bootstrap-responsive.css"))),format.raw/*13.115*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.51*/routes/*14.57*/.Assets.at("third/bootstrap/css/docs.css"))),format.raw/*14.99*/("""">
	    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.51*/routes/*15.57*/.Assets.at("third/bootstrap/js/google-code-prettify/prettify.css"))),format.raw/*15.123*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*16.48*/routes/*16.54*/.Assets.at("third/bootstrap/css/bootstrap-theme.css"))),format.raw/*16.107*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*17.48*/routes/*17.54*/.Assets.at("stylesheets/main.css"))),format.raw/*17.88*/("""">
		<link rel="shortcut icon" type="image/ico" href=""""),_display_(Seq[Any](/*18.53*/routes/*18.59*/.Assets.at("images/favicon.ico"))),format.raw/*18.91*/("""">

		<script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("third/angularjs/angular.min.js"))),format.raw/*20.67*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*21.17*/routes/*21.23*/.Assets.at("third/angularjs/angular-resource.min.js"))),format.raw/*21.76*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*22.17*/routes/*22.23*/.Assets.at("javascripts/main.js"))),format.raw/*22.56*/("""" type="text/javascript"></script>
	 </head>
	 <body>
	 	<!-- Navbar ========================================================= -->
	    <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
            	<div class="containerHeader">
            		<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
	                    <span class="sr-only">Toggle navigation</span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                </button>
	                <a style="" class="navbar-brand" href="/"><img src="">termal</a>
	                <div class="collapse navbar-collapse navbar-main-collapse">

		                <ul class="navbar-nav nav" style="margin: 0px; text-align: center;">
		                	<li class=""><a href="/">Home</a></li>
		                    <li class=""><a target="_blank" href=""""),_display_(Seq[Any](/*40.62*/routes/*40.68*/.Assets.at("pdf/Tercio-Agra-Junker-Resume.pdf"))),format.raw/*40.115*/("""">Resume</a></li>
		                    <li class=""><a target="_blank" href="http://www.linkedin.com/in/tajunker">LinkedIn</a></li>
				        	<li class=""><a target="_blank" href="https://github.com/tajunker">GitHub</a></li>
				        	<li class=""><a target="_blank" href="http://twitter.com/tajunker">Twitter</a></li>
		                </ul>
		            </div>
            	</div>
            </div>
        </div>
	 	<!-- Subhead ================================================== -->
	 	<header class="jumbotron subhead" id="overview">
			  <div class="container">
			  	<br />
			  	<br />
			    <h1>Overview</h1>
			    <p class="lead">termal allows users to input Zip Codes, separated by commas, into the input field. Temperatures for those Zip Codes are fetched from the Accuweather™ API when the user clicks enter or the search button.</p>
			  </div>
		</header>
	 	<div class="container" data-ng-controller="MainController" id="Weather results">
	 		<div class="row clearfix">
	 			<div class="span12 column col-md-12" style="margin-left: 0px;">
	 				<form class="form-inline" role="form">
						<span style="width: 100%;" class="form-group span8">
	                        <label class="sr-only" for="zipcode">ZipCode</label>
	                        <input data-ng-model="zipcodes" type="text" class="form-control" id="zipcode" size="80" placeholder="Zip codes...">
	                    </span>
	                    <br />
	                    <br />
	                    <button style="width: 100%; min-width: 80px;" data-ng-click="getTemps()" type="submit" class="btn btn-primary span4">Search!</button>
					</form>					
					
					<br />
					<br />
					<br />
					<br />
					<p style="width:60%; margin-left: 20%; margin-right: 20%;" data-ng-show="loading" class="alert alert-info">
					  	Loading...
					</p>
					<br />
					<br />

					<br />
					<br />

				</div>
				
				<div class="span12 column col-md-12">
					<div class="margin-left: 0px;">
						<h1>WEATHER BY IP</h1>
						<!--<div class="location">"""),format.raw/*89.33*/("""{"""),format.raw/*89.34*/("""{"""),format.raw/*89.35*/("""ip"""),format.raw/*89.37*/("""}"""),format.raw/*89.38*/("""}"""),format.raw/*89.39*/("""</div>-->
					</div>
					<br />
					<br />
					<br />
					<br />
					<br />
					
					<div ng-repeat="result in processedDataIP" style="padding-top: 40px;" >

						<div class="forecast-table">
							<div class="container">
								<div class="forecast-container">
									<div class="today forecast">
										<div class="forecast-header">
											<div class="day">Time of Observation</div>
											<div class="date">"""),format.raw/*105.30*/("""{"""),format.raw/*105.31*/("""{"""),format.raw/*105.32*/(""" result.LocalObservationDateTime """),format.raw/*105.65*/("""}"""),format.raw/*105.66*/("""}"""),format.raw/*105.67*/("""</div>
										</div>
										<br/> 
										<div class="location" style="float:left; padding-left:20px;">IP Address: """),format.raw/*108.84*/("""{"""),format.raw/*108.85*/("""{"""),format.raw/*108.86*/("""ip"""),format.raw/*108.88*/("""}"""),format.raw/*108.89*/("""}"""),format.raw/*108.90*/("""</div>
										<!-- .forecast-header -->
										<div class="" style="float: right; padding-right:20px;">

								      			C
								      			<input type="radio" name="temp" ng-model="temp" value="c">
								      			
								      		
								      			<input type="radio" name="temp" ng-model="temp" value="f">
								      			F
							      			
										</div>
										<br />
										<div class="forecast-content">
											
											<div class="location">"""),format.raw/*123.34*/("""{"""),format.raw/*123.35*/("""{"""),format.raw/*123.36*/(""" result.name """),format.raw/*123.49*/("""}"""),format.raw/*123.50*/("""}"""),format.raw/*123.51*/("""</div>
											<div class="location">Mostly """),format.raw/*124.41*/("""{"""),format.raw/*124.42*/("""{"""),format.raw/*124.43*/(""" result.WeatherText """),format.raw/*124.63*/("""}"""),format.raw/*124.64*/("""}"""),format.raw/*124.65*/("""</div>
											
											<div class="location">Feels like: """),format.raw/*126.46*/("""{"""),format.raw/*126.47*/("""{"""),format.raw/*126.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*126.78*/("""}"""),format.raw/*126.79*/("""}"""),format.raw/*126.80*/(""" C | """),format.raw/*126.85*/("""{"""),format.raw/*126.86*/("""{"""),format.raw/*126.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*126.119*/("""}"""),format.raw/*126.120*/("""}"""),format.raw/*126.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*127.46*/("""{"""),format.raw/*127.47*/("""{"""),format.raw/*127.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*127.89*/("""}"""),format.raw/*127.90*/("""}"""),format.raw/*127.91*/(""" C | """),format.raw/*127.96*/("""{"""),format.raw/*127.97*/("""{"""),format.raw/*127.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*127.141*/("""}"""),format.raw/*127.142*/("""}"""),format.raw/*127.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*128.44*/("""{"""),format.raw/*128.45*/("""{"""),format.raw/*128.46*/(""" result.HasPrecipitationString """),format.raw/*128.77*/("""}"""),format.raw/*128.78*/("""}"""),format.raw/*128.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*129.45*/("""{"""),format.raw/*129.46*/("""{"""),format.raw/*129.47*/(""" result.IsDayTimeString """),format.raw/*129.71*/("""}"""),format.raw/*129.72*/("""}"""),format.raw/*129.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*130.44*/("""{"""),format.raw/*130.45*/("""{"""),format.raw/*130.46*/(""" result.RelativeHumidity """),format.raw/*130.71*/("""}"""),format.raw/*130.72*/("""}"""),format.raw/*130.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*134.24*/routes/*134.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*134.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*140.78*/("""{"""),format.raw/*140.79*/("""{"""),format.raw/*140.80*/("""result.metric.Value"""),format.raw/*140.99*/("""}"""),format.raw/*140.100*/("""}"""),format.raw/*140.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*141.83*/("""{"""),format.raw/*141.84*/("""{"""),format.raw/*141.85*/("""result.imperial.Value"""),format.raw/*141.106*/("""}"""),format.raw/*141.107*/("""}"""),format.raw/*141.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*148.29*/routes/*148.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*148.74*/("""" alt="">"""),format.raw/*148.83*/("""{"""),format.raw/*148.84*/("""{"""),format.raw/*148.85*/("""result.PrecipitationProbability"""),format.raw/*148.116*/("""}"""),format.raw/*148.117*/("""}"""),format.raw/*148.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*149.29*/routes/*149.35*/.Assets.at("images/icon-wind.png"))),format.raw/*149.69*/("""" alt="">"""),format.raw/*149.78*/("""{"""),format.raw/*149.79*/("""{"""),format.raw/*149.80*/(""" result.WindSpeedMetric.Value """),format.raw/*149.110*/("""}"""),format.raw/*149.111*/("""}"""),format.raw/*149.112*/(""" km/h / """),format.raw/*149.120*/("""{"""),format.raw/*149.121*/("""{"""),format.raw/*149.122*/(""" result.WindSpeedImperial.Value """),format.raw/*149.154*/("""}"""),format.raw/*149.155*/("""}"""),format.raw/*149.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*150.29*/routes/*150.35*/.Assets.at("images/icon-compass.png"))),format.raw/*150.72*/("""" alt="">"""),format.raw/*150.81*/("""{"""),format.raw/*150.82*/("""{"""),format.raw/*150.83*/(""" result.WindDirectionEnglish """),format.raw/*150.112*/("""}"""),format.raw/*150.113*/("""}"""),format.raw/*150.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*152.58*/("""{"""),format.raw/*152.59*/("""{"""),format.raw/*152.60*/(""" result.MobileLink """),format.raw/*152.79*/("""}"""),format.raw/*152.80*/("""}"""),format.raw/*152.81*/("""">"""),format.raw/*152.83*/("""{"""),format.raw/*152.84*/("""{"""),format.raw/*152.85*/(""" result.MobileLink """),format.raw/*152.104*/("""}"""),format.raw/*152.105*/("""}"""),format.raw/*152.106*/("""</a></div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix" style="height: 20px;"><br/></div>
					</div>
					
					
					<div class="margin-left: 0px;">
						<h1>WEATHER BY ZIP CODES</h1>
					</div>
					<br />
					<br />
					<br />
					<br />
					<br />
					
					
					<div ng-repeat="result in processedData" style="padding-top: 40px;" >



						<div class="forecast-table">
							<div class="container">
								<div class="forecast-container">
									<div class="today forecast">
										<div class="forecast-header">
											<div class="day">Time of Observation</div>
											<div class="date">"""),format.raw/*182.30*/("""{"""),format.raw/*182.31*/("""{"""),format.raw/*182.32*/(""" result.LocalObservationDateTime """),format.raw/*182.65*/("""}"""),format.raw/*182.66*/("""}"""),format.raw/*182.67*/("""</div>
										</div>
										<br/> 
										
										<!-- .forecast-header -->
										<div class="" style="float: right; padding-right:10px;">
								      			C
								      			<input type="radio" name="temp" ng-model="temp" value="c">
								      		
								      		
								      			<input type="radio" name="temp" ng-model="temp" value="f">
								      			F
							      			
										</div>
										<div class="forecast-content">
											<div class="location">"""),format.raw/*197.34*/("""{"""),format.raw/*197.35*/("""{"""),format.raw/*197.36*/(""" result.name """),format.raw/*197.49*/("""}"""),format.raw/*197.50*/("""}"""),format.raw/*197.51*/("""</div>
											<div class="location">Mostly """),format.raw/*198.41*/("""{"""),format.raw/*198.42*/("""{"""),format.raw/*198.43*/(""" result.WeatherText """),format.raw/*198.63*/("""}"""),format.raw/*198.64*/("""}"""),format.raw/*198.65*/("""</div>
											<div class="location">Feels like: """),format.raw/*199.46*/("""{"""),format.raw/*199.47*/("""{"""),format.raw/*199.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*199.78*/("""}"""),format.raw/*199.79*/("""}"""),format.raw/*199.80*/(""" C | """),format.raw/*199.85*/("""{"""),format.raw/*199.86*/("""{"""),format.raw/*199.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*199.119*/("""}"""),format.raw/*199.120*/("""}"""),format.raw/*199.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*200.46*/("""{"""),format.raw/*200.47*/("""{"""),format.raw/*200.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*200.89*/("""}"""),format.raw/*200.90*/("""}"""),format.raw/*200.91*/(""" C | """),format.raw/*200.96*/("""{"""),format.raw/*200.97*/("""{"""),format.raw/*200.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*200.141*/("""}"""),format.raw/*200.142*/("""}"""),format.raw/*200.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*201.44*/("""{"""),format.raw/*201.45*/("""{"""),format.raw/*201.46*/(""" result.HasPrecipitationString """),format.raw/*201.77*/("""}"""),format.raw/*201.78*/("""}"""),format.raw/*201.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*202.45*/("""{"""),format.raw/*202.46*/("""{"""),format.raw/*202.47*/(""" result.IsDayTimeString """),format.raw/*202.71*/("""}"""),format.raw/*202.72*/("""}"""),format.raw/*202.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*203.44*/("""{"""),format.raw/*203.45*/("""{"""),format.raw/*203.46*/(""" result.RelativeHumidity """),format.raw/*203.71*/("""}"""),format.raw/*203.72*/("""}"""),format.raw/*203.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*207.24*/routes/*207.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*207.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*213.78*/("""{"""),format.raw/*213.79*/("""{"""),format.raw/*213.80*/("""result.metric.Value"""),format.raw/*213.99*/("""}"""),format.raw/*213.100*/("""}"""),format.raw/*213.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*214.83*/("""{"""),format.raw/*214.84*/("""{"""),format.raw/*214.85*/("""result.imperial.Value"""),format.raw/*214.106*/("""}"""),format.raw/*214.107*/("""}"""),format.raw/*214.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*221.29*/routes/*221.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*221.74*/("""" alt="">"""),format.raw/*221.83*/("""{"""),format.raw/*221.84*/("""{"""),format.raw/*221.85*/("""result.PrecipitationProbability"""),format.raw/*221.116*/("""}"""),format.raw/*221.117*/("""}"""),format.raw/*221.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*222.29*/routes/*222.35*/.Assets.at("images/icon-wind.png"))),format.raw/*222.69*/("""" alt="">"""),format.raw/*222.78*/("""{"""),format.raw/*222.79*/("""{"""),format.raw/*222.80*/(""" result.WindSpeedMetric.Value """),format.raw/*222.110*/("""}"""),format.raw/*222.111*/("""}"""),format.raw/*222.112*/(""" km/h / """),format.raw/*222.120*/("""{"""),format.raw/*222.121*/("""{"""),format.raw/*222.122*/(""" result.WindSpeedImperial.Value """),format.raw/*222.154*/("""}"""),format.raw/*222.155*/("""}"""),format.raw/*222.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*223.29*/routes/*223.35*/.Assets.at("images/icon-compass.png"))),format.raw/*223.72*/("""" alt="">"""),format.raw/*223.81*/("""{"""),format.raw/*223.82*/("""{"""),format.raw/*223.83*/(""" result.WindDirectionEnglish """),format.raw/*223.112*/("""}"""),format.raw/*223.113*/("""}"""),format.raw/*223.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*225.58*/("""{"""),format.raw/*225.59*/("""{"""),format.raw/*225.60*/(""" result.MobileLink """),format.raw/*225.79*/("""}"""),format.raw/*225.80*/("""}"""),format.raw/*225.81*/("""">"""),format.raw/*225.83*/("""{"""),format.raw/*225.84*/("""{"""),format.raw/*225.85*/(""" result.MobileLink """),format.raw/*225.104*/("""}"""),format.raw/*225.105*/("""}"""),format.raw/*225.106*/("""</a></div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix" style="height: 20px;"><br/></div>
					</div>
					<!--
					<h1>Forecast JSON Response</h1>
					<pre>"""),format.raw/*235.11*/("""{"""),format.raw/*235.12*/("""{"""),format.raw/*235.13*/("""forecast | json"""),format.raw/*235.28*/("""}"""),format.raw/*235.29*/("""}"""),format.raw/*235.30*/("""</pre>
					-->
					<h1>ACCUWEATHER JSON RESPONSE</h1> 
					<pre>"""),format.raw/*238.11*/("""{"""),format.raw/*238.12*/("""{"""),format.raw/*238.13*/("""processedData | json"""),format.raw/*238.33*/("""}"""),format.raw/*238.34*/("""}"""),format.raw/*238.35*/("""</pre>
					<br />
					<br />
					<br />
					<br />
					<br />
					<h1>TABLE JSON RESPONSE</h1> 
					<table class="table table-bordered table-striped table-dark " style="max-width: 100%;" width="100%">
						<thead>
				  			<tr>
							    <th scope="col">City</th>
							    <th scope="col">
							      Temp | C
							      <input type="radio" name="temp" ng-model="temp" value="c"> 
							      <input type="radio" name="temp" ng-model="temp" value="f">
							      F
								</th>
								<th scope="col">
									Weather Information
								</th>
								<th scope="col">
									Is it Day Time?
								</th>
								<th scope="col">
									Is it raining?
								</th>
								<th scope="col">
									Is it raining (string)?
								</th>
								<th scope="col">
									Time of Observation
								</th>
								<th scope="col">
									Accuweather Link
								</th>
						  	</tr>
						</thead>
						
						<tbody>
						  <tr ng-repeat="result in processedData" ng-class=""""),format.raw/*277.59*/("""{"""),format.raw/*277.60*/("""'text-danger': result.error"""),format.raw/*277.87*/("""}"""),format.raw/*277.88*/("""">
							
						    <td>
						      """),format.raw/*280.13*/("""{"""),format.raw/*280.14*/("""{"""),format.raw/*280.15*/(""" result.name """),format.raw/*280.28*/("""}"""),format.raw/*280.29*/("""}"""),format.raw/*280.30*/("""
						    </td>
						    <td>
						      <span ng-show="temp == 'c'">"""),format.raw/*283.41*/("""{"""),format.raw/*283.42*/("""{"""),format.raw/*283.43*/("""result.metric.Value"""),format.raw/*283.62*/("""}"""),format.raw/*283.63*/("""}"""),format.raw/*283.64*/(""" C</span>
						      <span ng-show="temp == 'f'">"""),format.raw/*284.41*/("""{"""),format.raw/*284.42*/("""{"""),format.raw/*284.43*/("""result.imperial.Value"""),format.raw/*284.64*/("""}"""),format.raw/*284.65*/("""}"""),format.raw/*284.66*/(""" F</span>
							</td>
							<td>
								"""),format.raw/*287.9*/("""{"""),format.raw/*287.10*/("""{"""),format.raw/*287.11*/(""" result.WeatherText """),format.raw/*287.31*/("""}"""),format.raw/*287.32*/("""}"""),format.raw/*287.33*/("""
							</td>
							<td>
								"""),format.raw/*290.9*/("""{"""),format.raw/*290.10*/("""{"""),format.raw/*290.11*/(""" result.IsDayTime """),format.raw/*290.29*/("""}"""),format.raw/*290.30*/("""}"""),format.raw/*290.31*/("""
							</td>
							<td>
								"""),format.raw/*293.9*/("""{"""),format.raw/*293.10*/("""{"""),format.raw/*293.11*/(""" result.HasPrecipitation """),format.raw/*293.36*/("""}"""),format.raw/*293.37*/("""}"""),format.raw/*293.38*/("""
							</td>
							<td>
								"""),format.raw/*296.9*/("""{"""),format.raw/*296.10*/("""{"""),format.raw/*296.11*/(""" result.HasPrecipitationString """),format.raw/*296.42*/("""}"""),format.raw/*296.43*/("""}"""),format.raw/*296.44*/("""
							</td>
							<td>
								"""),format.raw/*299.9*/("""{"""),format.raw/*299.10*/("""{"""),format.raw/*299.11*/(""" result.LocalObservationDateTime """),format.raw/*299.44*/("""}"""),format.raw/*299.45*/("""}"""),format.raw/*299.46*/("""
							</td>
							<td style="word-break: break-all;">
								<span style="max-width:100%;">
									<a target="_blank" href=""""),format.raw/*303.35*/("""{"""),format.raw/*303.36*/("""{"""),format.raw/*303.37*/(""" result.MobileLink """),format.raw/*303.56*/("""}"""),format.raw/*303.57*/("""}"""),format.raw/*303.58*/("""">"""),format.raw/*303.60*/("""{"""),format.raw/*303.61*/("""{"""),format.raw/*303.62*/(""" result.MobileLink """),format.raw/*303.81*/("""}"""),format.raw/*303.82*/("""}"""),format.raw/*303.83*/("""</a>
								</span>
							</td>
							
						  </tr>

						</tbody>
					</table>
				</div>	
				
				<!-- Testing JSON GET request -->
				<!-- 	 				
	 				<div data-ng-controller="FetchController">
	 					<div class="weather-search">
						    <div class="row">
						        <div class="col-xs-12">
						            <div>
						                <form class="form-inline" role="form">
						                    <span style="width: 75%;" class="form-group">
						                        <label class="sr-only" for="zipcode">ZipCode</label>
						                        <input data-ng-model="url" type="text" class="form-control" id="zipcode" size="80" placeholder="ZipCode">
						                    </span>
						                    <button style="width: 20%; min-width: 80px;" data-ng-click="fetch()" type="submit" class="btn btn-primary">Search!</button>
						                    <span data-ng-show="message" class="alert"><span class="glyphicon glyphicon-arrow-left">&nbsp;</span>"""),format.raw/*326.128*/("""{"""),format.raw/*326.129*/("""{"""),format.raw/*326.130*/("""message"""),format.raw/*326.137*/("""}"""),format.raw/*326.138*/("""}"""),format.raw/*326.139*/("""</span>
						                </form>
						                <br />
								      	<br />
								      	<pre>http status code: """),format.raw/*330.39*/("""{"""),format.raw/*330.40*/("""{"""),format.raw/*330.41*/("""status"""),format.raw/*330.47*/("""}"""),format.raw/*330.48*/("""}"""),format.raw/*330.49*/("""</pre>
								      	<pre>http response data: """),format.raw/*331.41*/("""{"""),format.raw/*331.42*/("""{"""),format.raw/*331.43*/("""data"""),format.raw/*331.47*/("""}"""),format.raw/*331.48*/("""}"""),format.raw/*331.49*/("""</pre>
						            </div>
						        </div>
						    </div>
						</div>
				    </div>
				  -->				
	 				
	 			</div>
	 		</div>
	 	</div>
	 	<!-- Footer ================================================== -->
	 	<footer class="footer">
	 		<div class="container">
 				<p>Designed &amp; developed by <a href="http://twitter.com/tajunker" target="_blank">@tajunker</a>.</p>
 				<p>SimpleWeather uses <a href="http://www.playframework.com" target="_blank">Play!</a>, <a href="http://angularjs.org" target="_blank">AngualarJS</a>, and <a href="http://getbootstrap.com" target="_blank">Twitter Bootstrap</a>.</p>
 				<p>Deployed to <a href="https://www.heroku.com/" target="_blank">Heroku's</a> cloud computing web application hosting platform.</p>
 				<p>termal uses <a href="http://www.accuweather.com/" target="_blank">accuweather.com</a> API - The JSON Weather&#8482; API for Developers.</p>
 				<ul class="footer-links">
		        	<li><a target="_blank" href="http://www.linkedin.com/in/tajunker">LinkedIn</a></li>
		        	<li class="muted">&middot;</li>
		        	<li><a target="_blank" href="https://github.com/tajunker">GitHub</a></li>
		        	<li class="muted">&middot;</li>
		        	<li><a target="_blank" href="http://twitter.com/tajunker">Twitter</a></li>
		        </ul>
	 		</div>
	 	</footer>
	 	
	 	<!-- JavaScript ================================================== -->
	 	<!-- Placed at the end of the document so pages load faster -->
	 	<!-- Google Universal Analytics -->
	 	<!--
	 	<script>
		  (function(i,s,o,g,r,a,m)"""),format.raw/*364.29*/("""{"""),format.raw/*364.30*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*364.80*/("""{"""),format.raw/*364.81*/("""
		  (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*365.40*/("""}"""),format.raw/*365.41*/(""",i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  """),format.raw/*367.5*/("""}"""),format.raw/*367.6*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-46957200-1', 'sleepy-garden-8606.herokuapp.com');
		  ga('send', 'pageview');
		
		</script>
		-->
	 	<script src=""""),_display_(Seq[Any](/*374.18*/routes/*374.24*/.Assets.at("third/jquery/jquery-1.10.2.min.js"))),format.raw/*374.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*375.17*/routes/*375.23*/.Assets.at("third/bootstrap/js/bootstrap.js"))),format.raw/*375.68*/("""" type="text/javascript"></script>
		
		
		<script src="http://cdnjs.cloudflare.com/ajax/libs/lodash.js/2.4.1/lodash.js" type="text/javascript"></script>
		
	 </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Dec 07 11:21:43 EST 2019
                    SOURCE: /Users/tajunker/Computer Engineering IUPUI/CSCI 240/Homework/termal/app/views/index.scala.html
                    HASH: fcdddcfcd3ec46b8f594105560777907c694e1b1
                    MATRIX: 855->0|1337->446|1352->452|1422->499|1511->552|1526->558|1607->616|1696->669|1711->675|1775->717|1864->770|1879->776|1968->842|2054->892|2069->898|2145->951|2231->1001|2246->1007|2302->1041|2393->1096|2408->1102|2462->1134|2518->1154|2533->1160|2599->1204|2686->1255|2701->1261|2776->1314|2863->1365|2878->1371|2933->1404|3976->2411|3991->2417|4061->2464|6138->4513|6167->4514|6196->4515|6226->4517|6255->4518|6284->4519|6747->4953|6777->4954|6807->4955|6869->4988|6899->4989|6929->4990|7082->5114|7112->5115|7142->5116|7173->5118|7203->5119|7233->5120|7735->5593|7765->5594|7795->5595|7837->5608|7867->5609|7897->5610|7973->5657|8003->5658|8033->5659|8082->5679|8112->5680|8142->5681|8235->5745|8265->5746|8295->5747|8354->5777|8384->5778|8414->5779|8448->5784|8478->5785|8508->5786|8570->5818|8601->5819|8632->5820|8715->5874|8745->5875|8775->5876|8845->5917|8875->5918|8905->5919|8939->5924|8969->5925|8999->5926|9072->5969|9103->5970|9134->5971|9215->6023|9245->6024|9275->6025|9335->6056|9365->6057|9395->6058|9475->6109|9505->6110|9535->6111|9588->6135|9618->6136|9648->6137|9727->6187|9757->6188|9787->6189|9841->6214|9871->6215|9901->6216|10072->6350|10088->6356|10148->6393|10486->6702|10516->6703|10546->6704|10594->6723|10625->6724|10656->6725|10788->6828|10818->6829|10848->6830|10899->6851|10930->6852|10961->6853|11150->7005|11166->7011|11228->7050|11266->7059|11296->7060|11326->7061|11387->7092|11418->7093|11449->7094|11523->7131|11539->7137|11596->7171|11634->7180|11664->7181|11694->7182|11754->7212|11785->7213|11816->7214|11854->7222|11885->7223|11916->7224|11978->7256|12009->7257|12040->7258|12119->7300|12135->7306|12195->7343|12233->7352|12263->7353|12293->7354|12352->7383|12383->7384|12414->7385|12520->7462|12550->7463|12580->7464|12628->7483|12658->7484|12688->7485|12719->7487|12749->7488|12779->7489|12828->7508|12859->7509|12890->7510|13594->8185|13624->8186|13654->8187|13716->8220|13746->8221|13776->8222|14292->8709|14322->8710|14352->8711|14394->8724|14424->8725|14454->8726|14530->8773|14560->8774|14590->8775|14639->8795|14669->8796|14699->8797|14780->8849|14810->8850|14840->8851|14899->8881|14929->8882|14959->8883|14993->8888|15023->8889|15053->8890|15115->8922|15146->8923|15177->8924|15260->8978|15290->8979|15320->8980|15390->9021|15420->9022|15450->9023|15484->9028|15514->9029|15544->9030|15617->9073|15648->9074|15679->9075|15760->9127|15790->9128|15820->9129|15880->9160|15910->9161|15940->9162|16020->9213|16050->9214|16080->9215|16133->9239|16163->9240|16193->9241|16272->9291|16302->9292|16332->9293|16386->9318|16416->9319|16446->9320|16617->9454|16633->9460|16693->9497|17031->9806|17061->9807|17091->9808|17139->9827|17170->9828|17201->9829|17333->9932|17363->9933|17393->9934|17444->9955|17475->9956|17506->9957|17695->10109|17711->10115|17773->10154|17811->10163|17841->10164|17871->10165|17932->10196|17963->10197|17994->10198|18068->10235|18084->10241|18141->10275|18179->10284|18209->10285|18239->10286|18299->10316|18330->10317|18361->10318|18399->10326|18430->10327|18461->10328|18523->10360|18554->10361|18585->10362|18664->10404|18680->10410|18740->10447|18778->10456|18808->10457|18838->10458|18897->10487|18928->10488|18959->10489|19065->10566|19095->10567|19125->10568|19173->10587|19203->10588|19233->10589|19264->10591|19294->10592|19324->10593|19373->10612|19404->10613|19435->10614|19681->10831|19711->10832|19741->10833|19785->10848|19815->10849|19845->10850|19941->10917|19971->10918|20001->10919|20050->10939|20080->10940|20110->10941|21145->11947|21175->11948|21231->11975|21261->11976|21328->12014|21358->12015|21388->12016|21430->12029|21460->12030|21490->12031|21591->12103|21621->12104|21651->12105|21699->12124|21729->12125|21759->12126|21838->12176|21868->12177|21898->12178|21948->12199|21978->12200|22008->12201|22079->12244|22109->12245|22139->12246|22188->12266|22218->12267|22248->12268|22310->12302|22340->12303|22370->12304|22417->12322|22447->12323|22477->12324|22539->12358|22569->12359|22599->12360|22653->12385|22683->12386|22713->12387|22775->12421|22805->12422|22835->12423|22895->12454|22925->12455|22955->12456|23017->12490|23047->12491|23077->12492|23139->12525|23169->12526|23199->12527|23358->12657|23388->12658|23418->12659|23466->12678|23496->12679|23526->12680|23557->12682|23587->12683|23617->12684|23665->12703|23695->12704|23725->12705|24750->13700|24781->13701|24812->13702|24849->13709|24880->13710|24911->13711|25067->13838|25097->13839|25127->13840|25162->13846|25192->13847|25222->13848|25298->13895|25328->13896|25358->13897|25391->13901|25421->13902|25451->13903|27043->15467|27073->15468|27152->15518|27182->15519|27251->15559|27281->15560|27440->15691|27469->15692|27722->15908|27738->15914|27808->15961|27896->16012|27912->16018|27980->16063
                    LINES: 29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|68->40|68->40|68->40|117->89|117->89|117->89|117->89|117->89|117->89|133->105|133->105|133->105|133->105|133->105|133->105|136->108|136->108|136->108|136->108|136->108|136->108|151->123|151->123|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|152->124|152->124|154->126|154->126|154->126|154->126|154->126|154->126|154->126|154->126|154->126|154->126|154->126|154->126|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|156->128|156->128|156->128|156->128|156->128|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|158->130|158->130|158->130|162->134|162->134|162->134|168->140|168->140|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|169->141|169->141|176->148|176->148|176->148|176->148|176->148|176->148|176->148|176->148|176->148|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|180->152|180->152|180->152|180->152|180->152|180->152|180->152|180->152|180->152|180->152|180->152|180->152|210->182|210->182|210->182|210->182|210->182|210->182|225->197|225->197|225->197|225->197|225->197|225->197|226->198|226->198|226->198|226->198|226->198|226->198|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|229->201|229->201|229->201|229->201|229->201|229->201|230->202|230->202|230->202|230->202|230->202|230->202|231->203|231->203|231->203|231->203|231->203|231->203|235->207|235->207|235->207|241->213|241->213|241->213|241->213|241->213|241->213|242->214|242->214|242->214|242->214|242->214|242->214|249->221|249->221|249->221|249->221|249->221|249->221|249->221|249->221|249->221|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|253->225|253->225|253->225|253->225|253->225|253->225|253->225|253->225|253->225|253->225|253->225|253->225|263->235|263->235|263->235|263->235|263->235|263->235|266->238|266->238|266->238|266->238|266->238|266->238|305->277|305->277|305->277|305->277|308->280|308->280|308->280|308->280|308->280|308->280|311->283|311->283|311->283|311->283|311->283|311->283|312->284|312->284|312->284|312->284|312->284|312->284|315->287|315->287|315->287|315->287|315->287|315->287|318->290|318->290|318->290|318->290|318->290|318->290|321->293|321->293|321->293|321->293|321->293|321->293|324->296|324->296|324->296|324->296|324->296|324->296|327->299|327->299|327->299|327->299|327->299|327->299|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|331->303|354->326|354->326|354->326|354->326|354->326|354->326|358->330|358->330|358->330|358->330|358->330|358->330|359->331|359->331|359->331|359->331|359->331|359->331|392->364|392->364|392->364|392->364|393->365|393->365|395->367|395->367|402->374|402->374|402->374|403->375|403->375|403->375
                    -- GENERATED --
                */
            