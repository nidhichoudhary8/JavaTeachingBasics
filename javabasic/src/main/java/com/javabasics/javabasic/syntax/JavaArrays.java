package com.javabasics.javabasic.syntax;

/**
 * Arrays are objects that store multiple variables of the same type. However, an array itself is an object on the heap
 * 
 * which stores a fixed-size sequential collection of elements of the same type.	
 * 
 * Creating Arrays
		You can create an array by using the new operator with the following syntax −

	Syntax
		dataType[] arrayRefVar = new dataType[arraySize];
		int[] values = new int[5];
		values[0]= 0;
		values[1]=4;
		
		values[1];==> 4
		
		int[] values = {1,2,3}
		
		
		


 * @author dell
 *
 */
public class JavaArrays {

	public static void main(String[] args) {
	      double[] myList = {1.9, 2.9, 3.4, 3.5};
	  //    double[][] myList2d = {1.9, 2.9, 3.4, 3.5};

	      // Print all the array elements
	      
	      // 0,1,2,3
	      
	      // 0,0 0,1,0,2  --- i=0 j = 0,1,2
	/**      i
	 j     1(0,0)     2(0,1)
	 j     3(1,0)     4(1,1) **/
	      
	      // 2D Array Iteration
	      for (int i = 0; i < myList.length; i++) { //0,1   i=0   i=1
	    	  for (int j = 0; j < myList.length; j++) { // 0,1
	 	        // System.out.println(myList[i][j] + " ");
	 	      }
	      }
	      
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	     
	      // Summing all elements
	      
	      
	      // Finding the largest element
	      
	   }
}
