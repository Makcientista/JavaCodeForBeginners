package JavaTutorialForBeginners.Methods.StringBuffer_and_StringBuilder;

public class StringBuffer_StringBuilder_Demo {

	public static void main(String[] args) {
			
		StringBuffer sb = new StringBuffer("Makiesse");
		sb.append(" Kiassungua");
		
		sb.insert(9, "Java ");
		sb.setLength(30);
		
		
		System.out.println(sb);
	}

}
