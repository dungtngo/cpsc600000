package cpsc600000;

public class Milk extends Ingredient
{
	String discribe1 = "2 cups of milk, ";
	
	Food ingred1;
	
	public Milk (Food ingred1sub) {
	
		ingred1  = ingred1sub;
	}
	
	public String FoodDescription() {
		
		return  ingred1.FoodDescription() + this.discribe1;
	}
	;
}
