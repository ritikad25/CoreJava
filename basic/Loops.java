package basic;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------For loop------");
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("------While loop------");
		int j=1;
		while(j<=10) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		System.out.println("------DoWhile loop------");
		int k=1;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<=10);
		
	}

}
