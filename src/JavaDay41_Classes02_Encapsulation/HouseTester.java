package JavaDay41_Classes02_Encapsulation;

public class HouseTester {
    public static void main(String[] args) {
        //step 1. create house object and assign data to fields/ins variables
        House yourHouse = new House();
        yourHouse.type = "Castle";
        yourHouse.address = "100 Mercedes drive, Chicago, Illinois, 60656";
        yourHouse.bedroom = 250;
        yourHouse.year = 2018;

        //step2. PAss your house object to printHouseInfo method

    }

    public static void printHouseInfo(House house) {
        System.out.println("==========");
        System.out.println("Type: " + house.type);
        System.out.println("Address: " + house.address);
        System.out.println("Bedrooms #: " + house.bedroom);
        System.out.println("Year: " + house.year);
        System.out.println("==========");

        //Method buildAHouse:
        //Params; 4=> 2 Strings/2 ints
        //Return type: house

        //in the method, using the values of the parameters build a new House object
        //then return that


    }

}
