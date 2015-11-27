package com.jk.office;

public class Test3 {

	public static void main(String[] args) {

		/*
		 * If Int1 equals 100, value = 750 • Else If Num1 equals 100.00000,
		 * value = 850 • Else If Entity contains ‘LE104’, value = Int1 • Else If
		 * Entity contains ‘LE101’, value = 1050 • Else, value = 950
		 */

		String calcDef = "IF;Int1 EQUALS 100;750|ELSEIF;Num1 EQUALS 100.00000;850|ELSE;950";

		String[] conditionArray = calcDef.split("\\|");

		/*
		 * for(String condition:conditionArray){
		 * System.out.println("Condition: "+ condition); }
		 */

		for (String condition : conditionArray) {
			System.out.println("Condition: " + condition);

			String[] conditionItems = condition.split(";");
			/*
			 * for(String conditionItem: condationItems){
			 * System.out.println("ConditionItem: "+ conditionItem);
			 * 
			 * }
			 */
			//System.out.println("conditionItems[0]: "+conditionItems[0]);
			if (conditionItems[0].equals( "IF" ) || conditionItems[0].equals( "ELSEIF" ) ) {

				String conditionElement = conditionItems[1];
				System.out.println("conditionElement: " + conditionElement);

				String cElement[] = conditionElement.split(" ");
				String operand1 = cElement[0];
				String operator = cElement[1];
				String operand2 = null;
				System.out.println("cElement.length: "+cElement.length);
				if (cElement.length > 2) {
					operand2 = cElement[2];
				}
				System.out.println("operand1: " + operand1 + " operator "
						+ operator + " operand2 " + operand2);

			}

		}

	}

}
