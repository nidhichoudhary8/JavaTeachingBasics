package com.javabasics.javabasic.practice;

/**
 * double[] myList = {1.9, 2.9, 3.4, 3.5};
 *  add all the elements and print the total
 * @author dell
 *
 */
public class SummingElementsinArray {
public static void main(String[] args) {
	int[] myList = {3, 4, 1, 2,5,6};
	int sum=0;
	
	for(int i=0;i<myList.length;i++)
	{
		sum= sum + myList[i];
	}
	System.out.println(sum);
}
}
}
