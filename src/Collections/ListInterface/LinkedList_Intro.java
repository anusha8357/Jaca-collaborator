package Collections.ListInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Intro {

    public static void main(String[] args) {

        LinkedList<Integer> numList = new LinkedList<Integer>(Arrays.asList(34, 56, 4, 5, 67, 8, 6));

        System.out.println(numList);

        //make it thread safe
        Collections.synchronizedCollection(numList);

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                Iterator<Integer> iterator = numList.iterator();
                while (iterator.hasNext()) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(" This is ThreadOne: " + iterator.next());


            }

        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<Integer> iterator = numList.iterator();
                while (iterator.hasNext()) {
                    System.out.println("This is ThreadTwo " + iterator.next());
                }
            }
        });

        threadOne.start();
        threadTwo.start();
    }

}
