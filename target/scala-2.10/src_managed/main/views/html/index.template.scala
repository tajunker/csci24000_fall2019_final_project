
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
		                	<li class=""><a href="/documentation">Documentation</a></li>
		                	<li class=""><a target="_blank" href=""""),_display_(Seq[Any](/*41.59*/routes/*41.65*/.Assets.at("pdf/Termal_UMLDiagram.pdf"))),format.raw/*41.104*/("""">UML Diagram</a></li>
		                    <li class=""><a target="_blank" href=""""),_display_(Seq[Any](/*42.62*/routes/*42.68*/.Assets.at("pdf/Tercio-Agra-Junker-Resume-V3.pdf"))),format.raw/*42.118*/("""">Resume</a></li>
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
			    <h1>Termal</h1>
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

					

				</div>
				
				<div class="span12 column col-md-12">
					<div class="margin-left: 0px;">
						<h1>IP ADDRESS """),format.raw/*89.22*/("""{"""),format.raw/*89.23*/("""{"""),format.raw/*89.24*/("""ip"""),format.raw/*89.26*/("""}"""),format.raw/*89.27*/("""}"""),format.raw/*89.28*/("""</h1>
						<div class="location"></div>
					</div>
					<br />
					<br />
					
					<div ng-repeat="result in processedDataIP" style="padding-top: 40px;" >
						<br />
						<br />
						<br />
						<br />
						<div class="forecast-table">
							<div class="container">
								<div class="forecast-container">
									<div class="today forecast">
										<div class="forecast-header">
											<div class="day">Time of Observation</div>
											<div class="date">"""),format.raw/*106.30*/("""{"""),format.raw/*106.31*/("""{"""),format.raw/*106.32*/(""" result.LocalObservationDateTime """),format.raw/*106.65*/("""}"""),format.raw/*106.66*/("""}"""),format.raw/*106.67*/("""</div>
										</div>
										<br/> 
										<div class="location" style="float:left; padding-left:20px;">IP Address: """),format.raw/*109.84*/("""{"""),format.raw/*109.85*/("""{"""),format.raw/*109.86*/("""ip"""),format.raw/*109.88*/("""}"""),format.raw/*109.89*/("""}"""),format.raw/*109.90*/("""</div>
										<!-- .forecast-header -->
										<div class="" style="float: right; padding-right:20px;">

								      			C
								      			<input type="radio" name="temp" ng-model="temp" value="c">
								      			
								      		
								      			<input type="radio" name="temp" ng-model="temp" value="f">
								      			F
							      			
										</div>
										<br />
										<div class="forecast-content">
											
											<div class="location">"""),format.raw/*124.34*/("""{"""),format.raw/*124.35*/("""{"""),format.raw/*124.36*/(""" result.name """),format.raw/*124.49*/("""}"""),format.raw/*124.50*/("""}"""),format.raw/*124.51*/("""</div>
											<div class="location">Mostly """),format.raw/*125.41*/("""{"""),format.raw/*125.42*/("""{"""),format.raw/*125.43*/(""" result.WeatherText """),format.raw/*125.63*/("""}"""),format.raw/*125.64*/("""}"""),format.raw/*125.65*/("""</div>
											
											<div class="location">Feels like: """),format.raw/*127.46*/("""{"""),format.raw/*127.47*/("""{"""),format.raw/*127.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*127.78*/("""}"""),format.raw/*127.79*/("""}"""),format.raw/*127.80*/(""" C | """),format.raw/*127.85*/("""{"""),format.raw/*127.86*/("""{"""),format.raw/*127.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*127.119*/("""}"""),format.raw/*127.120*/("""}"""),format.raw/*127.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*128.46*/("""{"""),format.raw/*128.47*/("""{"""),format.raw/*128.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*128.89*/("""}"""),format.raw/*128.90*/("""}"""),format.raw/*128.91*/(""" C | """),format.raw/*128.96*/("""{"""),format.raw/*128.97*/("""{"""),format.raw/*128.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*128.141*/("""}"""),format.raw/*128.142*/("""}"""),format.raw/*128.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*129.44*/("""{"""),format.raw/*129.45*/("""{"""),format.raw/*129.46*/(""" result.HasPrecipitationString """),format.raw/*129.77*/("""}"""),format.raw/*129.78*/("""}"""),format.raw/*129.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*130.45*/("""{"""),format.raw/*130.46*/("""{"""),format.raw/*130.47*/(""" result.IsDayTimeString """),format.raw/*130.71*/("""}"""),format.raw/*130.72*/("""}"""),format.raw/*130.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*131.44*/("""{"""),format.raw/*131.45*/("""{"""),format.raw/*131.46*/(""" result.RelativeHumidity """),format.raw/*131.71*/("""}"""),format.raw/*131.72*/("""}"""),format.raw/*131.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*135.24*/routes/*135.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*135.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*141.78*/("""{"""),format.raw/*141.79*/("""{"""),format.raw/*141.80*/("""result.metric.Value"""),format.raw/*141.99*/("""}"""),format.raw/*141.100*/("""}"""),format.raw/*141.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*142.83*/("""{"""),format.raw/*142.84*/("""{"""),format.raw/*142.85*/("""result.imperial.Value"""),format.raw/*142.106*/("""}"""),format.raw/*142.107*/("""}"""),format.raw/*142.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*149.29*/routes/*149.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*149.74*/("""" alt="">"""),format.raw/*149.83*/("""{"""),format.raw/*149.84*/("""{"""),format.raw/*149.85*/("""result.PrecipitationProbability"""),format.raw/*149.116*/("""}"""),format.raw/*149.117*/("""}"""),format.raw/*149.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*150.29*/routes/*150.35*/.Assets.at("images/icon-wind.png"))),format.raw/*150.69*/("""" alt="">"""),format.raw/*150.78*/("""{"""),format.raw/*150.79*/("""{"""),format.raw/*150.80*/(""" result.WindSpeedMetric.Value """),format.raw/*150.110*/("""}"""),format.raw/*150.111*/("""}"""),format.raw/*150.112*/(""" km/h / """),format.raw/*150.120*/("""{"""),format.raw/*150.121*/("""{"""),format.raw/*150.122*/(""" result.WindSpeedImperial.Value """),format.raw/*150.154*/("""}"""),format.raw/*150.155*/("""}"""),format.raw/*150.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*151.29*/routes/*151.35*/.Assets.at("images/icon-compass.png"))),format.raw/*151.72*/("""" alt="">"""),format.raw/*151.81*/("""{"""),format.raw/*151.82*/("""{"""),format.raw/*151.83*/(""" result.WindDirectionEnglish """),format.raw/*151.112*/("""}"""),format.raw/*151.113*/("""}"""),format.raw/*151.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*153.58*/("""{"""),format.raw/*153.59*/("""{"""),format.raw/*153.60*/(""" result.MobileLink """),format.raw/*153.79*/("""}"""),format.raw/*153.80*/("""}"""),format.raw/*153.81*/("""">"""),format.raw/*153.83*/("""{"""),format.raw/*153.84*/("""{"""),format.raw/*153.85*/(""" result.MobileLink """),format.raw/*153.104*/("""}"""),format.raw/*153.105*/("""}"""),format.raw/*153.106*/("""</a></div>
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
											<div class="date">"""),format.raw/*183.30*/("""{"""),format.raw/*183.31*/("""{"""),format.raw/*183.32*/(""" result.LocalObservationDateTime """),format.raw/*183.65*/("""}"""),format.raw/*183.66*/("""}"""),format.raw/*183.67*/("""</div>
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
											<div class="location">"""),format.raw/*198.34*/("""{"""),format.raw/*198.35*/("""{"""),format.raw/*198.36*/(""" result.name """),format.raw/*198.49*/("""}"""),format.raw/*198.50*/("""}"""),format.raw/*198.51*/("""</div>
											<div class="location">Mostly """),format.raw/*199.41*/("""{"""),format.raw/*199.42*/("""{"""),format.raw/*199.43*/(""" result.WeatherText """),format.raw/*199.63*/("""}"""),format.raw/*199.64*/("""}"""),format.raw/*199.65*/("""</div>
											<div class="location">Feels like: """),format.raw/*200.46*/("""{"""),format.raw/*200.47*/("""{"""),format.raw/*200.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*200.78*/("""}"""),format.raw/*200.79*/("""}"""),format.raw/*200.80*/(""" C | """),format.raw/*200.85*/("""{"""),format.raw/*200.86*/("""{"""),format.raw/*200.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*200.119*/("""}"""),format.raw/*200.120*/("""}"""),format.raw/*200.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*201.46*/("""{"""),format.raw/*201.47*/("""{"""),format.raw/*201.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*201.89*/("""}"""),format.raw/*201.90*/("""}"""),format.raw/*201.91*/(""" C | """),format.raw/*201.96*/("""{"""),format.raw/*201.97*/("""{"""),format.raw/*201.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*201.141*/("""}"""),format.raw/*201.142*/("""}"""),format.raw/*201.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*202.44*/("""{"""),format.raw/*202.45*/("""{"""),format.raw/*202.46*/(""" result.HasPrecipitationString """),format.raw/*202.77*/("""}"""),format.raw/*202.78*/("""}"""),format.raw/*202.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*203.45*/("""{"""),format.raw/*203.46*/("""{"""),format.raw/*203.47*/(""" result.IsDayTimeString """),format.raw/*203.71*/("""}"""),format.raw/*203.72*/("""}"""),format.raw/*203.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*204.44*/("""{"""),format.raw/*204.45*/("""{"""),format.raw/*204.46*/(""" result.RelativeHumidity """),format.raw/*204.71*/("""}"""),format.raw/*204.72*/("""}"""),format.raw/*204.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*208.24*/routes/*208.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*208.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*214.78*/("""{"""),format.raw/*214.79*/("""{"""),format.raw/*214.80*/("""result.metric.Value"""),format.raw/*214.99*/("""}"""),format.raw/*214.100*/("""}"""),format.raw/*214.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*215.83*/("""{"""),format.raw/*215.84*/("""{"""),format.raw/*215.85*/("""result.imperial.Value"""),format.raw/*215.106*/("""}"""),format.raw/*215.107*/("""}"""),format.raw/*215.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*222.29*/routes/*222.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*222.74*/("""" alt="">"""),format.raw/*222.83*/("""{"""),format.raw/*222.84*/("""{"""),format.raw/*222.85*/("""result.PrecipitationProbability"""),format.raw/*222.116*/("""}"""),format.raw/*222.117*/("""}"""),format.raw/*222.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*223.29*/routes/*223.35*/.Assets.at("images/icon-wind.png"))),format.raw/*223.69*/("""" alt="">"""),format.raw/*223.78*/("""{"""),format.raw/*223.79*/("""{"""),format.raw/*223.80*/(""" result.WindSpeedMetric.Value """),format.raw/*223.110*/("""}"""),format.raw/*223.111*/("""}"""),format.raw/*223.112*/(""" km/h / """),format.raw/*223.120*/("""{"""),format.raw/*223.121*/("""{"""),format.raw/*223.122*/(""" result.WindSpeedImperial.Value """),format.raw/*223.154*/("""}"""),format.raw/*223.155*/("""}"""),format.raw/*223.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*224.29*/routes/*224.35*/.Assets.at("images/icon-compass.png"))),format.raw/*224.72*/("""" alt="">"""),format.raw/*224.81*/("""{"""),format.raw/*224.82*/("""{"""),format.raw/*224.83*/(""" result.WindDirectionEnglish """),format.raw/*224.112*/("""}"""),format.raw/*224.113*/("""}"""),format.raw/*224.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*226.58*/("""{"""),format.raw/*226.59*/("""{"""),format.raw/*226.60*/(""" result.MobileLink """),format.raw/*226.79*/("""}"""),format.raw/*226.80*/("""}"""),format.raw/*226.81*/("""">"""),format.raw/*226.83*/("""{"""),format.raw/*226.84*/("""{"""),format.raw/*226.85*/(""" result.MobileLink """),format.raw/*226.104*/("""}"""),format.raw/*226.105*/("""}"""),format.raw/*226.106*/("""</a></div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix" style="height: 20px;"><br/></div>
					</div>
					<!--
					<h1>Forecast JSON Response</h1>
					<pre>"""),format.raw/*236.11*/("""{"""),format.raw/*236.12*/("""{"""),format.raw/*236.13*/("""forecast | json"""),format.raw/*236.28*/("""}"""),format.raw/*236.29*/("""}"""),format.raw/*236.30*/("""</pre>
					-->
					<h1>ACCUWEATHER JSON RESPONSE</h1> 
					<pre>"""),format.raw/*239.11*/("""{"""),format.raw/*239.12*/("""{"""),format.raw/*239.13*/("""processedData | json"""),format.raw/*239.33*/("""}"""),format.raw/*239.34*/("""}"""),format.raw/*239.35*/("""</pre>
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
						  <tr ng-repeat="result in processedData" ng-class=""""),format.raw/*278.59*/("""{"""),format.raw/*278.60*/("""'text-danger': result.error"""),format.raw/*278.87*/("""}"""),format.raw/*278.88*/("""">
							
						    <td>
						      """),format.raw/*281.13*/("""{"""),format.raw/*281.14*/("""{"""),format.raw/*281.15*/(""" result.name """),format.raw/*281.28*/("""}"""),format.raw/*281.29*/("""}"""),format.raw/*281.30*/("""
						    </td>
						    <td>
						      <span ng-show="temp == 'c'">"""),format.raw/*284.41*/("""{"""),format.raw/*284.42*/("""{"""),format.raw/*284.43*/("""result.metric.Value"""),format.raw/*284.62*/("""}"""),format.raw/*284.63*/("""}"""),format.raw/*284.64*/(""" C</span>
						      <span ng-show="temp == 'f'">"""),format.raw/*285.41*/("""{"""),format.raw/*285.42*/("""{"""),format.raw/*285.43*/("""result.imperial.Value"""),format.raw/*285.64*/("""}"""),format.raw/*285.65*/("""}"""),format.raw/*285.66*/(""" F</span>
							</td>
							<td>
								"""),format.raw/*288.9*/("""{"""),format.raw/*288.10*/("""{"""),format.raw/*288.11*/(""" result.WeatherText """),format.raw/*288.31*/("""}"""),format.raw/*288.32*/("""}"""),format.raw/*288.33*/("""
							</td>
							<td>
								"""),format.raw/*291.9*/("""{"""),format.raw/*291.10*/("""{"""),format.raw/*291.11*/(""" result.IsDayTime """),format.raw/*291.29*/("""}"""),format.raw/*291.30*/("""}"""),format.raw/*291.31*/("""
							</td>
							<td>
								"""),format.raw/*294.9*/("""{"""),format.raw/*294.10*/("""{"""),format.raw/*294.11*/(""" result.HasPrecipitation """),format.raw/*294.36*/("""}"""),format.raw/*294.37*/("""}"""),format.raw/*294.38*/("""
							</td>
							<td>
								"""),format.raw/*297.9*/("""{"""),format.raw/*297.10*/("""{"""),format.raw/*297.11*/(""" result.HasPrecipitationString """),format.raw/*297.42*/("""}"""),format.raw/*297.43*/("""}"""),format.raw/*297.44*/("""
							</td>
							<td>
								"""),format.raw/*300.9*/("""{"""),format.raw/*300.10*/("""{"""),format.raw/*300.11*/(""" result.LocalObservationDateTime """),format.raw/*300.44*/("""}"""),format.raw/*300.45*/("""}"""),format.raw/*300.46*/("""
							</td>
							<td style="word-break: break-all;">
								<span style="max-width:100%;">
									<a target="_blank" href=""""),format.raw/*304.35*/("""{"""),format.raw/*304.36*/("""{"""),format.raw/*304.37*/(""" result.MobileLink """),format.raw/*304.56*/("""}"""),format.raw/*304.57*/("""}"""),format.raw/*304.58*/("""">"""),format.raw/*304.60*/("""{"""),format.raw/*304.61*/("""{"""),format.raw/*304.62*/(""" result.MobileLink """),format.raw/*304.81*/("""}"""),format.raw/*304.82*/("""}"""),format.raw/*304.83*/("""</a>
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
						                    <span data-ng-show="message" class="alert"><span class="glyphicon glyphicon-arrow-left">&nbsp;</span>"""),format.raw/*327.128*/("""{"""),format.raw/*327.129*/("""{"""),format.raw/*327.130*/("""message"""),format.raw/*327.137*/("""}"""),format.raw/*327.138*/("""}"""),format.raw/*327.139*/("""</span>
						                </form>
						                <br />
								      	<br />
								      	<pre>http status code: """),format.raw/*331.39*/("""{"""),format.raw/*331.40*/("""{"""),format.raw/*331.41*/("""status"""),format.raw/*331.47*/("""}"""),format.raw/*331.48*/("""}"""),format.raw/*331.49*/("""</pre>
								      	<pre>http response data: """),format.raw/*332.41*/("""{"""),format.raw/*332.42*/("""{"""),format.raw/*332.43*/("""data"""),format.raw/*332.47*/("""}"""),format.raw/*332.48*/("""}"""),format.raw/*332.49*/("""</pre>
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
		  (function(i,s,o,g,r,a,m)"""),format.raw/*365.29*/("""{"""),format.raw/*365.30*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*365.80*/("""{"""),format.raw/*365.81*/("""
		  (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*366.40*/("""}"""),format.raw/*366.41*/(""",i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  """),format.raw/*368.5*/("""}"""),format.raw/*368.6*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-46957200-1', 'sleepy-garden-8606.herokuapp.com');
		  ga('send', 'pageview');
		
		</script>
		-->
	 	<script src=""""),_display_(Seq[Any](/*375.18*/routes/*375.24*/.Assets.at("third/jquery/jquery-1.10.2.min.js"))),format.raw/*375.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*376.17*/routes/*376.23*/.Assets.at("third/bootstrap/js/bootstrap.js"))),format.raw/*376.68*/("""" type="text/javascript"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/2.4.1/lodash.js" type="text/javascript"></script>
		<!--
		<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/lodash.js/4.17.15/lodash.js.js"></script>
		-->
		<!--
		<script src="http://cdnjs.cloudflare.com/ajax/libs/lodash.js/2.4.1/lodash.js" type="text/javascript"></script>
		-->
	 </body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 09 14:42:10 EST 2019
                    SOURCE: /Users/tajunker/Computer Engineering IUPUI/CSCI 240/Homework/termal/app/views/index.scala.html
                    HASH: 1ac25c303d6c4ac06c2b1bed814e438bb674c76a
                    MATRIX: 855->0|1337->446|1352->452|1422->499|1511->552|1526->558|1607->616|1696->669|1711->675|1775->717|1864->770|1879->776|1968->842|2054->892|2069->898|2145->951|2231->1001|2246->1007|2302->1041|2393->1096|2408->1102|2462->1134|2518->1154|2533->1160|2599->1204|2686->1255|2701->1261|2776->1314|2863->1365|2878->1371|2933->1404|4053->2488|4068->2494|4130->2533|4250->2617|4265->2623|4338->2673|6355->4662|6384->4663|6413->4664|6443->4666|6472->4667|6501->4668|7010->5148|7040->5149|7070->5150|7132->5183|7162->5184|7192->5185|7345->5309|7375->5310|7405->5311|7436->5313|7466->5314|7496->5315|7998->5788|8028->5789|8058->5790|8100->5803|8130->5804|8160->5805|8236->5852|8266->5853|8296->5854|8345->5874|8375->5875|8405->5876|8498->5940|8528->5941|8558->5942|8617->5972|8647->5973|8677->5974|8711->5979|8741->5980|8771->5981|8833->6013|8864->6014|8895->6015|8978->6069|9008->6070|9038->6071|9108->6112|9138->6113|9168->6114|9202->6119|9232->6120|9262->6121|9335->6164|9366->6165|9397->6166|9478->6218|9508->6219|9538->6220|9598->6251|9628->6252|9658->6253|9738->6304|9768->6305|9798->6306|9851->6330|9881->6331|9911->6332|9990->6382|10020->6383|10050->6384|10104->6409|10134->6410|10164->6411|10335->6545|10351->6551|10411->6588|10749->6897|10779->6898|10809->6899|10857->6918|10888->6919|10919->6920|11051->7023|11081->7024|11111->7025|11162->7046|11193->7047|11224->7048|11413->7200|11429->7206|11491->7245|11529->7254|11559->7255|11589->7256|11650->7287|11681->7288|11712->7289|11786->7326|11802->7332|11859->7366|11897->7375|11927->7376|11957->7377|12017->7407|12048->7408|12079->7409|12117->7417|12148->7418|12179->7419|12241->7451|12272->7452|12303->7453|12382->7495|12398->7501|12458->7538|12496->7547|12526->7548|12556->7549|12615->7578|12646->7579|12677->7580|12783->7657|12813->7658|12843->7659|12891->7678|12921->7679|12951->7680|12982->7682|13012->7683|13042->7684|13091->7703|13122->7704|13153->7705|13857->8380|13887->8381|13917->8382|13979->8415|14009->8416|14039->8417|14555->8904|14585->8905|14615->8906|14657->8919|14687->8920|14717->8921|14793->8968|14823->8969|14853->8970|14902->8990|14932->8991|14962->8992|15043->9044|15073->9045|15103->9046|15162->9076|15192->9077|15222->9078|15256->9083|15286->9084|15316->9085|15378->9117|15409->9118|15440->9119|15523->9173|15553->9174|15583->9175|15653->9216|15683->9217|15713->9218|15747->9223|15777->9224|15807->9225|15880->9268|15911->9269|15942->9270|16023->9322|16053->9323|16083->9324|16143->9355|16173->9356|16203->9357|16283->9408|16313->9409|16343->9410|16396->9434|16426->9435|16456->9436|16535->9486|16565->9487|16595->9488|16649->9513|16679->9514|16709->9515|16880->9649|16896->9655|16956->9692|17294->10001|17324->10002|17354->10003|17402->10022|17433->10023|17464->10024|17596->10127|17626->10128|17656->10129|17707->10150|17738->10151|17769->10152|17958->10304|17974->10310|18036->10349|18074->10358|18104->10359|18134->10360|18195->10391|18226->10392|18257->10393|18331->10430|18347->10436|18404->10470|18442->10479|18472->10480|18502->10481|18562->10511|18593->10512|18624->10513|18662->10521|18693->10522|18724->10523|18786->10555|18817->10556|18848->10557|18927->10599|18943->10605|19003->10642|19041->10651|19071->10652|19101->10653|19160->10682|19191->10683|19222->10684|19328->10761|19358->10762|19388->10763|19436->10782|19466->10783|19496->10784|19527->10786|19557->10787|19587->10788|19636->10807|19667->10808|19698->10809|19944->11026|19974->11027|20004->11028|20048->11043|20078->11044|20108->11045|20204->11112|20234->11113|20264->11114|20313->11134|20343->11135|20373->11136|21408->12142|21438->12143|21494->12170|21524->12171|21591->12209|21621->12210|21651->12211|21693->12224|21723->12225|21753->12226|21854->12298|21884->12299|21914->12300|21962->12319|21992->12320|22022->12321|22101->12371|22131->12372|22161->12373|22211->12394|22241->12395|22271->12396|22342->12439|22372->12440|22402->12441|22451->12461|22481->12462|22511->12463|22573->12497|22603->12498|22633->12499|22680->12517|22710->12518|22740->12519|22802->12553|22832->12554|22862->12555|22916->12580|22946->12581|22976->12582|23038->12616|23068->12617|23098->12618|23158->12649|23188->12650|23218->12651|23280->12685|23310->12686|23340->12687|23402->12720|23432->12721|23462->12722|23621->12852|23651->12853|23681->12854|23729->12873|23759->12874|23789->12875|23820->12877|23850->12878|23880->12879|23928->12898|23958->12899|23988->12900|25013->13895|25044->13896|25075->13897|25112->13904|25143->13905|25174->13906|25330->14033|25360->14034|25390->14035|25425->14041|25455->14042|25485->14043|25561->14090|25591->14091|25621->14092|25654->14096|25684->14097|25714->14098|27306->15662|27336->15663|27415->15713|27445->15714|27514->15754|27544->15755|27703->15886|27732->15887|27985->16103|28001->16109|28071->16156|28159->16207|28175->16213|28243->16258
                    LINES: 29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|69->41|69->41|69->41|70->42|70->42|70->42|117->89|117->89|117->89|117->89|117->89|117->89|134->106|134->106|134->106|134->106|134->106|134->106|137->109|137->109|137->109|137->109|137->109|137->109|152->124|152->124|152->124|152->124|152->124|152->124|153->125|153->125|153->125|153->125|153->125|153->125|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|158->130|158->130|158->130|159->131|159->131|159->131|159->131|159->131|159->131|163->135|163->135|163->135|169->141|169->141|169->141|169->141|169->141|169->141|170->142|170->142|170->142|170->142|170->142|170->142|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|177->149|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|178->150|179->151|179->151|179->151|179->151|179->151|179->151|179->151|179->151|179->151|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|181->153|211->183|211->183|211->183|211->183|211->183|211->183|226->198|226->198|226->198|226->198|226->198|226->198|227->199|227->199|227->199|227->199|227->199|227->199|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|229->201|229->201|229->201|229->201|229->201|229->201|229->201|229->201|229->201|229->201|229->201|229->201|230->202|230->202|230->202|230->202|230->202|230->202|231->203|231->203|231->203|231->203|231->203|231->203|232->204|232->204|232->204|232->204|232->204|232->204|236->208|236->208|236->208|242->214|242->214|242->214|242->214|242->214|242->214|243->215|243->215|243->215|243->215|243->215|243->215|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|250->222|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|251->223|252->224|252->224|252->224|252->224|252->224|252->224|252->224|252->224|252->224|254->226|254->226|254->226|254->226|254->226|254->226|254->226|254->226|254->226|254->226|254->226|254->226|264->236|264->236|264->236|264->236|264->236|264->236|267->239|267->239|267->239|267->239|267->239|267->239|306->278|306->278|306->278|306->278|309->281|309->281|309->281|309->281|309->281|309->281|312->284|312->284|312->284|312->284|312->284|312->284|313->285|313->285|313->285|313->285|313->285|313->285|316->288|316->288|316->288|316->288|316->288|316->288|319->291|319->291|319->291|319->291|319->291|319->291|322->294|322->294|322->294|322->294|322->294|322->294|325->297|325->297|325->297|325->297|325->297|325->297|328->300|328->300|328->300|328->300|328->300|328->300|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|355->327|355->327|355->327|355->327|355->327|355->327|359->331|359->331|359->331|359->331|359->331|359->331|360->332|360->332|360->332|360->332|360->332|360->332|393->365|393->365|393->365|393->365|394->366|394->366|396->368|396->368|403->375|403->375|403->375|404->376|404->376|404->376
                    -- GENERATED --
                */
            