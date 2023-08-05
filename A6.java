abstract class bike
{
	bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("gear changed");
	}
}
class honda4 extends bike
{
	void run()
	{
		System.out.println("running succesfully");
	}
}
class testabstraction
{
	public static void main(String arg[])
	{
		bike obj = new honda4();
		obj.run();
		obj.changeGear();
	}
}
