package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programa2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("alex");
        list.add("Bob");
        list.add("ana");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("---------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
        System.out.println(name);

    }
}
