package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.mvc.BodyParser;
import java.util.List;
import views.html.*;
import play.libs.Json;


public class ApiController extends Controller {

   
    @BodyParser.Of(BodyParser.Json.class)

    public   static Result savePost() {
        JsonNode json = request().body().asJson();
             final PostData resource = Json.fromJson(json, PostData.class);
            List<Weather> weathers=resource.getWeathers();
            List<Location> locations =resource.getLocations();
            System.out.println("================================= weather=============================================");
            for(Weather weather:weathers){
                System.out.println(weather);

            }
            System.out.println("================================= location=============================================");
            for(Location location:locations){

             System.out.println(location);
            }
            System.out.println("=====================================================================================");
        return ok("Hello " + json);

    }




}
