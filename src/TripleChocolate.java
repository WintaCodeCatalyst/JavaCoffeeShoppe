public class TripleChocolate extends IceCream{

    //variables
    String flavor = "triple chocolate";
    String color = "warm brown";
    boolean hasAllergens = false;
    boolean containsNuts = false;

    //constructors
    public TripleChocolate(){
        this.flavor = "triple chocolate";
        this.color = "warm brown";
    }

    public TripleChocolate(String flavor){
        this.flavor = flavor;
        this.color = "warm brown";
    }

    public TripleChocolate(String flavor, String color){
        this.flavor = flavor;
        this.color = color;
    }

    //method
    @Override
    public void healthInfo(){

        System.out.println("I am the delicious " + this.flavor + " ice cream flavor!\nMy texture is smooth & creamy & I have a " + this.color + " hue.\nContains allergens: " + hasAllergens);

    }
    //method
    public void getContainsNuts(){
        System.out.println("Contains nuts: " + containsNuts);
    }

}