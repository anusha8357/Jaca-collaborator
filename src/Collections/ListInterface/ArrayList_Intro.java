package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Intro {

    public static void main(String[] args) {


        //List declaration

        List<String> nameList = new ArrayList<>();

        //With class declaration
        ArrayList<String> list = new ArrayList<>();

        System.out.println(nameList);

        nameList.add("John");
        nameList.add("Sam");
        nameList.add("Johanna");
        nameList.add("Mike");


        for(int i = 0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        //using iterator class
        Iterator<String> iterator = nameList.iterator();

        System.out.println("      Using Iterator class      ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
