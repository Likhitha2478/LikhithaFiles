package basicsofjava;

public class Variabledemo {
		int id=10; //instance variable
		void print()
		{
			String msg="hello";
			System.out.println(msg);
				
		
		}
		static String message="hello students";
		public static void main(String args[])
		{
			Variabledemo obj=new Variabledemo();
			System.out.println(obj.id);
			obj.print();
			System.out.println(message);
		}

	}


