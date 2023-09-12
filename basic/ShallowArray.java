package basic;

public class ShallowArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		int b[][]=a.clone();
		
		System.out.println(a[0]==b[0]);
		System.out.println(a[1]==b[1]);
		
	}
}
