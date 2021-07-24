package com.javabasics.javabasic.practice;

import java.util.Arrays;

/**
 * int[] myList = {3, 4, 1, 2,5};
 * Find out the largest elements in array
 * 
 *   1 0 0  -> DS and Algr....
 *   0 1 0
 *    DS -> Graph Tree -> shor -> queue , deque stack (Java Collections
 * 
 * @author dell
 *
 */
public class LargetsElementInArray {

	public static void main(String[] args) {
		int[] myList = {3, 4, 1, 2, 5};
		
		LargetsElementInArray largetsElementInArray = new LargetsElementInArray();
		System.out.println(largetsElementInArray.getLargestElement(myList));
		
		// Existing Java functions
		System.out.println("MyList Before Sorted"+Arrays.toString(myList));
		Arrays.sort(myList);
		System.out.println("MyList After Sorted"+Arrays.toString(myList));
		
		System.out.println("Min Value"+myList[0]);
		System.out.println("Max Value"+myList[myList.length-1]);
		
		// 5 values ==> 0 1 2 3 4
		// 4  0,1,2,3,  4 < 4
	}
	
	public int getLargestElement(int[] input)
	{
		int max = input[0]; // 3 4> 3 .. 4.  5 > 4.. 5...
		
		// Traverse the array each element by element 
		// if the element is max than the max variable value replace the value with element value
		
		for(int i=1;i<input.length;i++) {
			if(input[i] > max) {
				max = input[i];
			}
		}
		
		return max;
	}
}
