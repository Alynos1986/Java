package JavaDay41_Classes02_Encapsulation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseBuilder {
    public static void main(String[] args) {
        House house1 = new House();
        house1.bedroom = 3;
        house1.type = "Townhouse";
        house1.address = "8701 Main st, Chicago Illinois";
        house1.year =2010;

        House house2 = new House();
        house2.bedroom = 2;
        house2.type = "Apartment";
        house2.address = "555 Chicago st, Chicago Illinois";
        house2.year =2017;


        House house3 = new House();
        house3.bedroom = 5;
        house3.type = "Single House";
        house3.address = "789 LAke st, Chicago Illinois";
        house3.year =2009;


        House WhiteHouse = new House();
        WhiteHouse.bedroom = 5;
        WhiteHouse.type = "Mansion";
        WhiteHouse.address = "787 Madison st, Chicago Illinois";
        WhiteHouse.year =1800;

        System.out.println("House1 type: "+ house1.type);
        System.out.println("House2 type: " + house2.type);
        System.out.println("House3 type: "+ house3.type);
        System.out.println("WhiteHouse type: " + WhiteHouse.type);

        int[]nums = new int[4];
        nums [0] = 234;
        String[] names = new String [4];
        names[0] = "Bill";

        House EsqersHouse = new House();
        EsqersHouse.type = "Townhouse";
        EsqersHouse.address = "4321 Jone st, Chicago, ILlinois";
        EsqersHouse.bedroom = 3;
        EsqersHouse.year = 1980;


       House [] houses = new House[5];
       houses[0] = house1;
        houses[1] = house2;
        houses[2] = house3;
        houses[3] = WhiteHouse;
        houses[4] = EsqersHouse;

        System.out.println(houses[0].address);
        for(House h:houses){
            System.out.println(h.type + "=>" + h.address);
        }
        for(int i = 0; i<houses.length; i++){
            System.out.println( houses[i].type+ " | " + houses[i].address);
        }
        System.out.println("=======ARRAYSLIST OF HOUSE OBJECTS======");

        ArrayList<Integer> numsList = new ArrayList<>();
    ArrayList<House> housesList = new ArrayList<>();
        housesList.add(house1);
        housesList.add(house2);
        housesList.add(house3);
        housesList.add(WhiteHouse);
        housesList.add(EsqersHouse);

        ArrayList<House>houseList2 = new ArrayList<>(Arrays.asList(houses));
        List<House> housesList3 = Arrays.asList(houses);

        //print year and Address of each house object in arraysList if year is between 2006 and 2016

        for(House h:housesList){
            int year = h.year;
            if(year>=2006 && year <= 2016){
                System.out.println(year + " | " + h.address);
            }
        }
        for(int j = 0; j < housesList.size();j++){
            House tempHouse = housesList.get(j);
            if(tempHouse.year>= 2006 && tempHouse.year <= 2016) {
                System.out.println(tempHouse.year + "|" + tempHouse.address);
            }
        }

    }
    public static void printHomeInfo(House house){
        System.out.println("==========");
        System.out.println("Type: " + house.type);
        System.out.println("Address: " + house.address);
        System.out.println("Bedrooms #: " + house.bedroom);
        System.out.println("Year: "+ house.year);
        System.out.println("==========");
    }
}
