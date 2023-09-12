package basic;

public class StringBufferBuilderMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello ");
		System.out.println("before append : " +sb);
		System.out.println("Append : "+sb.append("How are you?"));
		System.out.println("reverse String : " +sb.reverse());
		System.out.println("insert :"+sb.insert(5, "cute"));
		System.out.println("delete :"+sb.delete(5, 8));
		//sb.insert
		
		
		/*StringBuilder sb1=new StringBuilder("Everyone ");
		System.out.println("before append : " +sb1);
		System.out.println("Append : "+sb1.append("Take coffee"));
		System.out.println("reverse String : " +sb1.reverse());
		System.out.println("insert :"+sb1.insert(5, "cute"));
		System.out.println("delete :"+sb1.delete(5, 8));
		*/
	}
}
