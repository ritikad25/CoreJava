package basic;

class Students{
	public static int no;
	public static String name;
}
public class StaticVariableEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students.no=501;
		Students.name="Rohan";
		System.out.println(Students.no+" "+Students.name);
	}

}
