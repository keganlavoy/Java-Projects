import java.util.*;

/**
 * @author Lavoy
 *
 */
public class CoffeeMaker {


    private ArrayList<String> ingredients = new ArrayList<String>();
    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();
    private ArrayList<Double> costs = new ArrayList<Double>();
    private ArrayList<Integer> inventory = new ArrayList<Integer>();




    public boolean addRecipe(Recipe rAdd)
    {
	int i = 0;

	for(Recipe str:recipes)
	    {
		if(recipes.get(i).getRecipeName().equals(str.getRecipeName()))
		    return false;

		i++;
	    }

	recipes.add(rAdd);
	return true;
    }


    public Recipe getRecipe(String recipeName)
    {
	int i = 0;

	for(Recipe str:recipes)
	    {
		if(recipes.get(i).getRecipeName().equals(str.getRecipeName()))
		    return recipes.get(i);

		i++;
	    }

	return null;

    }


    public boolean deleteRecipe(String recipeName)
    {

	int i = 0;

	for(Recipe str:recipes)
	    {
		if(recipes.get(i).getRecipeName().equals(str.getRecipeName()))
		    {
			recipes.remove(i);
			return true;
		    }
		i++;
	    }


	return false;
    }



    public boolean makeCoffee(String recipeName)
    {

	int i = 0;
	ArrayList<String> recipeToMakeIngredients = new ArrayList<String>();
	int numOfIngredientsMatched = 0;
	int numOfIngredients = 0;
	double costOfRecipe = 0;
	int temp = 0;
	int inventoryUpdated = 0;

	for(Recipe rec:recipes)
	    {
		if(rec.getRecipeName().equals(recipeName))
		    {
			Recipe recipeToMake = getRecipe(rec.getRecipeName());


			recipeToMakeIngredients = recipeToMake.getRecipeIngredients();
			numOfIngredients = recipeToMakeIngredients.size();




			for(String str:ingredients)
			    {
				for(String str2:recipeToMakeIngredients)
				    {
					if(str.equals(str2))
					    {
						numOfIngredientsMatched++;
						temp = recipeToMake.getIngredientLevel(str2);
						if(inventory.get(i) - temp >= 0)
						    {
							inventoryUpdated = inventory.get(i) - temp;
							inventory.remove(i);
							inventory.add(i, inventoryUpdated);
							costOfRecipe += (temp * costs.get(i));
						    }
					    }

				    }
				i++;
			    }




		    }

	    }

	if((numOfIngredientsMatched == numOfIngredients) && !(numOfIngredients == 0))
	    {
		System.out.println("coffee brewed. It cost: " + costOfRecipe);
		return true;
	    }
	System.out.println("Ingredients not found. Please add a reservoir or change recipes.");
	return false;

    }




    public void displayIngredients()
    {
	int i = 0;
	System.out.println("Current ingredients and inventory:");
	for(String str:ingredients)
	    {
		System.out.println(ingredients.get(i) + ", " + inventory.get(i));
		i++;
	    }

    }


    public void setCurrentIngredients(ArrayList<String> ingredients)
    {
	this.ingredients = ingredients;
    }




    public ArrayList<String> getCurrentIngredients()
    {
	return ingredients;
    }

    public ArrayList<Recipe> getCurrentRecipes()
    {
	return recipes;
    }

    public ArrayList<Double> getCurrentCosts()
    {
	return costs;
    }

    public ArrayList<Integer> getCurrentInventory()
    {
	return inventory;
    }


    public void setInventory(int index, int amount)
    {
	inventory.add(index, amount);
    }

    public void setCost(int index, double amount)
    {
	costs.add(index, amount);
    }


}
