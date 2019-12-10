
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
object documentation extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
				 	<div style="word-wrap: break-word;">				
						<h1 class="code-line" data-line-start=0 data-line-end=1 ><a id="Goals_0"></a>Goals</h1>
						<p class="has-line-data" data-line-start="1" data-line-end="2">Create a project that illustrates what you’ve done this semester. You have quite a bit of leeway on this project, so pick something interesting. Ideal projects will illustrate the primary ideas of this course.</p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=3 data-line-end=4 ><a id="Termal_is_Deployed_to_Heroku_3"></a>Termal is Deployed to Heroku:</h1>
						<p class="has-line-data" data-line-start="4" data-line-end="8">The Termal Application has been deployed to Heroku using the Heroku Git and Play Framework deployment integration. To visit and interact with the deployed web application, please, point your browser to:
						<br/>
						<br/>
						<a href="https://termalapp.herokuapp.com/">https://termalapp.herokuapp.com/</a>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=3 data-line-end=4 ><a id="Termal_is_Deployed_to_Heroku_3"></a>Documentation</h1>
						To view documentation in production visit:
						<br/>
						<br/>
						<a href="https://termalapp.herokuapp.com/documentation">https://termalapp.herokuapp.com/documentation</a></p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=9 data-line-end=10 ><a id="Overview_9"></a>Overview</h1>
						<p class="has-line-data" data-line-start="10" data-line-end="11">termal allows users to input Zip Codes, separated by commas, into the input field. Temperatures for those Zip Codes are fetched from the Accuweather™ API when the user clicks enter or the search button. Fetched data is parsed and displayed in view in the UI. This web application uses MVC design pattern to fully separate view from controller and model (we are not using the model in MVC, as we are not saving anything to a database. Fetched JSON data is also stored in Weather and Location Java classes of application for future use and potential integration with a database. This application uses a number of different technologies to accomplish the previously mentioned goals. The application was developed as part of my learning process for feeling out the following technology stack: Java, Play! Framework 2.2.6, JavaScript, AngularJS, LoDashJS, HTML, CSS, Twitter Bootstrap, Heroku’s Git &amp; Play! app deployment integration, and the Accuweather API and ipify API.</p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=12 data-line-end=13 ><a id="Installing_Play_Framework_12"></a>Installing Play Framework</h1>
						<p class="has-line-data" data-line-start="13" data-line-end="15">To install play on your local machine please visit the following Play Framework installation webpage at:
						<br/>
						<br/>
						<a href="https://www.playframework.com/documentation/2.2.x/Installing">https://www.playframework.com/documentation/2.2.x/Installing</a></p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=16 data-line-end=17 ><a id="Running_Play_Framework_Application_16"></a>Running Play Framework Application</h1>
						<p class="has-line-data" data-line-start="17" data-line-end="23">Once Play has been installed on your local machine, running the play application is quite simple:<br>
						- cd into the termal application folder<br>
						- type ‘play’ (no quotes) in console (the play application will start compiling)<br>
						- once compiled type ‘run’ (no quotes) in console (the play application will start running)<br>
						- once application is running point your web browser to <a href="http://localhost:9000">http://localhost:9000</a><br>
						- you should then be able to see Termal running locally on your machine.</p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=24 data-line-end=25 ><a id="Input_24"></a>Input</h1>
						<p class="has-line-data" data-line-start="25" data-line-end="26">The user inputs comma separated zip codes into the input box. Temperatures for those zip codes are fetched from the Accuweather API when the user presses enter or clicks the search button.</p>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=27 data-line-end=28 ><a id="Output_27"></a>Output</h1>
						<ul style="margin-left:5%;">
						<li class="has-line-data" data-line-start="28" data-line-end="29">JSON data results of fetched zip codes made to Accuweather API are displayed in the UI and styled with Twitter Bootstrap for liquid design purposes.</li>
						<li class="has-line-data" data-line-start="29" data-line-end="30">The Application uses Twitter Bootstrap in order to recalculate layout depending on users browser window size. Making the web application display data seamlessly regardless of device user is on.</li>
						<li class="has-line-data" data-line-start="30" data-line-end="31">Web application renders layout as a mobile application if user is accessing webpage from a mobile device or tablet, and as a standard webpage if on a computer or laptop, adapting to size of user’s browser window.</li>
						<li class="has-line-data" data-line-start="31" data-line-end="32">If on a mobile device or tablet, user can save application to Home Screen and appropriate .ico files are utilized in order to make it appear as a native mobile OS application on user’s device homescreen.</li>
						<li class="has-line-data" data-line-start="32" data-line-end="33">JSON data is ‘glued’ or passed to html in index.scala.html file via main.js which uses the AngularJS framework.</li>
						<li class="has-line-data" data-line-start="33" data-line-end="34">AngularJS also renders separate weather information div containers for each zip code fetched in UI when user presses enter or clicks the search button.</li>
						<li class="has-line-data" data-line-start="34" data-line-end="35">JSON object of the first zip code entered is also output to view.</li>
						<li class="has-line-data" data-line-start="35" data-line-end="36">A table with returned JSON objects is also output to view.</li>
						<li class="has-line-data" data-line-start="36" data-line-end="51">In each weather information div containers the following information is displayed:
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="37" data-line-end="38">City name</li>
						<li class="has-line-data" data-line-start="38" data-line-end="39">Weather text (e.g. cloudy, sunny, etc.)</li>
						<li class="has-line-data" data-line-start="39" data-line-end="40">Feels like (in Celsius and Fahrenheit)</li>
						<li class="has-line-data" data-line-start="40" data-line-end="41">Wind chill (in Celsius and Fahrenheit)</li>
						<li class="has-line-data" data-line-start="41" data-line-end="42">Is it raining?</li>
						<li class="has-line-data" data-line-start="42" data-line-end="43">Is it day time?</li>
						<li class="has-line-data" data-line-start="43" data-line-end="44">Humidity</li>
						<li class="has-line-data" data-line-start="44" data-line-end="45">Precipitation probability</li>
						<li class="has-line-data" data-line-start="45" data-line-end="46">Wind speed</li>
						<li class="has-line-data" data-line-start="46" data-line-end="47">Wind direction</li>
						<li class="has-line-data" data-line-start="47" data-line-end="48">Temperature in Celsius</li>
						<li class="has-line-data" data-line-start="48" data-line-end="49">Temperature in Fahrenheit</li>
						<li class="has-line-data" data-line-start="49" data-line-end="50">Time of observation</li>
						<li class="has-line-data" data-line-start="50" data-line-end="51">Link to accuweather webpage for specific zip code.</li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="51" data-line-end="52">User can also use a radio button selection to switch Temperature information from Fahrenheit to Celsius and vice-versa, for each individual weather information div containers.</li>
						<li class="has-line-data" data-line-start="52" data-line-end="54">The application also fetches user’s IP address for future weather information by IP Address integration.</li>
						</ul>
						<br/>
						<br/>
						<h1 class="code-line" data-line-start=54 data-line-end=55 ><a id="Steps_54"></a>Steps</h1>
						<p class="has-line-data" data-line-start="55" data-line-end="56">For this program we have one main function called index() and documentation() in Application.java which is handled by the play framework to render the index.scala.html page and the documentation.scala.html page respectively. The following functions are then used.</p>
						<ul style="margin-left:5%;">
						<li class="has-line-data" data-line-start="57" data-line-end="58">
						<p class="has-line-data" data-line-start="57" data-line-end="58">This program uses Play Framework as restful high velocity web framework fro Java and Scala, JavaScript, AngularJS, LoDashJS, HTML, CSS, Twitter Bootstrap, Heroku’s Git &amp; Play! app deployment integration, and the Accuweather API.</p>
						</li>
						<li class="has-line-data" data-line-start="58" data-line-end="60">
						<p class="has-line-data" data-line-start="58" data-line-end="59">User inputs comma separated zip codes into the input field in index.scala.html, and clicks search or presses enter.</p>
						</li>
						<li class="has-line-data" data-line-start="60" data-line-end="61">
						<p class="has-line-data" data-line-start="60" data-line-end="61">getTemps() in view is handled by AngularJS which makes a call to the getTemps() function in main.js</p>
						</li>
						<li class="has-line-data" data-line-start="61" data-line-end="62">
						<p class="has-line-data" data-line-start="61" data-line-end="62">getTemps() calls getIpaddress(), getAllLocations() and getIPLocation() services in MainController of AngularJS framework which uses respective functions in AngularJS factory of demoApp.</p>
						</li>
						<li class="has-line-data" data-line-start="62" data-line-end="63">
						<p class="has-line-data" data-line-start="62" data-line-end="63">getAllLocations() calls getAllTemps(), getAllTempsPrecipitation(), and savePostData() from service factory of AngularJS</p>
						</li>
						<li class="has-line-data" data-line-start="63" data-line-end="66">
						<p class="has-line-data" data-line-start="63" data-line-end="64">getAllLocations() parses zipcodes, maps zipcode and promises to return an array of location keys and makes an http request to Accuweather Location API for each zip code entered. This is necessary to obtain the Location Key of each zip code in order to make a HTTP GET request to the Accuweather Current Conditions API which uses the Location Key and API key as part of the HTTP GET request URL, instead of a zip code. Since the Accuweather Current Conditions API does not take a zip code as a parameter and instead uses a Location Key, this is a necessary step.</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="64" data-line-end="65">Make a HTTP GET request to Accuweather Locations API to return Location Key for Accuweather Current Conditions API using the following URL replacing ZIPCODE_HERE with user inputed zip code values and API_KEY with API key.</li>
						<li class="has-line-data" data-line-start="65" data-line-end="66"><a href="https://dataservice.accuweather.com/locations/v1/postalcodes/US/search?apikey=API_KEY&amp;q=ZIPCODE_HERE">https://dataservice.accuweather.com/locations/v1/postalcodes/US/search?apikey=API_KEY&amp;q=ZIPCODE_HERE</a></li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="66" data-line-end="67">
						<p class="has-line-data" data-line-start="66" data-line-end="67">getAllLocations() returns the array of Location Keys for each zip code entered.</p>
						</li>
						<li class="has-line-data" data-line-start="67" data-line-end="71">
						<p class="has-line-data" data-line-start="67" data-line-end="68">getAllTemps() we can then call the function getAllTemps() for each zip code entered with the returned Location Key information obtained from Accuweather Locations API in order to obtain Current weather Conditions for each zip code entered.</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="68" data-line-end="69">The Accuweather Current Conditions API uses the Location Key obtained from Accuweather Location API HTTP GET request to return a JSON object of current conditions for each location key requested.</li>
						<li class="has-line-data" data-line-start="69" data-line-end="70">Makes a HTTP GET request to the Accuweather Current Conditions API using the location key obtained from Accuweather Locations API for each zip code entered using the following URL replacing LOC_KEY with the returned values for Location Key of the Locations API HTTP GET request and API_KEY with API key</li>
						<li class="has-line-data" data-line-start="70" data-line-end="71"><a href="https://dataservice.accuweather.com/currentconditions/v1/LOC_KEY?apikey=API_KEY&amp;details=true">https://dataservice.accuweather.com/currentconditions/v1/LOC_KEY?apikey=API_KEY&amp;details=true</a></li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="71" data-line-end="76">
						<p class="has-line-data" data-line-start="71" data-line-end="72">getAllTempsPrecipitation() for precipitation probability we have to make another HTTP GET request to a separate Accuweather API called Forecast API, specifically the 1 Day of Daily Forecasts get method of the Accuweather Forecast API.</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="72" data-line-end="73">The Accuweather Forecast API URL, similarly to the Current Conditions API URL does not take a zip code as a parameter, but rather a Location Key obtained from the HTTP GET request made to the Accuweather Locations API.</li>
						<li class="has-line-data" data-line-start="73" data-line-end="74">Since we have already obtained the Location Keys for each zip code previously in the getAllLocations() function it is unecessary to make a new call to the Accuweather Locations API so we instead use the same values to make the Forecast API HTTP GET request.</li>
						<li class="has-line-data" data-line-start="74" data-line-end="75">Makes a HTTP GET request to the Accuweather Forecast API using the location key obtained from Accuweather Locations API for each zip code entered using the following URL replacing LOC_KEY with the returned values for Location Key of the Locations API HTTP GET request and API_KEY with API key</li>
						<li class="has-line-data" data-line-start="75" data-line-end="76"><a href="https://dataservice.accuweather.com/forecasts/v1/daily/1day/LOC_KEY?apikey=API_KEY&amp;details=true">https://dataservice.accuweather.com/forecasts/v1/daily/1day/LOC_KEY?apikey=API_KEY&amp;details=true</a></li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="76" data-line-end="77">
						<p class="has-line-data" data-line-start="76" data-line-end="77">getIpAddress() makes a HTTP GET request to the IPIFY API to obtain user’s IP Address</p>
						</li>
						<li class="has-line-data" data-line-start="77" data-line-end="79">
						<p class="has-line-data" data-line-start="77" data-line-end="78">getIpLocation() is similar to getAllLocations() but instead it uses the Accuweather Locations API IP Address Search get method to obtain a Location Key instead of the Accuweather Locations API Postal Code Search get method.</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="78" data-line-end="79">getIpLocation() then also uses that Location Key to call getAllTemps() and getAllTempsPrecipitation()</li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="79" data-line-end="88">
						<p class="has-line-data" data-line-start="79" data-line-end="80">savePostData() makes HTTP POST request to the /save URL which is handled by the Play Framework routes to call the controllers.ApiController.savePost() method in Controllers -&gt; ApiController -&gt; savePost()</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="80" data-line-end="81">in main.js in under MainControllers implementation of savePostData() two objects are created one for weather and one for location</li>
						<li class="has-line-data" data-line-start="81" data-line-end="82">a mergedlist is instantiated with weather and location data which is pushed to locations and weathers arrays</li>
						<li class="has-line-data" data-line-start="82" data-line-end="83">pushed data is stored in postData which is the argument the savePostData function takes as input.</li>
						<li class="has-line-data" data-line-start="83" data-line-end="84">when savePostData() function is called by AngularJS, the /save URL is handled by the Play framework routes functionality to call controllers.ApiController.savePost() in Controllers -&gt; ApiController passing postData as a HTTP POST to the savePost() function in ApiController.java</li>
						<li class="has-line-data" data-line-start="84" data-line-end="85">ApiContoller implements the Jackson Library to bind the JSON data to a JsonNode called json which initializes a PostData.java instance which has a List&lt;Weather&gt; weathers and List&lt;Location&gt; locations as private attributes. A</li>
						<li class="has-line-data" data-line-start="85" data-line-end="86">savePost() then uses the getWeathers and getLocations function in PostData to set values for List&lt;Weather&gt; and List&lt;Location&gt; data object of the Weather.java and Location.java</li>
						<li class="has-line-data" data-line-start="86" data-line-end="87">savePost() uses a Java 8 forEach loop to output to console the originally JSON object as attributes of the Weather.java and Location.java classes.</li>
						<li class="has-line-data" data-line-start="87" data-line-end="88">savePost() then outputs via console the weather and location information via System.out.println(weather) and System.out.println(location) respectively.</li>
						</ul>
						</li>
						<li class="has-line-data" data-line-start="88" data-line-end="92">
						<p class="has-line-data" data-line-start="88" data-line-end="89">In index.scala.html the appropriate weather information is displayed in a weather information div container that uses the AngularJS ‘ng-repeat’ to display each of the zip codes weather information in separate containers passing the data handled by AngularJS to the view via the data-ng-controller=“MainController” -&gt; ng-repeat=“result in processedData” AngularJS HTML tags</p>
						<ul style="margin-left:10%!important;">
						<li class="has-line-data" data-line-start="89" data-line-end="90">the getTemps() function in AngularJS demoApp.controller(“MainController”, function($scope, Service, $q) is called from the view in index.scala.html as an onClick action when the user presses enter or clicks the search button using the data-ng-click=“getTemps()” AngularJS HTML tag.</li>
						<li class="has-line-data" data-line-start="90" data-line-end="91">index.scala.html then renders the JSON object of the first zip code entered and outputs it to the UI</li>
						<li class="has-line-data" data-line-start="91" data-line-end="92">index.scala.html then renders the JSON object of each zip code fetched from the Accuweather API in a Table format.</li>
						</ul>
						</li>
						</ul>
					</div>
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
		  (function(i,s,o,g,r,a,m)"""),format.raw/*251.29*/("""{"""),format.raw/*251.30*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*251.80*/("""{"""),format.raw/*251.81*/("""
		  (i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*252.40*/("""}"""),format.raw/*252.41*/(""",i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  """),format.raw/*254.5*/("""}"""),format.raw/*254.6*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');
		
		  ga('create', 'UA-46957200-1', 'sleepy-garden-8606.herokuapp.com');
		  ga('send', 'pageview');
		
		</script>
		-->
	 	<script src=""""),_display_(Seq[Any](/*261.18*/routes/*261.24*/.Assets.at("third/jquery/jquery-1.10.2.min.js"))),format.raw/*261.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*262.17*/routes/*262.23*/.Assets.at("third/bootstrap/js/bootstrap.js"))),format.raw/*262.68*/("""" type="text/javascript"></script>
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
                    DATE: Tue Dec 10 00:35:36 EST 2019
                    SOURCE: /Users/tajunker/Computer Engineering IUPUI/CSCI 240/Homework/termal/app/views/documentation.scala.html
                    HASH: 6aea8863ca8de8391ba996e9e666080b2be2af60
                    MATRIX: 863->0|1345->446|1360->452|1430->499|1519->552|1534->558|1615->616|1704->669|1719->675|1783->717|1872->770|1887->776|1976->842|2062->892|2077->898|2153->951|2239->1001|2254->1007|2310->1041|2401->1096|2416->1102|2478->1142|2572->1200|2587->1206|2659->1255|2755->1315|2770->1321|2839->1367|2935->1427|2950->1433|3019->1479|3088->1512|3103->1518|3170->1563|3240->1597|3255->1603|3327->1653|3417->1707|3432->1713|3494->1753|3637->1860|3652->1866|3720->1912|3822->1978|3837->1984|3903->2028|3990->2079|4005->2085|4080->2138|4167->2189|4182->2195|4237->2228|5357->3312|5372->3318|5434->3357|5554->3441|5569->3447|5642->3497|27770->25597|27800->25598|27879->25648|27909->25649|27978->25689|28008->25690|28167->25821|28196->25822|28449->26038|28465->26044|28535->26091|28623->26142|28639->26148|28707->26193
                    LINES: 29->1|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|60->32|79->51|79->51|79->51|80->52|80->52|80->52|279->251|279->251|279->251|279->251|280->252|280->252|282->254|282->254|289->261|289->261|289->261|290->262|290->262|290->262
                    -- GENERATED --
                */
            