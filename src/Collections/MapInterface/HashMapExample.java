package Collections.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        //HashMap declaration
        Map<Integer, String>  map = new HashMap<>();

        //Add the data

        map.put(1, "A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5, "E");
        map.put(6, "F");
        System.out.println(map);

        //read the specific data set

        String value = map.get(2);
        System.out.println("this is value of key: " + value);

        //remove the data
        map.remove(3);
        System.out.println("    Remove Method   ");
        System.out.println(map);

        //how to loop HashMap,

        //loop via key only
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String valueOne = map.get(key);
            System.out.println("This is key: " + key  + "and Value is: " + valueOne);
        }

        //loop via both key and value
        Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println("This is key : " +entry.getKey() + "This is value: " + entry.getValue());
        }

        /*
        1. One HashMap with k = Float type and Value Long
        2. Remove one entry
        3. Loop via key and Key/Value

         */

    }
}
