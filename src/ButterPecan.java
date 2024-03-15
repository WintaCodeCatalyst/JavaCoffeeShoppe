public class ButterPecan extends IceCream{

    //variables
    String flavor = "butter pecan";
    String color = "cream";
    boolean hasAllergens = true;
    boolean containsNuts = true;


    //constructors
    public ButterPecan(){
        this.flavor = "butter pecan";
        this.color = "cream";
    }

    public ButterPecan(String flavor){
        this.flavor = flavor;
        this.color = "cream";
    }

    public ButterPecan(String flavor, String color){
        this.flavor = flavor;
        this.color = color;
    }


    //method
    @Override
    public void healthInfo(){

        System.out.println("I am the delicious " + this.flavor + " ice cream flavor!\nMy texture is smooth & I have a " + this.color + " color hue.\nContains allergens: " + hasAllergens);
    }


    //method
    public void getContainsNuts(){
        System.out.println("Contains nuts: " + containsNuts);
    }

}