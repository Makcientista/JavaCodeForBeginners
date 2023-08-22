package Numbers;

public class DemoSoma {

	public static void main(String[] args) {

		Soma num =  new Soma();
		num.a = 7.5;
		num.b = 6.5;
		num.c = 8.5;
		
		double resultado = num.somar();
		
		System.out.println("A soma dos numero é: " + resultado );
		
		
	}

}
