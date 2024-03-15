package Homework;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2){
        return Integer.compare(o2.age, o1.age);
    }

}
