package using_comparable_comparator;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
    }
}
