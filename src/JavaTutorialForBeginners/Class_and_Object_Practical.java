package JavaTutorialForBeginners;

/*Class is just an idea
 * 
 * If you really want to use this idea you need to create an object
 * 
 */

class Calculator{
	
	int a;
	
	public int add(int n1, int n2)
	{
		int r = n1 + n2;
		return r;
	}
}

public class Class_and_Object_Practical {

	public static void main(String[] args) {
      
		int num1 = 4; 
		int num2 = 5;
		
		Calculator calc = new Calculator(); /*Calculator calc; = cria apenas referência sem o objeto
		 | new Calculator() = cria objeto do tipo Calculator */
		
		int result = calc.add(num1, num2);
		System.out.println(result);
		
		
	}

}
