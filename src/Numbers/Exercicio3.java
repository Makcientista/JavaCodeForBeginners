package Numbers;

import java.util.Random;

public class Exercicio3 {
	public static void main(String args[]) {
		
       /*Criar objeto de nome "gerador" para classe Radom*/  
		Random gerador = new Random();
		
		/*Gerar numeros aleat�rios inteiros de  0 a 999 */
		int a = gerador.nextInt(1000);
		
		/*Gerar numeros aleat�rios inteiros de   0 a 9999 */
		int b = gerador.nextInt(10000);
		
		/*Mostrar valores inteiros aleat�rios*/
		System.out.println( " \n *******Valores inteiros gerados aleatoriamente******* ");
		System.out.println(" N�meros inteiros gerados aleatoriamente de 0 a 999: " + a);
		System.out.println(" N�meros inteiros gerados aleatoriamente 0 a 9999: " + b);
	}
}

