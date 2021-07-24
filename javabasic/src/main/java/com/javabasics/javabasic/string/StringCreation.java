package com.javabasics.javabasic.string;

/**
 * Memory allotment of String

Whenever a String Object is created as a literal, the object will be created in String constant pool. 
This allows JVM to optimize the initialization of String literal

Creating a String

1.String literal
  String s = “learn”;
  String s1 = “learn”;
  String s2 = “learn2”;

2.Using new keyword
	String s = new String (“learn”);
	
3. StringBuffer

4. StringBuilder***

Here the JVM checks the String Constant Pool. 
If the string does not exist, then a new string instance is created and placed in a pool. 
If the string exists, then it will not create a new object. Rather, it will return the reference to the same instance. 
The cache which stores these string instances is known as the String Constant pool or String Pool.

== -> it will check the object reference only
equals -> it will check the value .


 * @author dell
 *
 */
public class StringCreation {

	public static void main(String args[])
    {
        String s1 = "TAT"+"TEST";
        String s2 = "T2";
        String s6 = "T3";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s3);
        System.out.println(s4==s3);
        
        //  toString method
        StringBuilder builder = new StringBuilder();
        builder.append("TAT");
        builder.append("TEST");
        builder.append("T2");
        builder.append("T3");
        System.out.println(builder.toString());
        
        // buffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("TAT");
        buffer.append("TEST");
        buffer.append("T2");
        buffer.append("T3");
        System.out.println(buffer.toString());
    }
}
