package basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Using for_loop----");
		String s="RITIKA";
		System.out.println("Original String : "+s);
		int length = s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
		System.out.println();
		System.out.println("----Using String_Buffer----");
		StringBuffer s1=new StringBuffer("lahpad");
		System.out.println("Original String : "+s1);
		System.out.println("Reverse String : "+s1.reverse());
		
	}
}