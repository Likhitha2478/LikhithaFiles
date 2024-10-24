package basicsofjava;

public class IfElseIfDemo {

	public static void main(String[] args) {
int marks=90;
		if(marks>90)
		{
			System.out.println("grade A");
		}
		else if(marks>=80)
		{
			System.out.println("grade B");
		
		}
		else if(marks>=70)
		{
			System.out.println("grade C");
		
		}
		else if(marks>=60)
		{
			System.out.println("grade D");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
