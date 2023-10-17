package Default_vs_Parameterized_Constructor;

class Human {
	 
	 private int age;
	 private String name;
	 
	 public Human() {    //Default Construction
		 				//Construtor é um metos especial e retorna nenhum iten  
		 				//And the name should be as the class name 
		 age = 33;  //Recomendavél inicializar as variaveis dentro do metodo construtor. Até mesmo conecção com BD.
		 name = " Marina";
		 
	 }
	 
	 public Human(int a, String n) //Parametrized Construction
	 { 
		  age = a;
		  name = n;		 
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



public class Human_Demo_Default_Vs_Parametized_Constructor {

	public static void main(String[] args) {
		
		Human obj = new Human(); /* sempre que criarmos um novo objeto o metodo construtor será chamado */
		Human obj1 = new Human(18, "Kiassungua");
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj.getAge());
		//obj.setAge(30);          
		//obj.setName("Makiesse");
		
		//System.out.println(obj.getName() + " : " + obj.getAge(0));

	}

}
