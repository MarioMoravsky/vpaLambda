package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Juraj");
        names.add("Adam");
        names.add("Adrian");
        names.add("Marek");
        names.add("Kristina");
        names.add("Peter");
        names.add("Anna");
        names.add("Robert");
        names.add("Milan");
        names.add("Gregor");

        // Lambda funkcia na usporiadanie listu
        Collections.sort(names, (a, b) -> a.compareTo(b));


        System.out.println("Usporiadaný list:");
        names.forEach(System.out::println);
    }
}