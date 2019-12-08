
package controllers;
import java.util.List;

public class PostData {
	private List<Weather> weathers;
	private List<Location> locations;
	public List<Weather> getWeathers() {
		return weathers;
	}
	public void setWeathers(List<Weather> weathers) {
		this.weathers = weathers;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

}
