class animal
{
	void eat()
	{
		System.out.println("eating..");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking..");
	}
}
class babydog extends animal
{
	void weep()
	{
		System.out.println("weeping..");
	}
}
class heiinheritence
{
	public static void main(String arg[])
	{
		babydog d = new babydog();
		d.weep();
		d.bark();
		d.eat();
	}
}