package pl.com.hedgo.java8.testclasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestForEach {

    public static final Map<String, Integer> testMap = new HashMap<>();
    public static final List<String> testList = new ArrayList<>();

    public TestForEach() {
        testMap.put("A", 10);
        testMap.put("B", 20);
        testMap.put("C", 30);
        testMap.put("D", 40);
        testMap.put("E", 50);
        testMap.put("F", 60);

        testList.add("A");
        testList.add("B");
        testList.add("C");
        testList.add("D");
        testList.add("E");
    }

    public void executeMap() {

        newline("1");
        testMap.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        newline("2");
        testMap.forEach((k, v) -> {
            System.out.println("Item : " + k + " Count : " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });
    }

    public void executeList() {
        newline("1");
        testList.forEach(i -> System.out.print(i));


        newline("2");
        testList.forEach(System.out::print);

        newline("3");
        testList.forEach(i -> {
            if ("B".equals(i))
                System.out.print("Znalazlem " + i);
        });


        newline("4");
        testList.stream().filter(i -> i.contains("B")).forEach(System.out::print);
    }

    public void newline(String line) {
        System.out.println("\n_____________" + line + "_____________");
    }

}
