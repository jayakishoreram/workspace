package com.jk.corejave.enum1;

public class TestEnum {

	public static void main(String[] args) {
		for(Batch batch: Batch.values()){
			System.out.print("BATCH: "+ batch+ "  Ordinal: "+ batch.ordinal());
			System.out.println("  Start time: "+ batch.getstartTime() +"  End Time:  "+ batch.getEndTime());
		}
	}

}
