package ThisAndSuperMethod;

class A extends Object //Every class in java extends the object class
{
	public A()
	{
		super();
		System.out.println(" in A ");
	}
	
	public A(int n) //parametrized construction
	{
		super();
		System.out.println(" in A int ");
	}
	
}

class B extends A
{
	public B()
	{	
		super(6);// Todo construtor tem um metodo subentendido "super()" It means call the constructor of a super class or object class
		System.out.println(" in B ");
	}
	
	public B(int n) //parametrized construction
	{
		this(); //executa o construtor da mesma classe
		System.out.println(" in B int ");
	}
	
}

public class Demo {

	public static void main(String[] args) 
	{
		B obj = new B(5);
		

	}

}
