package Collections.SetInterface;

import java.util.*;

public class Set_Intro {

    public static void main(String[] args) {


        Set<Integer> numList = new HashSet<>();
        numList.add(23);
        numList.add(34);
        numList.add(45);
        numList.add(23);
        numList.add(67);
        System.out.println(numList);

        //it does not allow duplicate
        //Hash set will not provide any order

        Set<Integer> integers = new TreeSet<>(numList);
        System.out.println(integers);

        Map<Integer,String> hmap = new HashMap<>();
        hmap.put(1, "John");
        hmap.put(2, "Mike");

        System.out.println(hmap);

    }
}
