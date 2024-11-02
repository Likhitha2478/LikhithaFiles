package basicsofjava;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		int a=10;
		a+=5; //a=a+5
		//add and assign
		System.out.println("a after +=" +a);
		//sub and assign
		a-=3; //a=a-3
		System.out.println("a after -=" +a);
		//multiply and assign
		a*=2; //a=a*2
		System.out.println("a after *=" +a);
		
//divide and assign
		a/=4; //a=a/4
		System.out.println("a after /=" +a);
		System.out.println(a);
		a%=3; //1
		System.out.println("a after %=" +a);
	}

}
