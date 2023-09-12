package basic;

class StudentInfo{
	int roll_no=1;
	String name="ritika";
	String addr="india";
}

public class InstanceVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StudentInfo sd1=new StudentInfo();
		sd1.roll_no=101;
		sd1.name="monika";
		sd1.addr="pune";
		
		StudentInfo sd2=new StudentInfo();
		sd2.roll_no=102;
		sd2.name="kirti";
		sd2.addr="mumbai";
		
		System.out.println(sd1.roll_no);
		System.out.println(sd1.name);
		System.out.println(sd1.addr);
		*/
		StudentInfo sd2=new StudentInfo();
		System.out.println(sd2.roll_no);
		System.out.println(sd2.name);
		System.out.println(sd2.addr);
	}

}
