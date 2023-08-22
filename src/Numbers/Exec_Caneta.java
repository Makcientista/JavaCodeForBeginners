package Numbers;

public class Exec_Caneta {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar(); // referência ou chamada a atributo
		
		//c1.status(); // referência ou chamada a método
		c1.rabiscar();
		
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "Preta";
		c2.destampar();
		c2.rabiscar();
		
		

	}

}
