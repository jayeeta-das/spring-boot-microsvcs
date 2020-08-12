package com.hackathon.cts.springbootproj.response;

import java.util.ArrayList;
import java.util.List;

public class SearchResult {
	
	private String place;
	private String travelMonth;
	private String travelDate;
	private String weatherConditions;
	private List<String> touristSpots = new ArrayList<>();
	private CovidConditions covidConditions;
	
	public String getWeatherConditions() {
		return weatherConditions;
	}
	public void setWeatherConditions(String weatherConditions) {
		this.weatherConditions = weatherConditions;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTravelMonth() {
		return travelMonth;
	}
	public void setTravelMonth(String travelMonth) {
		this.travelMonth = travelMonth;
	}
	public String getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}
	public List<String> getTouristSpots() {
		return touristSpots;
	}
	public void setTouristSpots(List<String> touristSpots) {
		this.touristSpots = touristSpots;
	}
	public CovidConditions getCovidConditions() {
		return covidConditions;
	}
	public void setCovidConditions(CovidConditions covidConditions) {
		this.covidConditions = covidConditions;
	}
	

}
