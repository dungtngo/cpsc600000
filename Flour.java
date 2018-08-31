package cpsc600000;

public class Flour extends Ingredient
{
	Food ingred1;
	String describe1 = "4 cups of flours"; 
	
	public Flour (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
	
public String FoodDescription() {
		
		return  ingred1.FoodDescription() + describe1;
	}
	;
}
