package JavaTutorialForBeginners.Methods;

public class Computer {
	
	
	public void playMusic() //public tipo de acesso | void (este metodo não retorna informação)
	{
		System.out.println("Music Playing");
	}
	
	
	public String getMeAPen(int cost)  /* Before give a pen you need to pay first. So you need to pass "int cost" or money*/
	{
		if(cost >= 10)
		return "Pen";   /*Whatever the type your method return you need to mention "public String getMeAPen*/
		else
		return "The price is low than required ";
	}
	
}