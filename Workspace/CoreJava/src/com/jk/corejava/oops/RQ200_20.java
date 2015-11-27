package com.jk.corejava.oops;

import java.util.HashMap;
import java.util.Map;

public class RQ200_20 {
	private Map<String, Integer> accounts = new HashMap<String, Integer>();

	public int getBalance(String accountName) {
		/*Integer total = (Integer) accounts.get(accountName); // (1)
		if (total == null)
			total = new Integer(0); // (2)
		return total.intValue(); // (3)
*/	
		return accounts.get(accountName);
	}

	public void setBalance(String accountName, int amount) {
		accounts.put(accountName, new Integer(amount)); // (4)

	}
}
