/* functionality used for exception handling */
public class Expectio 
{
	/*blic void fun(int age)
	{
		if(age<18)
		{
			throw  new ArithmeticException();
			
		}	
		else
		{
			System.out.println("matured");
			
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
