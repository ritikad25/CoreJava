package basic;

public class arrayAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,32,22,2,96};
		int temp=0;
		System.out.println("Enter original array : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Asending order : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}