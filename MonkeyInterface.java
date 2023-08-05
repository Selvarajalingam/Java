import java.util.*;
interface BasicAnimal
{
    void eat();
    void sleep();
}

class Monkey
{
    void jump()
	{
        System.out.println("Monkey is jumping.");
    }
    void bite()
	{
        System.out.println("Monkey is biting.");
    }
}
class Human extends Monkey implements BasicAnimal
{
    public void eat()
	{
        System.out.println("Human is eating.");
    }
    public void sleep()
	{
        System.out.println("Human is sleeping.");
    }
}
class Main
{
    public static void main(String[] args)
	{
        Human human = new Human();
        human.jump(); 
        human.bite(); 
        human.eat(); 
        human.sleep();
    }
}
