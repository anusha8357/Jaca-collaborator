package Class_Definition;

import java.util.Arrays;

public class MethodsInJava {
    int empId;
    int empSalary;
    String empName;
    String empAddress;
    int weekHours[];

    public static void main(String[] args) {

        //calling default constructor
        MethodsInJava obj = new MethodsInJava();

        obj.setEmpID(11);
        obj.getEmpId(11);

        int hours[] = {8,9,8,9,9};
        obj.getWeekHours(hours);



    }

    public int setEmpID(int empID){
        this.empId = empID;
        return empID;
    }

    public int getEmpId(int empId){
        System.out.println(empId);
        return empId;
    }

    int[] getWeekHours(int[] arr){
        weekHours = arr;
        System.out.println(Arrays.toString(weekHours));
        return weekHours;



    }
}
