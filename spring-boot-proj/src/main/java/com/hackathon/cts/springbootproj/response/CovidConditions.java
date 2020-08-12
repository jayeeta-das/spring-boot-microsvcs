package com.hackathon.cts.springbootproj.response;

public class CovidConditions {
	
	private Integer noOfAffected;
	private Double recoveryPercentage;
	private Double predictedRecoverPercentage;
	private String travelPrediction;
	public Integer getNoOfAffected() {
		return noOfAffected;
	}
	public void setNoOfAffected(Integer noOfAffected) {
		this.noOfAffected = noOfAffected;
	}
	public Double getRecoveryPercentage() {
		return recoveryPercentage;
	}
	public void setRecoveryPercentage(Double recoveryPercentage) {
		this.recoveryPercentage = recoveryPercentage;
	}
	public Double getPredictedRecoverPercentage() {
		return predictedRecoverPercentage;
	}
	public void setPredictedRecoverPercentage(Double predictedRecoverPercentage) {
		this.predictedRecoverPercentage = predictedRecoverPercentage;
	}
	public String getTravelPrediction() {
		return travelPrediction;
	}
	public void setTravelPrediction(String travelPrediction) {
		this.travelPrediction = travelPrediction;
	}

}
