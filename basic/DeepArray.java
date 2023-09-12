package basic;

public class DeepArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int c[]=a.clone();
		
		System.out.println(a==c);  //false

		System.out.print("Array is : ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
