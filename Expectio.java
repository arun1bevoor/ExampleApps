/* functionality used for exception handling */
public class Expectio 
{
	/*blic void fun(int age)
	{
		if(age<18)
		{
			throw  new ArithmeticException();
			
		}	
		else if(age>18 && age<50)
		{
			System.out.println("matured");
			
		}else{
			System.out.println("older");
}
	}*/
	
	
	
	
	
	
	public static void main(String args[])
	{
		int a=10;
		int b=0;
		int c=0;
		try
		{
			
			c=a/b;
				
		}catch(Exception e) {
			System.out.println("catch block executed");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finally block");
		}
		
		/*ectio e=new Expectio();
		e.fun(20);*/

}
}
