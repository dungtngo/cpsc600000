package cpsc600000;

public class CookBook {
	
	public static void main (String arg[]) 
	{
		
		Food food = new Cake();
		System.out.println(food.FoodDescription());
		food = new Milk(food);
		System.out.println(food.FoodDescription());
		food = new FoodColor(food);
		System.out.println(food.FoodDescription());
		food = new Sugar(food);
		System.out.println(food.FoodDescription());
		food = new Whip(food);
		System.out.println(food.FoodDescription());
	}

}


