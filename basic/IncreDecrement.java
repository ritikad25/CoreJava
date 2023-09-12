package basic;

public class IncreDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=7;
		int x=a++;
		System.out.println("Post Increment : " +x);//5
		int y=++b;
		System.out.println("Pre Increment : " +y);//8

		//now a=6 b=8
		int p=a--;
		System.out.println("Post Decrement : " +p);//6
		int q=--b;
		System.out.println("Pre Decrement : " +q);//7
		
		int z=111;
		int z1=~z;
		System.out.println("Inverting : " +z1);
		int a1=20;
		System.out.println("Right Shift : " +(a1>>2));
		System.out.println("Left Shift : " +(a1<<2));
	}

}
