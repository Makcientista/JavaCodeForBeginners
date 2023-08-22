package JavaTutorialForBeginners.Method_Overloading;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int result1 = obj.add(3, 4, 5); /* 3, 4, 5 = argumento*/
		System.out.println(result1);
	}

}