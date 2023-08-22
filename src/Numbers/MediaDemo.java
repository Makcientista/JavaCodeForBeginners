package Numbers;
import java.util.Scanner;

public class MediaDemo {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		Media m = new Media();
		
		System.out.print("Type the N1: ");
		m.n1 = scan.nextDouble();
		
		System.out.print("Type the N2: ");
		m.n2 = scan.nextDouble();
		
		System.out.print("Type the N3: ");
		m.n3 = scan.nextDouble();
		
		
		double media_final = m.CalculoMedia();
		
		if(media_final >= 7 ) {
			
			System.out.println("You passed and you final result is: " + media_final);
		} 
		else if (media_final == 6.5) {
			System.out.println("You will repeat the exame and you final result is: " + media_final);
		}
		else {
			System.out.println("You failed and you final result is:" + media_final);
		}
		
	
	}

}
