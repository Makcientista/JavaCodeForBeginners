package Encapsulation;

class Human {
	
	private int age ; // Toda variavel de instancia deve ser private 
	private String name ; // variavel privada são apenas acessado por objetos da mesma classe
	
	
	public int getAge() { //para pegar o valor da variavel
		
		return age;
	}
	
	public void setAge(int a) { //When you are setting the Age you need to ask where is the variable?
		
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) { //para definir a variavel // Whatever value you pass will be assigned to this n and from n it will be assigned to name
		name = n;

}

}
public class HumanDemo {

	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.setAge(33);
		obj.setName("Kiassungua");
		System.out.println(obj.getName() + " : " + obj.getAge());
	}

 }
