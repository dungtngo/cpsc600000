package cpsc600000;

public class FoodColor extends Ingredient
{
	Food ingred1;
	String describe1 = "4 drops of any food color";
	public FoodColor (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
	
public String FoodDescription() {
		
	return  ingred1.FoodDescription()+ describe1;
	}
	;
}

