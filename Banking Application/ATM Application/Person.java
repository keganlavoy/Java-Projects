
public class Person {


    private String name;



    public void Person() {

	name = "Bob";
    }


    public String getName() {

	return name;
    }


    public void setName(String nameString) {

	name = nameString;
	System.out.println("The name is now set to " + name);
	

    }
    



}
