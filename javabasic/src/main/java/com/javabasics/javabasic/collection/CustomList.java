package com.javabasics.javabasic.collection;

import java.util.ArrayList;
import java.util.List;

// List, Map, Set
// List => if we want to store n number of elements we can use this.

// String[] str = new String[3];
// str[0] = "Nidhi"
// str[1]="test"
public class CustomList {

	public static void main(String[] args) {
		
		String[] str= {"nidhi","test","",};
		CustomList customList = new CustomList();
		customList.addValuestoList(str);
	}

	private  void addValuestoList(String[] str) {
		List list=new ArrayList();
		
		for(String val:str) {
			list.add(val);
		}
		
		String[] testArr = new String[2];
		
		System.out.println(list);
	}

}
