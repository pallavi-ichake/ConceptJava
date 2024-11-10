package Interface;


public class impleChildClass implements FatherInterf,MotherInterf {

	@Override
	public void m1() 
	{
		System.out.println("I am father inteface");
		
	}

	@Override
	public void m2()
	{
		System.out.println("I am mather inteface");
		
	}
	public static void main(String[] args) 
	{
		impleChildClass ic = new impleChildClass();
		ic.m1();
		ic.m2();
	}

}
