package Numbers;

import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		Random gerador = new Random();
        int upperbound = 1000;
        for (int i = 0; i < 1; i++) {
            int senha = gerador.nextInt(upperbound);
            System.out.println("A senha geradada foi: " + senha);
        }
	}

}
