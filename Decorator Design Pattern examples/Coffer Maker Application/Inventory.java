import java.util.*;
/**
 * @author Lavoy
 *
 */
public class Inventory {



    public void setIngredientAmount(String ingredient, int amount, CoffeeMaker coffeeMaker)
    {
	int i = 0;
	ArrayList<String> cMakerIngredients = new ArrayList<String>();
	cMakerIngredients = coffeeMaker.getCurrentIngredients();

	for(String str:cMakerIngredients)
	    {
		if(str.equals(ingredient))
		    {
			i = cMakerIngredients.indexOf(str);
			coffeeMaker.setInventory(i, amount);
		    }



	    }
    }


    public void setCostAmount(String ingredient, double amount, CoffeeMaker coffeeMaker)
    {
	int i = 0;
	ArrayList<String> cMakerIngredients = new ArrayList<String>();
	cMakerIngredients = coffeeMaker.getCurrentIngredients();

	for(String str:cMakerIngredients)
	    {
		if(str.equals(ingredient))
		    {
			i = cMakerIngredients.indexOf(str);
			coffeeMaker.setCost(i, amount);
		    }



	    }
    }


}
