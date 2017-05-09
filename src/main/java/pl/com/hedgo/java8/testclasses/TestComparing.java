package pl.com.hedgo.java8.testclasses;

import pl.com.hedgo.java8.model.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestComparing {

    public void execute() {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("After Sort Age");
        listDevs.sort((o1, o2) -> o1.getAge() - o2.getAge());
        listDevs.forEach((o) -> System.out.println(o));

        System.out.println("After Sort Money");
        //listDevs.sort((o1, o2)->o2.getMoney().compareTo(o1.getMoney()));
        listDevs.sort(Comparator.comparing(Developer::getMoney).reversed());
        listDevs.forEach(System.out::println);
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));
        return result;
    }

}
