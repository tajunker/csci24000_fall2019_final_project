package controllers;

public class Weather {
	private String weatherText;
	private String tempF;
	private Integer tempC;
	private String  name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWeatherText() {
		return weatherText;
	}

	public void setWeatherText(String weatherText) {
		this.weatherText = weatherText;
	}

	public String getTempF() {
		return tempF;
	}

	public void setTempF(String tempF) {
		this.tempF = tempF;
	}

	public Integer getTempC() {
		return tempC;
	}

	public void setTempC(Integer tempC) {
		this.tempC = tempC;
	}

	@Override
	public String toString() {
		
		System.out.println("weathertext: " + getWeatherText() + " tempF: " + getTempF() + " tempC: " + getTempC()+" name "+getName());
		return super.toString();
	}

}
