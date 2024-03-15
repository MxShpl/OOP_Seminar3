package Homework;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(15);
        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по заработной плате");

        Arrays.sort(workers, new SalaryComparator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по возрасту");

        Arrays.sort(workers, new AgeComporator());

        for (Employee worker : workers) {
            System.out.println(worker);
        }
    }

}
