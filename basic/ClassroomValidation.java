package basic;
class Student{
	String name;
	int score;
	public Student(String name,int score) {
		this.name=name;
		this.score=score;
	}
}
class Classrom{
	public String registerStudent(Student stud) {
		//if(!stud.name.matches("A-Z+")) {
		if(!stud.name.equals(stud.name.toUpperCase())) {	
			return "Block letters needed";
		}
		if(stud.score<0 || stud.score>100) {
			return "Invalid Scorce!!!!";
		}
		return "Registered";
	}
	public String studentCard(String card) {
		if (!card.matches("\\d+")) {
			return "Invalid Card";
		}
		else {
			return "Valid Card";
		}
	}
}
public class ClassroomValidation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("RITIKA",10);
		Classrom c= new Classrom();
		
		String str1=c.registerStudent(s);
		System.out.println(str1);
		//System.out.println(c.registerStudent(s));
		
		String str11=c.studentCard("25");
		System.out.println(str11);
		//System.out.println(c.studentCard("25"));
	}
}