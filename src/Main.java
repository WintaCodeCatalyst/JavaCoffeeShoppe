import java.util.*;

class Main {

    //creating IceCreamCo collection
    static ArrayList<Object> IceCreamCo = new ArrayList<Object>();


    public static void main(String[] args) {

        //adding items to IceCreamCo collection
        String butterPecan = "Butter Pecan";
        IceCreamCo.add(butterPecan);
        String tripleChoc = "Triple Chocolate";
        IceCreamCo.add(tripleChoc);

        //scanner usage
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("----JAVA Ice Cream Shoppe----");
        System.out.println("Welcome to the Java Ice Cream Shoppe! What Ice Cream flavor can I get for you today: ");

        //collection traversal via looping structure
        for(int i = 0; i < IceCreamCo.size(); i++) {
            System.out.println(IceCreamCo.get(i));
        }

        System.out.println();
        String requestedFlavor = sc.nextLine();
        System.out.println("-------------------------------");
        System.out.println("How many scoops would you like?");
        int numofScoops = sc.nextInt();
        System.out.println();

        IceCreamMaker icm = new IceCreamMaker();
        icm.buildIceCream(numofScoops, requestedFlavor);
        System.out.println("-----------------------------");

        System.out.println("Would you like that in a Cone (1), Cup (2), or Bowl(3)?");
        int container = sc.nextInt();
        icm.selectContainer(container);

        System.out.println("-------------------------------");
        System.out.println("Would you like food info for your ice cream? Type 'True' for yes or 'False' for no.");

        boolean gatherHealthInfo = sc.nextBoolean();
        icm.gatherFoodInfo(gatherHealthInfo);


        //exception handling via try/catch
        System.out.println();
        System.out.println("-----------Fun Fact:-------------");
        System.out.println("Enter a number > or = 0 to findout what ice cream that represents in our collection: ");
        int iceCreamNum = sc.nextInt();

        try{
            IceCreamCo.get(iceCreamNum);
            System.out.println(IceCreamCo.get(iceCreamNum));
        } catch (Exception e){
            System.out.println("Whoops! This number is either greater than or less than the number of items in our collection.");
        }
        sc.close();
    }
}