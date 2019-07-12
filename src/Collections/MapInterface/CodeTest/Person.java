package Collections.MapInterface.CodeTest;

import java.util.Date;

public class Person implements Comparable<Person>{
    //   1. Create POJO class Person
//    Person -ID(Long), Name, Date(Date class), Address

    private long personID;
    private String Name;
    private Date PersonDOB;
    private String address;

    public Person() {
    }

    public Person(long personID, String name, Date personDOB, String address) {
        this.personID = personID;
        Name = name;
        PersonDOB = personDOB;
        this.address = address;
    }

    public long getPersonID() {
        return personID;
    }

    public String getName() {
        return Name;
    }

    public Date getPersonDOB() {
        return PersonDOB;
    }

    public String getAddress() {
        return address;
    }

    public void setPersonID(long personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPersonDOB(Date personDOB) {
        PersonDOB = personDOB;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", Name='" + Name + '\'' +
                ", PersonDOB=" + PersonDOB +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public static void main(String[] args) {



    }
}
