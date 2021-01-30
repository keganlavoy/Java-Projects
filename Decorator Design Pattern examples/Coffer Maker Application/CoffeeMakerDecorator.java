abstract class CoffeeMakerDecorator {

    private CoffeeMaker coffeeMaker;


    CoffeeMakerDecorator(CoffeeMaker coffeeMakerToDecorate)
    {
	coffeeMaker = coffeeMakerToDecorate;
    }


    public void addNewIngredient(String ingredient)
    {
	System.out.println("add new ingredient");
    }



}
