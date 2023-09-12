package basic;

public class FactorialNo {
	static int factNo(int num) {
		if(num==0)
			return 1;
		else
			return(num*factNo(num-1));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Recursion Function----");
		int f=1,number=4;
		f=factNo(number);
		System.out.println("Factorial : "+f);
//---------------------------------------------------------------------------------------------				
		System.out.println("----For Loop----");
		int fact = 1,no=5;
		for (int i=1; i <= no; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
//---------------------------------------------------------------------------------------------		
		System.out.println("----While loop----");
		int j=1,fac=1,num=6;
		while(j<=num) {
			fac=fac*j;
			j++;
		}
		System.out.println("Factorial : "+fac);
	}
}
