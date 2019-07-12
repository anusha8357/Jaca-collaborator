//package Collections.ListInterface;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Arraylistdemo {
//    public static void main(String[] args) {
//
//        //plain old java object- pojo
//        ArrayList<Employee> emp = new ArrayList<>();
//        Employee empp = new Employee();
//        empp.setEmpFullname("Ram");
//        empp.setEmpAddress("8346 village");
//        empp.setEmpID(1122);
//        empp.setEmpDepartment("Accountant");
//
//        Employee newemp = new Employee(11,"anu","485 leesburg", "developer");
//
//        emp.add(empp);
//        emp.add(newemp);
//        System.out.println(emp);
//
//        Iterator<Employee> iterator = emp.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
//}
