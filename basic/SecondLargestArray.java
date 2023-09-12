package basic;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestArray {
	public static int Second(int a[], int total) {
		Arrays.sort(a);
		return (a[1]);
	}
	public static void main(String[] args) {
		int a[]= {24,45,15,90,61};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("No of Elements:");
//		int n=sc.nextInt();
		System.out.println("Second Smallest : " + Second(a,5));
	}
}