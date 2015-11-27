package com.jk.corejava.string;

public class StringSplliter {

	public static void main(String[] args) {
		String s = "http://stm10303.us.oracle.com:9000/workspace/?layout=full&module=wksp.relatedcontent&repository_uuid=3dbac91c-0eed-42f0-81df-0e3753655cb9&repository_path=%2F0WorkspaceImport";
		String s1[] = s.split("\\?");

		for(String ss1: s1)
			System.out.println("String array: " + ss1);
	}
}
