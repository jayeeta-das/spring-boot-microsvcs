package com.hackathon.cts.springbootproj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.hackathon.cts.springbootproj.response.CovidConditions;
import com.hackathon.cts.springbootproj.response.SearchResult;

@RestController
public class ReturnSearchResultService {
	
	@RequestMapping(path="/getResult", produces=MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String returnSearchResult(@RequestParam String input) {
		System.out.println("***********"+input);
		String results = "No Search Results to show.";
		if(input.contains("mountain")) {
			results = populateMountainOptions();
		}
		
		
		return results;
		
	}

	private String populateMountainOptions() {
		List<SearchResult> resultList = new ArrayList<>();
		SearchResult result1 = populateForDarjeeling();
		resultList.add(result1);
		
		 return new Gson().toJson(result1);
		
		
	}

	private SearchResult populateForDarjeeling() {
		SearchResult result1 = new SearchResult();
		result1.setPlace("Darjeeling");
		result1.setTravelMonth("September");
		result1.setTravelDate("2020-10-30");
		result1.getTouristSpots().add("Rock Garden");
		result1.getTouristSpots().add("Ganga Maya");
		result1.getTouristSpots().add("Tiger Hill");
		result1.getTouristSpots().add("Nathula Passr");
		result1.getTouristSpots().add("Tea Garden");
		result1.setWeatherConditions("Mild rainy, moderately cold");
		CovidConditions covidConds= new CovidConditions();
		covidConds.setNoOfAffected(238);
		covidConds.setRecoveryPercentage(86.1);
		covidConds.setPredictedRecoverPercentage(93.2);
		covidConds.setTravelPrediction("Safe to Travel with proper measures of Social Distancing.");
		result1.setCovidConditions(covidConds);
		return result1;
	}
	
	

}
