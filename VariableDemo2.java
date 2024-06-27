package variableDemo;

public class VariableDemo2 
{
	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) 
	{
		System.out.println(j);
		j=30;
		System.out.println(j);
		int j = 40;
		System.out.println(j);  //printing the local variable
		
		//System.out.println(k);	
		VariableDemo2 i = new VariableDemo2();	//datatype variable = object
		System.out.println(i);

	}

}
