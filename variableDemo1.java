package variableDemo;

public class variableDemo1 
{
	int i = 10;
	static int j = 20;
	
		public static void main(String[] args)
	/*{

		System.out.println(5);	//5
		System.out.println("5");	//5
		System.out.println("5+5");	//5+5
		System.out.println(5+5);	//10
		int a=10;
		System.out.println(a);	//10
		System.out.println("a");	//a
		System.out.println(a+5);	//10
		System.out.println("a+5");	//a+5
	}*/
		{
			System.out.println(j);
			j = 30;
			System.out.println(j);
			int j = 40;
			System.out.println(j);
			//System.out.println(i); 	//run time Error
		}

}

