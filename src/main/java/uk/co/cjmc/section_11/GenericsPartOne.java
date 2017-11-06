package uk.co.cjmc.section_11;

import java.util.ArrayList;
import java.util.logging.Logger;

public class GenericsPartOne {

    final static Logger logger = Logger.getLogger(String.valueOf(GenericsPartOne.class));

    public static void main(String[] args) {
        // No Type safety
        //ArrayList items = new ArrayList();
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Bryn"); // This will create an error but not until run time
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        logger.info("Now printing.....");
        for(int i : n){
            System.out.println(i * 2);
        }
    }

}
