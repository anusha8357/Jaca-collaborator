package Collections.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("John", "Smith", 21));
        authors.add(new Author("Josh", "Paul", 30));
        authors.add(new Author("Mia", "Henderson", 25));

        //sort by first name
        Collections.sort(authors);
        System.out.println("  Sort By First name  ");
        for(Author au: authors){
            System.out.println(au);
        }

        //Sort by age..
        Collections.sort(authors, new authorAgeComparator());
        System.out.println("   Sort By Age  ");
        for(Author au: authors){
            System.out.println(au);
        }

        //Sort by Lat name
        Collections.sort(authors);
        System.out.println("   Sort by Last name  ");
        for(Author au: authors){
            System.out.println(au);
        }



    }
}

class authorAgeComparator implements Comparator<Author>{

    @Override
    public int compare(Author o1, Author o2) {
        if(o1.authorAge == o2.authorAge){
            return 0;
        } else if (o1.authorAge > o2.authorAge){
            return 1;
        } else {
            return -1;
        }
    }
}
