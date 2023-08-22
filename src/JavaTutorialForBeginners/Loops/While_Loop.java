package JavaTutorialForBeginners.Loops;

public class While_Loop {

	public static void main(String[] args) {
		//I you want to read file or Data base
		/*Reading a file we don´t need a counter, because when we read a file it doesn´t matter how many character you have
		 you have to pick up each character there is no inicial point just that you will read the file the moment 
		 you have end of file you will stop the loop */
		
		int i = 1;

		while (i<=4) {
			System.out.println("hello " + i);/*Sempre que imprimir Hello na sequência também será impresso Hi 3 vezes*/
			int j = 1;
			while(j<=3) {
				System.out.println("Hi");
				j++;
			}
			i++;
		}
		System.out.println("Bye " + i);
	}

}
