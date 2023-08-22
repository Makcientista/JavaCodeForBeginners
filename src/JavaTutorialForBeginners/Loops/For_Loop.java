package JavaTutorialForBeginners.Loops;

public class For_Loop {

	public static void main(String[] args) {
/*Quando você pretende ler os caracter de arquivos de um diretorio o loop vai finalizar quando varificar todos os arquivos*/
		/*Quando você sabe quantas interações pretendes imprimir. Por exemplo de 1 a 100*/
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("DAY " + i);
			
			for (int j = 1; j <= 9; j++)
			{
			System.out.println(" " + (j+8) + " - " + (j+9));
			}			
		}
	}

}
