package Static_Variable;

class Mobile1 {
	/*Instance variable*/
	String brand;
	int price;
	static String name; //static variable
	/*static String name; static make this variable become commum to all the object
	
	 					static variable is normaly share by the all object
	 					*static variable should be call with class name not with the object 
	 					*static make the object belong to the class, that´s wahy you can use the name of the class to call the object
							Ex: Mobile.name = "Apple"												*/
	
	public void show()
	{
		/*in side of method local variable*/
		System.out.println(brand + " : " + price + " : " + name);
	}
	
	public static void show1(Mobile1 obj)
	{
		System.out.println(obj.brand + " : " + obj.price + " : " + name);
	}
	
}


public class StaticMethodDmo {

	public static void main(String[] args) {
		

		Mobile1 obj1 = new Mobile1();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile1.name = "SamartPhone";
		
		
		Mobile1 obj2 = new Mobile1();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile1.name = "SamartPhone";
		
		/*obj1.name = "Phone"; It will afect all the object*/
		
		obj1.show();
		obj2.show();

		Mobile1.show1(obj1);
		
		
	}

}
