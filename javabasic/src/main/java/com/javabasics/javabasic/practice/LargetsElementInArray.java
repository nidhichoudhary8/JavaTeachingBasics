package com.javabasics.javabasic.practice;

/**
 * int[] myList = {3, 4, 1, 2,5};
 * Find out the largest elements in array
 * @author dell
 *
 */
public class LargetsElementInArray {
public static void main(String[] args) {
	int[] myList = {3, 4, 1, 2,5,6};
	
	for(int i=0;i<myList.length;i++)
	{
		for (int j=i+1;j<myList.length;j++)
		{
			int temp=0;
			if (myList[i]<myList[j])
			{
	
				temp =myList[i];
				myList[i]=myList[j];
				myList [j]=temp;
				
				
			}
		}
	
	System.out.println(myList[0]);
	break;
	
}
}
}
}
