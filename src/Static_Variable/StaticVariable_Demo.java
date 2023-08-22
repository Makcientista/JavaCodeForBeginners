package Static_Variable;

class Mobile{
	/*Instance variable*/
	String brand;
	int price;
	static String name; //static variable
	/*static String name; static make this variable become commum to all the object (obj1 and obj2)
	
	 					static variable is normaly share by the all object
	 					*static variable should be call with class name not with the object 
	 					*static make the object belong to the class, that´s wahy you can use the name of the class to call the object
					     Ex:
					         Mobile obj1 = new Mobile();					
						     Mobile.name = "Apple"												*/
	
	public void show()
	{
		/*in side of method local variable*/
		System.out.println(brand + " : " + price + " : " + name);
	}
	
}


public class StaticVariable_Demo {

	public static void main(String[] args) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "SamartPhone";
		
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "SamartPhone";
		
		/*obj1.name = "Phone"; It will afect all the object*/
		
		obj1.show();
		obj2.show();
	}

}
