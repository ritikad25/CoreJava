package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)  throws NumberFormatException, IOException {
	
		int ar[]; //array declared without size
		int[] ar1; //array declared without size
		
		
		//initialization static, dynamic
		
		int ar3[]= {11,22,33,44,55,66,77,88,99};
		
		//loop through the static array elements
		for(int i=0;i<ar3.length;i++)
		{
			System.out.println(ar3[i]+" ");
		}
		
		
		int ar2[]=new int[10];//array declaration with size
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//input stream - System.in
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		//Dynamic initialization of an array
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter a value:");
			ar2[i]=Integer.parseInt(bufferedReader.readLine());
			
		}
		//accessing the array elements- looping through
		for(int i=0;i<10;i++)
		{
			System.out.print(ar2[i]+" ");			
		}
	}
}