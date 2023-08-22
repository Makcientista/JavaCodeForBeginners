
package JavaTutorialForBeginners.Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		Computer comp = new Computer();
		comp.playMusic();
		String str = comp.getMeAPen(9); /*Whe you call the method you have to pass the cost of the pen (money)*/
		System.out.println(str);       //String str porque o metodo getMeAPen retorna uma string 

	}

}
