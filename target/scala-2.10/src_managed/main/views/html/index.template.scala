
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
		<link rel="shortcut icon" type="image/ico" href=""""),_display_(Seq[Any](/*18.53*/routes/*18.59*/.Assets.at("images/favicon/favicon.ico"))),format.raw/*18.99*/("""">

		<link rel="apple-touch-icon" sizes="180x180" href=""""),_display_(Seq[Any](/*20.55*/routes/*20.61*/.Assets.at("images/favicon/apple-touch-icon.png"))),format.raw/*20.110*/("""">
		<link rel="icon" type="image/png" sizes="32x32" href=""""),_display_(Seq[Any](/*21.58*/routes/*21.64*/.Assets.at("images/favicon/favicon-32x32.png"))),format.raw/*21.110*/("""">
		<link rel="icon" type="image/png" sizes="16x16" href=""""),_display_(Seq[Any](/*22.58*/routes/*22.64*/.Assets.at("images/favicon/favicon-16x16.png"))),format.raw/*22.110*/("""">
		<link rel="manifest" href=""""),_display_(Seq[Any](/*23.31*/routes/*23.37*/.Assets.at("images/favicon/site.webmanifest"))),format.raw/*23.82*/("""">
		<link rel="mask-icon" href=""""),_display_(Seq[Any](/*24.32*/routes/*24.38*/.Assets.at("images/favicon/safari-pinned-tab.svg"))),format.raw/*24.88*/("""" color="#603cba">
		<link rel="shortcut icon" href=""""),_display_(Seq[Any](/*25.36*/routes/*25.42*/.Assets.at("images/favicon/favicon.ico"))),format.raw/*25.82*/("""">
		<meta name="msapplication-TileColor" content="#603cba">
		<meta name="msapplication-config" content=""""),_display_(Seq[Any](/*27.47*/routes/*27.53*/.Assets.at("images/favicon/browserconfig.xml"))),format.raw/*27.99*/("""">
		<meta name="theme-color" content="#ffffff">

		<script src=""""),_display_(Seq[Any](/*30.17*/routes/*30.23*/.Assets.at("third/angularjs/angular.min.js"))),format.raw/*30.67*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*31.17*/routes/*31.23*/.Assets.at("third/angularjs/angular-resource.min.js"))),format.raw/*31.76*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*32.17*/routes/*32.23*/.Assets.at("javascripts/main.js"))),format.raw/*32.56*/("""" type="text/javascript"></script>
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
		                	<li class=""><a target="_blank" href=""""),_display_(Seq[Any](/*51.59*/routes/*51.65*/.Assets.at("pdf/Termal_UMLDiagram.pdf"))),format.raw/*51.104*/("""">UML Diagram</a></li>
		                    <li class=""><a target="_blank" href=""""),_display_(Seq[Any](/*52.62*/routes/*52.68*/.Assets.at("pdf/Tercio-Agra-Junker-Resume-V3.pdf"))),format.raw/*52.118*/("""">Resume</a></li>
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
						<h1>IP ADDRESS """),format.raw/*99.22*/("""{"""),format.raw/*99.23*/("""{"""),format.raw/*99.24*/("""ip"""),format.raw/*99.26*/("""}"""),format.raw/*99.27*/("""}"""),format.raw/*99.28*/("""</h1>
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
											<div class="date">"""),format.raw/*116.30*/("""{"""),format.raw/*116.31*/("""{"""),format.raw/*116.32*/(""" result.LocalObservationDateTime """),format.raw/*116.65*/("""}"""),format.raw/*116.66*/("""}"""),format.raw/*116.67*/("""</div>
										</div>
										<br/> 
										<div class="location" style="float:left; padding-left:20px;">IP Address: """),format.raw/*119.84*/("""{"""),format.raw/*119.85*/("""{"""),format.raw/*119.86*/("""ip"""),format.raw/*119.88*/("""}"""),format.raw/*119.89*/("""}"""),format.raw/*119.90*/("""</div>
										<!-- .forecast-header -->
										<div class="" style="float: right; padding-right:20px;">

								      			C
								      			<input type="radio" name="temp" ng-model="temp" value="c">
								      			
								      		
								      			<input type="radio" name="temp" ng-model="temp" value="f">
								      			F
							      			
										</div>
										<br />
										<div class="forecast-content">
											
											<div class="location">"""),format.raw/*134.34*/("""{"""),format.raw/*134.35*/("""{"""),format.raw/*134.36*/(""" result.name """),format.raw/*134.49*/("""}"""),format.raw/*134.50*/("""}"""),format.raw/*134.51*/("""</div>
											<div class="location">Mostly """),format.raw/*135.41*/("""{"""),format.raw/*135.42*/("""{"""),format.raw/*135.43*/(""" result.WeatherText """),format.raw/*135.63*/("""}"""),format.raw/*135.64*/("""}"""),format.raw/*135.65*/("""</div>
											
											<div class="location">Feels like: """),format.raw/*137.46*/("""{"""),format.raw/*137.47*/("""{"""),format.raw/*137.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*137.78*/("""}"""),format.raw/*137.79*/("""}"""),format.raw/*137.80*/(""" C | """),format.raw/*137.85*/("""{"""),format.raw/*137.86*/("""{"""),format.raw/*137.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*137.119*/("""}"""),format.raw/*137.120*/("""}"""),format.raw/*137.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*138.46*/("""{"""),format.raw/*138.47*/("""{"""),format.raw/*138.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*138.89*/("""}"""),format.raw/*138.90*/("""}"""),format.raw/*138.91*/(""" C | """),format.raw/*138.96*/("""{"""),format.raw/*138.97*/("""{"""),format.raw/*138.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*138.141*/("""}"""),format.raw/*138.142*/("""}"""),format.raw/*138.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*139.44*/("""{"""),format.raw/*139.45*/("""{"""),format.raw/*139.46*/(""" result.HasPrecipitationString """),format.raw/*139.77*/("""}"""),format.raw/*139.78*/("""}"""),format.raw/*139.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*140.45*/("""{"""),format.raw/*140.46*/("""{"""),format.raw/*140.47*/(""" result.IsDayTimeString """),format.raw/*140.71*/("""}"""),format.raw/*140.72*/("""}"""),format.raw/*140.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*141.44*/("""{"""),format.raw/*141.45*/("""{"""),format.raw/*141.46*/(""" result.RelativeHumidity """),format.raw/*141.71*/("""}"""),format.raw/*141.72*/("""}"""),format.raw/*141.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*145.24*/routes/*145.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*145.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*151.78*/("""{"""),format.raw/*151.79*/("""{"""),format.raw/*151.80*/("""result.metric.Value"""),format.raw/*151.99*/("""}"""),format.raw/*151.100*/("""}"""),format.raw/*151.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*152.83*/("""{"""),format.raw/*152.84*/("""{"""),format.raw/*152.85*/("""result.imperial.Value"""),format.raw/*152.106*/("""}"""),format.raw/*152.107*/("""}"""),format.raw/*152.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*159.29*/routes/*159.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*159.74*/("""" alt="">"""),format.raw/*159.83*/("""{"""),format.raw/*159.84*/("""{"""),format.raw/*159.85*/("""result.PrecipitationProbability"""),format.raw/*159.116*/("""}"""),format.raw/*159.117*/("""}"""),format.raw/*159.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*160.29*/routes/*160.35*/.Assets.at("images/icon-wind.png"))),format.raw/*160.69*/("""" alt="">"""),format.raw/*160.78*/("""{"""),format.raw/*160.79*/("""{"""),format.raw/*160.80*/(""" result.WindSpeedMetric.Value """),format.raw/*160.110*/("""}"""),format.raw/*160.111*/("""}"""),format.raw/*160.112*/(""" km/h / """),format.raw/*160.120*/("""{"""),format.raw/*160.121*/("""{"""),format.raw/*160.122*/(""" result.WindSpeedImperial.Value """),format.raw/*160.154*/("""}"""),format.raw/*160.155*/("""}"""),format.raw/*160.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*161.29*/routes/*161.35*/.Assets.at("images/icon-compass.png"))),format.raw/*161.72*/("""" alt="">"""),format.raw/*161.81*/("""{"""),format.raw/*161.82*/("""{"""),format.raw/*161.83*/(""" result.WindDirectionEnglish """),format.raw/*161.112*/("""}"""),format.raw/*161.113*/("""}"""),format.raw/*161.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*163.58*/("""{"""),format.raw/*163.59*/("""{"""),format.raw/*163.60*/(""" result.MobileLink """),format.raw/*163.79*/("""}"""),format.raw/*163.80*/("""}"""),format.raw/*163.81*/("""">"""),format.raw/*163.83*/("""{"""),format.raw/*163.84*/("""{"""),format.raw/*163.85*/(""" result.MobileLink """),format.raw/*163.104*/("""}"""),format.raw/*163.105*/("""}"""),format.raw/*163.106*/("""</a></div>
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
											<div class="date">"""),format.raw/*193.30*/("""{"""),format.raw/*193.31*/("""{"""),format.raw/*193.32*/(""" result.LocalObservationDateTime """),format.raw/*193.65*/("""}"""),format.raw/*193.66*/("""}"""),format.raw/*193.67*/("""</div>
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
											<div class="location">"""),format.raw/*208.34*/("""{"""),format.raw/*208.35*/("""{"""),format.raw/*208.36*/(""" result.name """),format.raw/*208.49*/("""}"""),format.raw/*208.50*/("""}"""),format.raw/*208.51*/("""</div>
											<div class="location">Mostly """),format.raw/*209.41*/("""{"""),format.raw/*209.42*/("""{"""),format.raw/*209.43*/(""" result.WeatherText """),format.raw/*209.63*/("""}"""),format.raw/*209.64*/("""}"""),format.raw/*209.65*/("""</div>
											<div class="location">Feels like: """),format.raw/*210.46*/("""{"""),format.raw/*210.47*/("""{"""),format.raw/*210.48*/(""" result.FeelsLikeMetric.Value """),format.raw/*210.78*/("""}"""),format.raw/*210.79*/("""}"""),format.raw/*210.80*/(""" C | """),format.raw/*210.85*/("""{"""),format.raw/*210.86*/("""{"""),format.raw/*210.87*/(""" result.FeelsLikeImperial.Value """),format.raw/*210.119*/("""}"""),format.raw/*210.120*/("""}"""),format.raw/*210.121*/(""" F</div>
											<div class="location">Wind chill: """),format.raw/*211.46*/("""{"""),format.raw/*211.47*/("""{"""),format.raw/*211.48*/(""" result.WindChillTemperatureMetric.Value """),format.raw/*211.89*/("""}"""),format.raw/*211.90*/("""}"""),format.raw/*211.91*/(""" C | """),format.raw/*211.96*/("""{"""),format.raw/*211.97*/("""{"""),format.raw/*211.98*/(""" result.WindChillTemperatureImperial.Value """),format.raw/*211.141*/("""}"""),format.raw/*211.142*/("""}"""),format.raw/*211.143*/(""" F</div>
											<div class="location">Raining?: """),format.raw/*212.44*/("""{"""),format.raw/*212.45*/("""{"""),format.raw/*212.46*/(""" result.HasPrecipitationString """),format.raw/*212.77*/("""}"""),format.raw/*212.78*/("""}"""),format.raw/*212.79*/("""</div>
											<div class="location">Day time?: """),format.raw/*213.45*/("""{"""),format.raw/*213.46*/("""{"""),format.raw/*213.47*/(""" result.IsDayTimeString """),format.raw/*213.71*/("""}"""),format.raw/*213.72*/("""}"""),format.raw/*213.73*/("""</div>
											<div class="location">Humidity: """),format.raw/*214.44*/("""{"""),format.raw/*214.45*/("""{"""),format.raw/*214.46*/(""" result.RelativeHumidity """),format.raw/*214.71*/("""}"""),format.raw/*214.72*/("""}"""),format.raw/*214.73*/("""%</div>
											<br />
											<br />
											<div class="forecast-icon" style="text-align:center;">	
												<img src=""""),_display_(Seq[Any](/*218.24*/routes/*218.30*/.Assets.at("images/icons/icon-1.svg"))),format.raw/*218.67*/("""" alt="" width=90>
												
											</div>
											
											<div class="degree" style="text-align: center; word-break: break-all; margin-right:0px;">			
												<div class="num" style="margin-right:0px!important;">
													<span ng-show="temp == 'c'" style="margin-right:0px!important;">"""),format.raw/*224.78*/("""{"""),format.raw/*224.79*/("""{"""),format.raw/*224.80*/("""result.metric.Value"""),format.raw/*224.99*/("""}"""),format.raw/*224.100*/("""}"""),format.raw/*224.101*/("""<sup>o</sup>C</span>
							      					<span ng-show="temp == 'f'" style="margin-right:0px!important;">"""),format.raw/*225.83*/("""{"""),format.raw/*225.84*/("""{"""),format.raw/*225.85*/("""result.imperial.Value"""),format.raw/*225.106*/("""}"""),format.raw/*225.107*/("""}"""),format.raw/*225.108*/("""<sup>o</sup>F</span>
													
													<br/> 
													
												</div>
											</div>
											<br />
											<span><img src=""""),_display_(Seq[Any](/*232.29*/routes/*232.35*/.Assets.at("images/icon-umberella.png"))),format.raw/*232.74*/("""" alt="">"""),format.raw/*232.83*/("""{"""),format.raw/*232.84*/("""{"""),format.raw/*232.85*/("""result.PrecipitationProbability"""),format.raw/*232.116*/("""}"""),format.raw/*232.117*/("""}"""),format.raw/*232.118*/("""%</span>
											<span><img src=""""),_display_(Seq[Any](/*233.29*/routes/*233.35*/.Assets.at("images/icon-wind.png"))),format.raw/*233.69*/("""" alt="">"""),format.raw/*233.78*/("""{"""),format.raw/*233.79*/("""{"""),format.raw/*233.80*/(""" result.WindSpeedMetric.Value """),format.raw/*233.110*/("""}"""),format.raw/*233.111*/("""}"""),format.raw/*233.112*/(""" km/h / """),format.raw/*233.120*/("""{"""),format.raw/*233.121*/("""{"""),format.raw/*233.122*/(""" result.WindSpeedImperial.Value """),format.raw/*233.154*/("""}"""),format.raw/*233.155*/("""}"""),format.raw/*233.156*/(""" mi/h </span>
											<span><img src=""""),_display_(Seq[Any](/*234.29*/routes/*234.35*/.Assets.at("images/icon-compass.png"))),format.raw/*234.72*/("""" alt="">"""),format.raw/*234.81*/("""{"""),format.raw/*234.82*/("""{"""),format.raw/*234.83*/(""" result.WindDirectionEnglish """),format.raw/*234.112*/("""}"""),format.raw/*234.113*/("""}"""),format.raw/*234.114*/("""</span>
											
											<div><br />More info <a target="_blank" href=""""),format.raw/*236.58*/("""{"""),format.raw/*236.59*/("""{"""),format.raw/*236.60*/(""" result.MobileLink """),format.raw/*236.79*/("""}"""),format.raw/*236.80*/("""}"""),format.raw/*236.81*/("""">"""),format.raw/*236.83*/("""{"""),format.raw/*236.84*/("""{"""),format.raw/*236.85*/(""" result.MobileLink """),format.raw/*236.104*/("""}"""),format.raw/*236.105*/("""}"""),format.raw/*236.106*/("""</a></div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="clearfix" style="height: 20px;"><br/></div>
					</div>
					<!--
					<h1>Forecast JSON Response</h1>
					<pre>"""),format.raw/*246.11*/("""{"""),format.raw/*246.12*/("""{"""),format.raw/*246.13*/("""forecast | json"""),format.raw/*246.28*/("""}"""),format.raw/*246.29*/("""}"""),format.raw/*246.30*/("""</pre>
					-->
					<h1>ACCUWEATHER JSON RESPONSE</h1> 
					<pre>"""),format.raw/*249.11*/("""{"""),format.raw/*249.12*/("""{"""),format.raw/*249.13*/("""processedData | json"""),format.raw/*249.33*/("""}"""),format.raw/*249.34*/("""}"""),format.raw/*249.35*/("""</pre>
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
						  <tr ng-repeat="result in processedData" ng-class=""""),format.raw/*288.59*/("""{"""),format.raw/*288.60*/("""'text-danger': result.error"""),format.raw/*288.87*/("""}"""),format.raw/*288.88*/("""">
							
						    <td>
						      """),format.raw/*291.13*/("""{"""),format.raw/*291.14*/("""{"""),format.raw/*291.15*/(""" result.name """),format.raw/*291.28*/("""}"""),format.raw/*291.29*/("""}"""),format.raw/*291.30*/("""
						    </td>
						    <td>
						      <span ng-show="temp == 'c'">"""),format.raw/*294.41*/("""{"""),format.raw/*294.42*/("""{"""),format.raw/*294.43*/("""result.metric.Value"""),format.raw/*294.62*/("""}"""),format.raw/*294.63*/("""}"""),format.raw/*294.64*/(""" C</span>
						      <span ng-show="temp == 'f'">"""),format.raw/*295.41*/("""{"""),format.raw/*295.42*/("""{"""),format.raw/*295.43*/("""result.imperial.Value"""),format.raw/*295.64*/("""}"""),format.raw/*295.65*/("""}"""),format.raw/*295.66*/(""" F</span>
							</td>
							<td>
								"""),format.raw/*298.9*/("""{"""),format.raw/*298.10*/("""{"""),format.raw/*298.11*/(""" result.WeatherText """),format.raw/*298.31*/("""}"""),format.raw/*298.32*/("""}"""),format.raw/*298.33*/("""
							</td>
							<td>
								"""),format.raw/*301.9*/("""{"""),format.raw/*301.10*/("""{"""),format.raw/*301.11*/(""" result.IsDayTime """),format.raw/*301.29*/("""}"""),format.raw/*301.30*/("""}"""),format.raw/*301.31*/("""
							</td>
							<td>
								"""),format.raw/*304.9*/("""{"""),format.raw/*304.10*/("""{"""),format.raw/*304.11*/(""" result.HasPrecipitation """),format.raw/*304.36*/("""}"""),format.raw/*304.37*/("""}"""),format.raw/*304.38*/("""
							</td>
							<td>
								"""),format.raw/*307.9*/("""{"""),format.raw/*307.10*/("""{"""),format.raw/*307.11*/(""" result.HasPrecipitationString """),format.raw/*307.42*/("""}"""),format.raw/*307.43*/("""}"""),format.raw/*307.44*/("""
							</td>
							<td>
								"""),format.raw/*310.9*/("""{"""),format.raw/*310.10*/("""{"""),format.raw/*310.11*/(""" result.LocalObservationDateTime """),format.raw/*310.44*/("""}"""),format.raw/*310.45*/("""}"""),format.raw/*310.46*/("""
							</td>
							<td style="word-break: break-all;">
								<span style="max-width:100%;">
									<a target="_blank" href=""""),format.raw/*314.35*/("""{"""),format.raw/*314.36*/("""{"""),format.raw/*314.37*/(""" result.MobileLink """),format.raw/*314.56*/("""}"""),format.raw/*314.57*/("""}"""),format.raw/*314.58*/("""">"""),format.raw/*314.60*/("""{"""),format.raw/*314.61*/("""{"""),format.raw/*314.62*/(""" result.MobileLink """),format.raw/*314.81*/("""}"""),format.raw/*314.82*/("""}"""),format.raw/*314.83*/("""</a>
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
						                    <span data-ng-show="message" class="alert"><span class="glyphicon glyphicon-arrow-left">&nbsp;</span>"""),format.raw/*337.128*/("""{"""),format.raw/*337.129*/("""{"""),format.raw/*337.130*/("""message"""),format.raw/*337.137*/("""}"""),format.raw/*337.138*/("""}"""),format.raw/*337.139*/("""</span>
						                </form>
						                <br />
								      	<br />
								      	<pre>http status code: """),format.raw/*341.39*/("""{"""),format.raw/*341.40*/("""{"""),format.raw/*341.41*/("""status"""),format.raw/*341.47*/("""}"""),format.raw/*341.48*/("""}"""),format.raw/*341.49*/("""</pre>
								      	<pre>http response data: """),format.raw/*342.41*/("""{"""),format.raw/*342.42*/("""{"""),format.raw/*342.43*/("""data"""),format.raw/*342.47*/("""}"""),format.raw/*342.48*/("""}"""),format.raw/*342.49*/("""</pre>
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
 				<p>termal uses <a href="http://www.playframework.com" target="_blank">Play!</a>, <a href="http://angularjs.org" target="_blank">AngualarJS</a>, and <a href="http://getbootstrap.com" target="_blank">Twitter Bootstrap</a>.</p>
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
		  (function(i,s,o,g,r,a,m)"""),format.raw/*375.29*/("""{"""),format.raw/*375.30*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*375.80*/("""{"""),format.raw/*375.81*/("""
		  (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*376.40*/("""}"""),format.raw/*376.41*/(""",i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  """),format.raw/*378.5*/("""}"""),format.raw/*378.6*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-46957200-1', 'sleepy-garden-8606.herokuapp.com');
		  ga('send', 'pageview');
		
		</script>
		-->
	 	<script src=""""),_display_(Seq[Any](/*385.18*/routes/*385.24*/.Assets.at("third/jquery/jquery-1.10.2.min.js"))),format.raw/*385.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*386.17*/routes/*386.23*/.Assets.at("third/bootstrap/js/bootstrap.js"))),format.raw/*386.68*/("""" type="text/javascript"></script>
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
                    DATE: Tue Dec 10 00:29:24 EST 2019
                    SOURCE: /Users/tajunker/Computer Engineering IUPUI/CSCI 240/Homework/termal/app/views/index.scala.html
                    HASH: 3d99c13a2023049538c0b5206f4ee9058dcdac77
                    MATRIX: 855->0|1337->446|1352->452|1422->499|1511->552|1526->558|1607->616|1696->669|1711->675|1775->717|1864->770|1879->776|1968->842|2054->892|2069->898|2145->951|2231->1001|2246->1007|2302->1041|2393->1096|2408->1102|2470->1142|2564->1200|2579->1206|2651->1255|2747->1315|2762->1321|2831->1367|2927->1427|2942->1433|3011->1479|3080->1512|3095->1518|3162->1563|3232->1597|3247->1603|3319->1653|3409->1707|3424->1713|3486->1753|3629->1860|3644->1866|3712->1912|3814->1978|3829->1984|3895->2028|3982->2079|3997->2085|4072->2138|4159->2189|4174->2195|4229->2228|5349->3312|5364->3318|5426->3357|5546->3441|5561->3447|5634->3497|7651->5486|7680->5487|7709->5488|7739->5490|7768->5491|7797->5492|8306->5972|8336->5973|8366->5974|8428->6007|8458->6008|8488->6009|8641->6133|8671->6134|8701->6135|8732->6137|8762->6138|8792->6139|9294->6612|9324->6613|9354->6614|9396->6627|9426->6628|9456->6629|9532->6676|9562->6677|9592->6678|9641->6698|9671->6699|9701->6700|9794->6764|9824->6765|9854->6766|9913->6796|9943->6797|9973->6798|10007->6803|10037->6804|10067->6805|10129->6837|10160->6838|10191->6839|10274->6893|10304->6894|10334->6895|10404->6936|10434->6937|10464->6938|10498->6943|10528->6944|10558->6945|10631->6988|10662->6989|10693->6990|10774->7042|10804->7043|10834->7044|10894->7075|10924->7076|10954->7077|11034->7128|11064->7129|11094->7130|11147->7154|11177->7155|11207->7156|11286->7206|11316->7207|11346->7208|11400->7233|11430->7234|11460->7235|11631->7369|11647->7375|11707->7412|12045->7721|12075->7722|12105->7723|12153->7742|12184->7743|12215->7744|12347->7847|12377->7848|12407->7849|12458->7870|12489->7871|12520->7872|12709->8024|12725->8030|12787->8069|12825->8078|12855->8079|12885->8080|12946->8111|12977->8112|13008->8113|13082->8150|13098->8156|13155->8190|13193->8199|13223->8200|13253->8201|13313->8231|13344->8232|13375->8233|13413->8241|13444->8242|13475->8243|13537->8275|13568->8276|13599->8277|13678->8319|13694->8325|13754->8362|13792->8371|13822->8372|13852->8373|13911->8402|13942->8403|13973->8404|14079->8481|14109->8482|14139->8483|14187->8502|14217->8503|14247->8504|14278->8506|14308->8507|14338->8508|14387->8527|14418->8528|14449->8529|15153->9204|15183->9205|15213->9206|15275->9239|15305->9240|15335->9241|15851->9728|15881->9729|15911->9730|15953->9743|15983->9744|16013->9745|16089->9792|16119->9793|16149->9794|16198->9814|16228->9815|16258->9816|16339->9868|16369->9869|16399->9870|16458->9900|16488->9901|16518->9902|16552->9907|16582->9908|16612->9909|16674->9941|16705->9942|16736->9943|16819->9997|16849->9998|16879->9999|16949->10040|16979->10041|17009->10042|17043->10047|17073->10048|17103->10049|17176->10092|17207->10093|17238->10094|17319->10146|17349->10147|17379->10148|17439->10179|17469->10180|17499->10181|17579->10232|17609->10233|17639->10234|17692->10258|17722->10259|17752->10260|17831->10310|17861->10311|17891->10312|17945->10337|17975->10338|18005->10339|18176->10473|18192->10479|18252->10516|18590->10825|18620->10826|18650->10827|18698->10846|18729->10847|18760->10848|18892->10951|18922->10952|18952->10953|19003->10974|19034->10975|19065->10976|19254->11128|19270->11134|19332->11173|19370->11182|19400->11183|19430->11184|19491->11215|19522->11216|19553->11217|19627->11254|19643->11260|19700->11294|19738->11303|19768->11304|19798->11305|19858->11335|19889->11336|19920->11337|19958->11345|19989->11346|20020->11347|20082->11379|20113->11380|20144->11381|20223->11423|20239->11429|20299->11466|20337->11475|20367->11476|20397->11477|20456->11506|20487->11507|20518->11508|20624->11585|20654->11586|20684->11587|20732->11606|20762->11607|20792->11608|20823->11610|20853->11611|20883->11612|20932->11631|20963->11632|20994->11633|21240->11850|21270->11851|21300->11852|21344->11867|21374->11868|21404->11869|21500->11936|21530->11937|21560->11938|21609->11958|21639->11959|21669->11960|22704->12966|22734->12967|22790->12994|22820->12995|22887->13033|22917->13034|22947->13035|22989->13048|23019->13049|23049->13050|23150->13122|23180->13123|23210->13124|23258->13143|23288->13144|23318->13145|23397->13195|23427->13196|23457->13197|23507->13218|23537->13219|23567->13220|23638->13263|23668->13264|23698->13265|23747->13285|23777->13286|23807->13287|23869->13321|23899->13322|23929->13323|23976->13341|24006->13342|24036->13343|24098->13377|24128->13378|24158->13379|24212->13404|24242->13405|24272->13406|24334->13440|24364->13441|24394->13442|24454->13473|24484->13474|24514->13475|24576->13509|24606->13510|24636->13511|24698->13544|24728->13545|24758->13546|24917->13676|24947->13677|24977->13678|25025->13697|25055->13698|25085->13699|25116->13701|25146->13702|25176->13703|25224->13722|25254->13723|25284->13724|26309->14719|26340->14720|26371->14721|26408->14728|26439->14729|26470->14730|26626->14857|26656->14858|26686->14859|26721->14865|26751->14866|26781->14867|26857->14914|26887->14915|26917->14916|26950->14920|26980->14921|27010->14922|28595->16479|28625->16480|28704->16530|28734->16531|28803->16571|28833->16572|28992->16703|29021->16704|29274->16920|29290->16926|29360->16973|29448->17024|29464->17030|29532->17075
                    LINES: 29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|79->51|79->51|79->51|80->52|80->52|80->52|127->99|127->99|127->99|127->99|127->99|127->99|144->116|144->116|144->116|144->116|144->116|144->116|147->119|147->119|147->119|147->119|147->119|147->119|162->134|162->134|162->134|162->134|162->134|162->134|163->135|163->135|163->135|163->135|163->135|163->135|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|166->138|167->139|167->139|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|168->140|168->140|169->141|169->141|169->141|169->141|169->141|169->141|173->145|173->145|173->145|179->151|179->151|179->151|179->151|179->151|179->151|180->152|180->152|180->152|180->152|180->152|180->152|187->159|187->159|187->159|187->159|187->159|187->159|187->159|187->159|187->159|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|188->160|189->161|189->161|189->161|189->161|189->161|189->161|189->161|189->161|189->161|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|191->163|221->193|221->193|221->193|221->193|221->193|221->193|236->208|236->208|236->208|236->208|236->208|236->208|237->209|237->209|237->209|237->209|237->209|237->209|238->210|238->210|238->210|238->210|238->210|238->210|238->210|238->210|238->210|238->210|238->210|238->210|239->211|239->211|239->211|239->211|239->211|239->211|239->211|239->211|239->211|239->211|239->211|239->211|240->212|240->212|240->212|240->212|240->212|240->212|241->213|241->213|241->213|241->213|241->213|241->213|242->214|242->214|242->214|242->214|242->214|242->214|246->218|246->218|246->218|252->224|252->224|252->224|252->224|252->224|252->224|253->225|253->225|253->225|253->225|253->225|253->225|260->232|260->232|260->232|260->232|260->232|260->232|260->232|260->232|260->232|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|261->233|262->234|262->234|262->234|262->234|262->234|262->234|262->234|262->234|262->234|264->236|264->236|264->236|264->236|264->236|264->236|264->236|264->236|264->236|264->236|264->236|264->236|274->246|274->246|274->246|274->246|274->246|274->246|277->249|277->249|277->249|277->249|277->249|277->249|316->288|316->288|316->288|316->288|319->291|319->291|319->291|319->291|319->291|319->291|322->294|322->294|322->294|322->294|322->294|322->294|323->295|323->295|323->295|323->295|323->295|323->295|326->298|326->298|326->298|326->298|326->298|326->298|329->301|329->301|329->301|329->301|329->301|329->301|332->304|332->304|332->304|332->304|332->304|332->304|335->307|335->307|335->307|335->307|335->307|335->307|338->310|338->310|338->310|338->310|338->310|338->310|342->314|342->314|342->314|342->314|342->314|342->314|342->314|342->314|342->314|342->314|342->314|342->314|365->337|365->337|365->337|365->337|365->337|365->337|369->341|369->341|369->341|369->341|369->341|369->341|370->342|370->342|370->342|370->342|370->342|370->342|403->375|403->375|403->375|403->375|404->376|404->376|406->378|406->378|413->385|413->385|413->385|414->386|414->386|414->386
                    -- GENERATED --
                */
            