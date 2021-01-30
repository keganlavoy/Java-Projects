import java.util.*;
/**
 * @author Lavoy
 *
 */
public class Recipe {

    private String name;
    ArrayList<String> recipeIngredients = new ArrayList<String>();
    ArrayList<Integer> ingredientAmounts = new ArrayList<Integer>();



    public Recipe(String recipeName)
    {
	name = recipeName;
    }


    public String getRecipeName()
    {
	return name;
    }


    public void addToRecipe(String ingredient, int amount)
    {
	recipeIngredients.add(ingredient);
	ingredientAmounts.add(amount);
    }


    public void removeFromRecipe(String ingredient)
    {
	int i = 0;

	for (String str:recipeIngredients)
	    {
		if(str.equals(ingredient))
		    {
			i = recipeIngredients.indexOf(str);
			recipeIngredients.remove(i);
			ingredientAmounts.remove(i);
		    }

		else
		    System.out.println("That ingredient isn't in the recipe.");

	    }
    }




    public ArrayList<String> getRecipeIngredients()
    {
	return recipeIngredients;
    }




    public Integer getIngredientLevel(String ingredientName)
    {
	int i = 0;
	int amount = 0;
	for(String str:recipeIngredients)
	    {
		if(str.equals(ingredientName))
		    {
			i = recipeIngredients.indexOf(str);
			amount = ingredientAmounts.get(i);
			return amount;
		    }

	    }

	System.out.println("That ingredient isn't in the recipe.");
	return amount;
    }


}
