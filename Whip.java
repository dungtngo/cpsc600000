package cpsc600000;

public class Whip extends Ingredient
{
	Food ingred1;
	String describe1 = "and alot of whip cream";
	public Whip (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
public String FoodDescription() {
		
		return  ingred1.FoodDescription() + describe1;
	}
	;
	
}

