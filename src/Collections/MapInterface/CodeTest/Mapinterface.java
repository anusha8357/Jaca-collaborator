package Collections.MapInterface.CodeTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapinterface {
//     2. Create withHashMap and user Person class as value..
//            1. Add the data by calling constructor of person class
//    2. Remove
//    3. Clone
//    4. ContainKey
//    5. Loop using key/value pair

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person(1, "John", new Date(), "513 birch"));
        map.put(2, new Person(2, "emily", new Date(), "782 leesburg"));
        map.put(3, new Person(3, "mike", new Date(), "68 main"));

        //using setter
        Person p1 = new Person();
        p1.setPersonID(33);
        p1.setName("Harry");
        p1.setPersonDOB(new Date());
        p1.setAddress("45 village");
        map.put(4, p1);

        System.out.println(map);

        //remove

        map.remove(2);
        System.out.println("remove method");
        System.out.println(map);

        //clone
        Map<Integer, Person> map1 = new HashMap<>();
        System.out.println("  clone  ");
        System.out.println(map1);

        //Contain key
        boolean b1 = map1.containsKey(2);
        System.out.println(map1);

        Iterator<Map.Entry<Integer, Person>> entryIterator = map1.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, Person> map2 = entryIterator.next();
            System.out.println(map2);



        }


    }

}