package cpsc600000;

public class CookBook {
	
	public static void main (String arg[]) 
	{
		
		Food getcake = new Cake();
		System.out.println(getcake.FoodDescription());
		getcake = new Milk(getcake);
		System.out.println(getcake.FoodDescription());
		getcake = new FoodColor(getcake);
		System.out.println(getcake.FoodDescription());
		getcake = new Sugar(getcake);
		System.out.print(getcake.FoodDescription());
		getcake = new Whip(getcake);
		System.out.println(getcake.FoodDescription());
	}

}


