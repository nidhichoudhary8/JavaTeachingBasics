package com.javabasics.javabasic.syntax;

public class ClientTestDriver {

	public static void main(String[] args) {
		JavaEnums c1 = JavaEnums.RED;
		//System.out.println(c1);
		JavaVariables j1 = new JavaVariables("std1","std2");
		System.out.println(j1.toString());
		JavaVariables j2 = new JavaVariables("std3","std4");
		System.out.println(j2.toString());
	}

}

