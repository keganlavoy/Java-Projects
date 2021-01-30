import java.util.*;
/**
 * @author Lavoy
 *
 */
public class ConcreteCoffeeMakerDecorator extends CoffeeMakerDecorator {


    ArrayList<String> newIngredients = new ArrayList<String>();


    ConcreteCoffeeMakerDecorator(CoffeeMaker coffeeMakerToDecorate)
    {
	super(coffeeMakerToDecorate);
    }


    public void addNewIngredient(String ingredient)
    {
	newIngredients.add(ingredient);
    }


    public ArrayList<String> getNewIngredients()
    {
	return newIngredients;
    }



}
