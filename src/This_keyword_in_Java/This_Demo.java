package This_keyword_in_Java;


class Human{
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age = age;      //"this" represnt the current object - Refers to the current object who is calling the set age
	}
	
	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
}

public class This_Demo {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setAge(33);
		obj.SetName("Makiesse");
		
		System.out.println(obj.getName() + " : " + obj.getAge());

	}

}
