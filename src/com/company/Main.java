package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Double> temperatureList = new ArrayList<Double>();
        // Adding items to your ArrayList is simple and fun with the add method.
        temperatureList.add(40.5);
        temperatureList.add(33.9);
        temperatureList.add(37.8);
        temperatureList.add(15.3);
        temperatureList.add(25.6);
        System.out.println(temperatureList);

        for( Double temp : temperatureList) {
            System.out.println(temp);
        }
      //  (Collections.sort(temperatureList));


//        Sorting


//        You won't find a sort method in the ArrayList. That's
//        because the ArrayList doesn't give you a way to sort its contents.
//        The java.util.Collections class contains a sort method.
//        You can sort your list in ascending order according to the natural ordering.
//                Here's how to use it:

        Collections.sort(temperatureList);
        System.out.println(temperatureList);


        // shuffled
        Collections.shuffle(temperatureList);
        System.out.println(temperatureList);


        int searchIndex = Collections.binarySearch(temperatureList, 40.5);
        if(searchIndex >=0){
            System.out.println("Temperature found." + searchIndex);
        }else{
            System.out.println("Temperature not found." + searchIndex);


        }
    }
}
