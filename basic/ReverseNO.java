package basic;

public class ReverseNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=54321,rev=0,rem;
		for(int i=0;i<=no;i++) {
		//while(no!=0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse no is : "+rev);

	}

}
