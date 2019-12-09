package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http;

import views.html.*;
import play.api.libs.json.Json;


public class Application extends Controller {


   
    public static Result index() {
        return ok(index.render());
    }

    public static Result documentation() {
        return ok(documentation.render());
    }

    

}
