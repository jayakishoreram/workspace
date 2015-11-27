package com.jk.corejave.enum1;

public enum Batch {
	
	MORNING("9:00","12:00"), AFTERNOON("2:00","5:00"), EVENING("5:00","7:00"), NIGHT("9:00","12:00");
	
	private String startTime;
	
	private String endTime;
	
	private Batch(String startTime, String endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public String getstartTime(){
		return this.startTime;
	}

	public String getEndTime(){
		return this.endTime;
	}
}
