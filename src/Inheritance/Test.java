package Inheritance;


class Father
{
	public void mi()
	{
		System.out.println("I ma father class");
	}
	Father()
	{
		System.out.println("I ma father constct");
	}

}

class Child extends Father
{
	public void mj()
	{
		System.out.println("I ma chaild class");
	}
	

}
public class Test
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.mj();
		c.mi();
		c.mj();
	}
}

