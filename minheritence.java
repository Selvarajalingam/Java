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
class babydog extends dog
{
	void weep()
	{
		System.out.println("weeping..");
	}
}
class minheritence
{
	public static void main(String arg[])
	{
		babydog d = new babydog();
		d.weep();
		d.bark();
		d.eat();
	}
}