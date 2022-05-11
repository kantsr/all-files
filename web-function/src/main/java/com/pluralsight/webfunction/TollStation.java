package com.pluralsight.webfunction;

public class TollStation {

	private String stationId;
	private float mileMaker;
	private Integer stallCount;
	
	
	
	public TollStation() {
		super();
	}


	public TollStation(String stationId, float mileMaker, Integer stallCount) {
		super();
		this.stationId = stationId;
		this.mileMaker = mileMaker;
		this.stallCount = stallCount;
	}


	public String getStationId() {
		return stationId;
	}


	public void setStationId(String stationId) {
		this.stationId = stationId;
	}


	public float getMileMaker() {
		return mileMaker;
	}


	public void setMileMaker(float mileMaker) {
		this.mileMaker = mileMaker;
	}


	public Integer getStallCount() {
		return stallCount;
	}


	public void setStallCount(Integer stallCount) {
		this.stallCount = stallCount;
	}
	

}
