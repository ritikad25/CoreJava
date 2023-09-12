package basic;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=10;
		int max =a>b ? a : b;
		System.out.println("Max : " +max);
		
		int x=55;
		String no=(x%2==0) ? "Even" : "Odd";
		System.out.println("check if " +x+ " is even or odd:" +no);
	}

}
