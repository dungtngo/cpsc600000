package cpsc600000;

public class Flower extends Ingredient
{
	Food ingred1;
	
	public Flower (Food ingred1sub) {
		
		ingred1  = ingred1sub;
	}
	
public String FoodDescription() {
		
		return  ingred1.FoodDescription() + "4 cups of flower, ";
	}
	;
}
