package cpsc600000;

public class Sugar extends Ingredient
{
	Food ingred1;
	
	public Sugar (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
public String FoodDescription() {
		
	return  ingred1.FoodDescription()+ "4 cups of sugar, ";
	}
	;
	
}
