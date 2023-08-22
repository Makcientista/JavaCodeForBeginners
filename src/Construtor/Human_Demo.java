package Construtor;

 class Human {
	 
	 private int age;
	 private String name;
	 
	 public Human() { //Construtoré um metos especial e retorna nenhum iten
		 age = 33;  //Recomendavél inicializar as variaveis dentro do metodo construtor. Até mesmo conecção com BD.
		 name = " Marina";
		 
	 }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	 
	
}



 public class Human_Demo {

	public static void main(String[] args) {
		
		Human obj = new Human(); /* sempre que criarmos um novo objeto o metodo construtor será chamado */
		Human obj1 = new Human();
		System.out.println(obj.getName() + " : " + obj.getAge());
		//obj.setAge(30);          
		//obj.setName("Makiesse");
		
		//System.out.println(obj.getName() + " : " + obj.getAge(0));

	}

}
