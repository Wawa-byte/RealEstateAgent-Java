// Waleed Akhtar

public class Tester {

    public static void main(String[] args){
        // Here we add in properties to the property class and print them
        Property p1 = new Property("1 Eden", 4);
        Property p2 = new Property("56 Eden Court", 4);
        Property p3 = new Property("17 New way Drive", 4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println("\n");

        // We add in properties to the detached property and then print
        DetachedProperty dp1 = new DetachedProperty(27, 4, "37 Cottage", 7);
        DetachedProperty dp2 = new DetachedProperty(50,2, "47 Rise", 5);
        DetachedProperty dp3 = new DetachedProperty(20, 1, "4 Hunter's road", 2);
        System.out.println(dp1.toString());
        System.out.println(dp2.toString());
        System.out.println(dp3.toString());

        System.out.println("\n");

        // Add properties to the semi detached and then print
        SemiDetachted sd1 = new SemiDetachted(2, 10, "2325 Ferry Street", 3);
        SemiDetachted sd2 = new SemiDetachted(3, 15, "35 Tree Top Lane", 5);
        SemiDetachted sd3 = new SemiDetachted(1, 7, "439 Retreat Avenue", 1);
        System.out.println(sd1.toString());
        System.out.println(sd2.toString());
        System.out.println(sd3.toString());

        System.out.println("\n");

        // We add an property to real estate agent and then print out semi detached properties
        RealEstateAgent rea1 = new RealEstateAgent("78 New lane road", 9);
        rea1.addProperty(sd1); // Adding the semi detached properties
        rea1.addProperty(sd2);
        rea1.addProperty(sd3);
        rea1.showAllProperties(); // Printing out all the semi detached properties

        System.out.println(rea1.findProperty(6)); // We find SD1 from it's ID and print it
        System.out.println(rea1.findProperty("35 Tree Top Lane")); // We find SD2 from it's address and print it
    }
}
