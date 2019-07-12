package Collections.MapInterface;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapOne {

    public static void main(String[] args) {

        Map<Float,Long> map = new HashMap<>();

        map.put(1F, 23L);
        map.put(2F, 33L);
        map.put(3F, 44L);

        map.remove(3F);
        System.out.println(map);

        Iterator<Float> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Float key = iterator.next();
            Long value1 = map.get(key);
            System.out.println("this is key: " + key);
        }

        Iterator<Map.Entry<Float, Long>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Float, Long> entry = entryIterator.next();
            System.out.println("This is key: " + entry.getKey() + " This is value: " + entry.getValue());
        }



    }

    /*
        1. One HashMap with k = Float type and Value Long
        2. Remove one entry
        3. Loop via key and Key/Value

         */

}
