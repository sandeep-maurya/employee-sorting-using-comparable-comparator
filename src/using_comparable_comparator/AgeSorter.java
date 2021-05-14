package using_comparable_comparator;

import java.util.Comparator;

public class AgeSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getAge() - e2.getAge();
    }
}
