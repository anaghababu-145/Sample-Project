package main;

public abstract class Animal
{
 static String name;
public String getName() 
{
	return name;
}
public Animal(String name) 
{
	this.name = name;
}
public abstract void eat();
public abstract void sleep();
}
class Racoon extends Animal
{
	public Racoon()
	{
		super(name);
	}
		public void eat()
		{
			System.out.println("racoon is eating");
		}
		public void sleep()
		{
			System.out.println("Breath in breath out repaet");
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racoon r=new Racoon();
r.eat();
r.sleep();
	}

}
