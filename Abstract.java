import java.util.*;
abstract class AbstractClass
{
    AbstractClass()
	{
        System.out.println("This is constructor of abstract class");
    }
    abstract void method();
    void n_method()
	{
        System.out.println("This is a normal method of abstract class");
    }
}
class SubClass extends AbstractClass
{
    void method()
	{
        System.out.println("This is abstract method");
    }
}
class Main
{
    public static void main(String[] args)
	{
        SubClass Obj = new SubClass();
        Obj.method();
        Obj.n_method();
    }
}
