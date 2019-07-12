package Collections.MapInterface.CodeTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PersonMap {

    public static void main(String[] args) {


    }

    //loop HashMap and return the data

    public static HashMap<Integer, Person> getPersonMap(int key, long id, String name, Date dob, String add){
        Map<Integer, Person> map = new HashMap<>();

        Person person = new Person();
        person.setPersonID(id);
        person.setName(name);
        person.setPersonDOB(dob);
        person.setAddress(add);

        map.put(key, person);

        Iterator<Map.Entry<Integer, Person>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Person> entry = iterator.next();
            System.out.println(entry);
        }

        return (HashMap<Integer,Person>) map;
    }
}
