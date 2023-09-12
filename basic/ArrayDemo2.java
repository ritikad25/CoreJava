package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[] =new int[5];
		int sum=0;
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//input stream - System.in
		
		//Dynamic initialization of an array
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter a value:");
			arr[i]=Integer.parseInt(bufferedReader.readLine());	
		}
		for(int i=0;i<5;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum : "+sum);

	}

}
