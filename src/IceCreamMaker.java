public class IceCreamMaker{


    //method
    public void buildIceCream(int numofScoops, String requestedFlavor){

        System.out.println("Your " + numofScoops + " scoops of " +  requestedFlavor + " Ice Cream is on it's way to you now!");
    }


    //method
    public void gatherFoodInfo(boolean gatherHealthInfo){

        if (gatherHealthInfo == true){

            System.out.println("------------------------------------------------");
            System.out.println("       Butter Pecan Food Info:");
            ButterPecan butterPecan = new ButterPecan();
            butterPecan.healthInfo();
            butterPecan.getContainsNuts();

            System.out.println();
            System.out.println("       Triple Chocolate Food Info:");
            TripleChocolate tripleChoc = new TripleChocolate();
            tripleChoc.healthInfo();
            tripleChoc.getContainsNuts();

        } else {
            System.out.println("Thank you for visiting our shoppe! Enjoy your treats and we'll see you at your next visit!");
        }
    }

    //method + switch statement
    public void selectContainer(int container){

        switch(container){

            case 1:
                System.out.println("Awesome! We'll put this in a waffle cone for you now!");
                break;
            case 2:
                System.out.println("Awesome! We'll put this in a cup for you now!");
                break;
            case 3:
                System.out.println("Awesome! We'll put this in a bowl for you now!");
                break;
            default:
                System.out.println("Whoops! We don't seem to have any of those, please make another selection. Thanks!");
        }
    }
}
