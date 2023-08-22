package JavaTutorialForBeginners.Method_Overloading;

public class Calculator {
				/*(int n1, int n2, int n3) = paramettros*/
	public int add(int n1, int n2, int n3) { /* Method Overloading */
		return n1 + n2 + n3;

	}
							
	public int add(int n1, int n2) { /* Method Overloading */
		return n1 + n2;

	}

	public double add(double n1, int n2) { /* Method Overloading */
		return n1 + n2;

	}

}
