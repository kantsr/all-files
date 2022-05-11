package com.pluralsight.webfunction;

public class TollRecord {
	private String stationId;
	private String licensePlate;
	private String timestamp;
	
	
	
	public TollRecord() {
		
	}
	public TollRecord(String stationId, String licensePlate, String timestamp) {
		super();
		this.stationId = stationId;
		this.licensePlate = licensePlate;
		this.timestamp = timestamp;
	}
	public String getStationId() {
		return stationId;
	}
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	

}
