import java.util.Calendar;
import java.util.Date;


public class Test {
	
	public static void main(String[] args) {
		
		/*Long datasetId = 100000000030089l;
		String sDatasetId = datasetId.toString();
		System.out.println("sDatasetId: "+ sDatasetId);
		String datasetSub = sDatasetId.substring(10);
		System.out.println("datasetSub: "+ datasetSub);
		String datasetSource = "DYNS" + datasetSub + "_";
		System.out.println("datasetSource: "+datasetSource);
		//DYNS30089_
*/		
		
		/*
		String calcRule = "DATE_DIFF({Date1}| {Date2}| 'HOURS')";
		
		String uCalcRule = calcRule.replace('|', ',');
		System.out.println("uCalcRule: "+ uCalcRule);*/
		
		
		String s1 = "TODAY+4";
		
		char opr = s1.charAt(s1.length() -2);
		char opd = s1.charAt(s1.length() -1);
		String operand = s1.substring(s1.length()-2);
		System.out.println("Index of + "+ operand.indexOf("-"));
		System.out.println("OPERAND: "+ operand);
		System.out.println("OPERAND: "+ Integer.valueOf(operand));
		System.out.println("OPR: "+ opr);
		System.out.println("OPD: "+ opd);
		
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE,  Integer.valueOf(operand));
		Date colValue = today.getTime();
		
		System.out.println("colValue: "+ colValue);
		
		switch (opr) {
		case '+':
			
			break;

		default:
			break;
		}
		
	}

}
