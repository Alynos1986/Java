package MethodsWithReturn;


import java.util.ArrayList;
public class timesTwo {
    public static void main(String[] args) {


        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(89);
        numsList.add(125);
        numsList.add(55);
        numsList.add(78);

    }
    public static void timesTwo(ArrayList<Integer>nums){
        for(int i=0; i<nums.size(); i++){
            System.out.print(nums.get(i)*2+" ");
        }
    }
}
