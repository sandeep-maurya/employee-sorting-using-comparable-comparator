package comparator_with_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeSortingDemo {

    public static void main(String[] args){

        Employee emp1 = new Employee(1, "Sandeep", "Maurya", 31);
        Employee emp2 = new Employee(2, "Rohit", "Maurya", 18);
        Employee emp3 = new Employee(3, "Pooja", "Maurya", 24);
        Employee emp4 = new Employee(4, "Vaishnavi", "Maurya", 16);
        Employee emp5 = new Employee(5, "Vaishnavi", "Maurya", 10);

        ArrayList<Employee> empList = new ArrayList<Employee>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("Default Sorting");
        Collections.sort(empList);
        System.out.println(empList);

        System.out.println("Soting By FirstName");
        empList.sort(Comparator.comparing(e -> e.getFirstName()));
        System.out.println(empList);

        System.out.println("Soting By Age");
        empList.sort(Comparator.comparing(Employee::getAge));
        System.out.println(empList);

        System.out.println("Sort By FirstName & Age");
        Comparator<Employee> groupByCompartor = Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getAge);
        empList.sort(groupByCompartor);
        System.out.println(empList);
    }
}
