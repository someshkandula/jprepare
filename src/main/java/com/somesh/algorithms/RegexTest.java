package com.somesh.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	//private static final String PATTERN = "^[a-z0-9_-]{5,15}$";

	private static final String PATTERN = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	public static void main(String args[]){ 
		List<String> values = new ArrayList<String> ();
		values.add("Jai_singh"); 
		values.add("Jai@5"); 
		values.add("jai12345");
		values.add("jai_singh");
		values.add("svenkata@cloudleaf.io");
		values.add("svenkata1");
 
		Pattern pattern = Pattern.compile(PATTERN);
		for (String value : values){
		  Matcher matcher = pattern.matcher(value);
		  if(matcher.matches()){
			  System.out.println("Username "+ value +" is valid");
		  }else{
			  System.out.println("Username "+ value +" is invalid");
		  }		  
		}
	}
}