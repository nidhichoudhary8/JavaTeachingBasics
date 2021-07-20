package com.javabasics.javabasic.syntax;

/**
 * Java variables
 * 1.Instance Variable
 * 2.Class variable or Static Variable.
 * 3. Global Variable
 * @author dell
 *
 */
public class JavaVariables {

	// Instance Variable
	public String pencilColor;
	
	public JavaVariables(String studentName,String studentRollNumber) {
		this.studentName=studentName;  // this keyword 
		this.studentRollNumber=studentRollNumber;
	}

	// Class Variable or Static Variable.
	public static String collageName="Anna Univer";
	
	public String studentName;
	public String studentRollNumber;

	public void addition(int x, int y) {
		int z = x + y; // Variable z is called Local Variable.
		
		double salary = 25*80; // Local Variable
	}
	
	public String toString() {
		return collageName +"   "+studentName+"  "+studentRollNumber;
	}
}
