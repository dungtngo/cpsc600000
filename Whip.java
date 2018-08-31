package cpsc600000;

public class Whip extends Ingredient
{
	Food ingred1;
	
	public Whip (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
public String FoodDescription() {
		
		return  ingred1.FoodDescription() + "and alot of whip cream, ";
	}
	;
	
}

