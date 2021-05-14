package using_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingTest {

    public static void main(String[] args){

        Employee emp1 = new Employee(1,"Sandeep","Maurya", 31);
        Employee emp2 = new Employee(2,"Rohit","Maurya", 18);
        Employee emp3 = new Employee(3,"Vaishnavi","Maurya", 16);
        Employee emp4 = new Employee(4,"Pooja","Maurya", 24);

        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        System.out.println("Before Sorting");
        System.out.println(empList);

        System.out.println("After Sorting");
        Collections.sort(empList);
        System.out.println(empList);

        System.out.println("Sorted By FirstName");
        Collections.sort(empList, new FirstNameSorter());
        System.out.println(empList);

        System.out.println("Sorted By LastName");
        Collections.sort(empList, new LastNameSorter());
        System.out.println(empList);

        System.out.println("Sorted By Age");
        Collections.sort(empList, new AgeSorter());
        System.out.println(empList);
    }
}
