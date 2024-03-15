public abstract class IceCream{

    //variables
    private String flavor;
    private String color;
    private boolean hasAllergens;

    //methods or behaviors
    public void healthInfo(){

        System.out.println("I am the delicious " + this.flavor + "Ice Cream flavor! My texture is smooth & creamy & I have a " + this.color + " hue. Has allergens(true/false): " + hasAllergens + "!");

    }
}