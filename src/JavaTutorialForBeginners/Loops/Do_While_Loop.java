package JavaTutorialForBeginners.Loops;

public class Do_While_Loop {

	public static void main(String[] args) {
		/*You want to execute a block at least once even if the condition is false*/
		/*If you want to sand a message to your friend even if the server is out*/
		
		int i = 1;
		
		do {
			System.out.println("Hi " + i);
			
			i++;
		}while(i<=4);
	}

}
