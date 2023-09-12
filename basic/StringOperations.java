package basic;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Cup Of Tea";
		String str1="coffee";
		String str2="MILK";
		
		System.out.println("length of the string is : "+ str.length() );
		System.out.println("Uppercase of string is : "+ str1.toUpperCase());
		System.out.println("Lowercase of string is :  "+str2.toLowerCase());
		System.out.println("concat String : " + str.concat("Sugar"));
		System.out.println("index of Tea : "+ str.indexOf("T"));
		System.out.println("last index of e : "+str.lastIndexOf('e') );
		System.out.println("replace String : " +str.replace("Tea","Milk"));
		System.out.println("substring: "  +str.substring(2,5));
		System.out.println("trim : " +str.trim());
		
		char[] c=new char[10];
		str.getChars(0, 9, c, 1);
		System.out.println("GetChar : "+Arrays.toString(c));
		
		String str3="nice to meet you";
		String a[]=str3.split(" ",5);
		System.out.println("splited elements:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		}
		
		String str4= "";
		System.out.println("length: " +str4.length());
		System.out.println("is String is empty : " +str4.isEmpty() );
		System.out.println("is String is Blank : " +str4.isBlank());
				
		System.out.println("Hundred".endsWith("red"));
		System.out.println("Dog".startsWith("Do"));
		
		System.out.println("repeat:"+str2.repeat(5) );
	}
}
