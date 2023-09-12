package basic;

public class DataType {
	static byte b1;
	static int i1;
	static float f1;
	static double d1;
	static char c1;
	static boolean bol1;
	static String s1;
	static String arr[];

	public static void main(String[] args) {
		byte b=25;
		int i=990;		
		float f=89.75f;
		double d=450.8967d;
		char c='A';
		boolean bol=true;
		String s="Ritika";
		int a[]= {1,2,3,4,5};
		String name[]= {"Ritika","Avinash","Riya","Jay"};
		
		System.out.println("Default values of datatype:");
		System.out.println("byte:"+b1);
		System.out.println("integer:"+i1);
		System.out.println("float:"+f1);
		System.out.println("double:"+d1);
		System.out.println("char:"+c1);
		System.out.println("boolean:"+bol1);
		System.out.println("String:"+s1);
		System.out.println("Array:"+arr);
		System.out.println();
		
		System.out.println("Initialized values for data type:");
		System.out.println("byte:"+b);
		System.out.println("integer:"+i);
		System.out.println("float:"+f);
		System.out.println("double:"+d);
		System.out.println("char:"+c);
		System.out.println("boolean:"+bol);
		System.out.println("String:"+s);
		System.out.println("The Second Element is:"+a[1]);
		System.out.println("Size is:"+a.length);
		System.out.println("The Third Element is:"+name[2]);
		System.out.println("Size is:"+name.length);
		
	}
}