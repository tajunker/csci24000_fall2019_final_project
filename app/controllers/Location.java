package controllers;

public class Location {
	private String cityName;
	private String zipCode;
	private String timeZoneName;
	private String countryID;

	public Location() {
		// TODO Auto-generated constructor stub
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTimeZoneName() {
		return timeZoneName;
	}

	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	@Override
	public String toString() {
		System.out.println("cityName: " + getCityName() + " zipCode: " + getZipCode() + " timeZoneName: "
				+ getTimeZoneName() + " countryID: " + getCountryID());
		return super.toString();
	}
}
