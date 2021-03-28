
public class Enactirehni1 {
	int x=10,y=20;
	Enactirehni1(int x,int y)
	{
		System.out.println("construvction1"+x);
		this.x=x;
		
	}
	
	public static void main(String args[])
	{
		Enactirehni1 en=new Enactirehni1(5,6);
		System.out.println(en.x);
	}
}
