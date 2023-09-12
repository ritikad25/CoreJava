package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name : ");
		String name=sc.nextLine();
		System.out.println("name: "+name);
		System.out.println("Enter ur rollno: ");
		int rollno=sc.nextInt();
		System.out.println("Rollno: "+rollno);
		System.out.println("Enter ur Percentage: ");
		float percentage=sc.nextFloat();
		System.out.println("Percentage: "+percentage);
		System.out.println("-----Buffered Reader------ ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name : ");
		String fname = br.readLine();
		System.out.println("Full name: "+fname);
		System.out.println("Enter ur rollno: ");
		int rollno1=Integer.parseInt(br.readLine());
		System.out.println("Rollno: "+rollno1);

	}

}
