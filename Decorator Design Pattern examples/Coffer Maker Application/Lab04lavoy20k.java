public class Lab04lavoy20k {

    public static void main(String[] args) {
	
     CoffeeMaker cMaker = new CoffeeMaker();
     Inventory inv = new Inventory();
     ConcreteCoffeeMakerDecorator decorator = new ConcreteCoffeeMakerDecorator(cMaker);


     decorator.addNewIngredient("coffee");
     decorator.addNewIngredient("milk");
     decorator.addNewIngredient("sugar");
     decorator.addNewIngredient("nutmeg");

     cMaker.setCurrentIngredients(decorator.getNewIngredients());

     inv.setIngredientAmount("coffee", 1000, cMaker);
     inv.setIngredientAmount("milk", 900, cMaker);
     inv.setIngredientAmount("sugar", 10000, cMaker);
     inv.setIngredientAmount("nutmeg", 800, cMaker);

     inv.setCostAmount("coffee", 0.30, cMaker);
     inv.setCostAmount("milk", 0.20, cMaker);
     inv.setCostAmount("sugar", 0.15, cMaker);
     inv.setCostAmount("nutmeg", 0.50, cMaker);


     Recipe testRecipe = new Recipe("testRecipe");
     testRecipe.addToRecipe("milk", 1);
     testRecipe.addToRecipe("coffee", 2);
     testRecipe.addToRecipe("sugar", 2);
     testRecipe.addToRecipe("nutmeg", 1);


     cMaker.displayIngredients();

     cMaker.addRecipe(testRecipe);
     cMaker.makeCoffee("testRecipe");
    

     cMaker.makeCoffee("fakeRecipe");
     

     cMaker.displayIngredients();


     }

}
