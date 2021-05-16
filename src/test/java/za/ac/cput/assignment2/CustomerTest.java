package za.ac.cput.assignment2;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.HashSet;


import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void Collection() {
        Collection<String> cus = new LinkedHashSet<>();

        for (int i = 0; i < 1; i++) {

            // add
            cus.add("Surf");
            cus.add("Omo");
            cus.add("Vanish");
            System.out.println("This is the LinkedHashSet" + " " + cus);

            //remove for collection
            cus.remove("Omo");
            System.out.println("After remove has taken place" + " " + cus);

            //find
            boolean find = cus.contains("Surf");
            System.out.println("Do we find the surf element in the LinkedHashSet" + " " + find);

        }
        assertEquals(2, cus.size()); //add

        assertEquals(2, cus.size()); //remove

        assertEquals(2, cus.size()); //find

    }


    @Test
    void Map() {
        Map<Integer, String> CustomerMap = new HashMap<>();

        for (int i = 0; i < 1; i++) {

            CustomerMap.put(31, "Viola");  //add
            CustomerMap.put(32, "Sam");
            CustomerMap.put(33, "Tee");
            System.out.println("Maps determined are as follows" + " " + CustomerMap);


            //remove
            CustomerMap.remove(33); //remove
            System.out.println("Values remaining after removing" + " " + CustomerMap);


            //Find
            boolean find = CustomerMap.containsValue("Viola");
            //printing out the find
            System.out.println("Are we able to find Viola in the set" + " " + find);
        }
        assertEquals(2, CustomerMap.size()); //add

        assertEquals(2, CustomerMap.size()); //remove

        assertEquals(2, CustomerMap.size());  //find

    }

    @Test
    void Set() {

        Set<String> CustomerSet = new HashSet<>();

        for (int i = 0; i < 1; i++) {
            //add
            CustomerSet.add("Student");
            CustomerSet.add("Mom");
            CustomerSet.add("Dad");
            System.out.println("The set consists of" + " " + CustomerSet);

            //remove
            CustomerSet.remove("Dad");
            System.out.println("The remaining customerSet after one has been removed" + " " + CustomerSet);


            //Find
            boolean find = CustomerSet.contains("Mom");
            //printing out the find
            System.out.println("Are we able to find Mom in the set" + " " + find);

        }
        assertEquals(2, CustomerSet.size()); //add

        assertEquals(2, CustomerSet.size());  //remove

        assertEquals(2, CustomerSet.size()); // find

    }


    @Test
    void List() {
        List<String> customerList = new ArrayList<>();  // list
        for (int i = 0; i < 1; i++) {

            //add
            customerList.add("Adi");
            customerList.add("Anna");
            customerList.add("Resist");
            System.out.println("Added values are as follows" + " " + customerList);

            //remove
            customerList.remove(1);
            System.out.println("Values remaining after remove" + " " + customerList);

            //find
            //Finding the element
            boolean find = customerList.contains("Resist");
            //printing out the result
            System.out.println("Are we able to find Resist in the List" + " " + " " + find);
            }

            assertEquals(2, customerList.size()); //add
            assertEquals(2, customerList.size()); // remove
            assertEquals(2, customerList.size()); // find



}

}

























