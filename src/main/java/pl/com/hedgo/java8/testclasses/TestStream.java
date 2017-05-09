package pl.com.hedgo.java8.testclasses;

import pl.com.hedgo.java8.model.Developer;
import pl.com.hedgo.java8.model.Human;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

    public static final List<Developer> developersList = Arrays.asList(
            new Developer("dev1", new BigDecimal("70000"), 33),
            new Developer("dev2", new BigDecimal("170000"), 40),
            new Developer("dev3", new BigDecimal("270000"), 100));

    public void execute() {

        newline("1");
        Developer d = developersList.stream()
                .filter(x -> "dev2".equals(x.getName()) && x.getAge() > 35)
                .findFirst()
                .orElse(null);
        System.out.println(d);

        newline("2");
        BigDecimal bd = developersList.stream()
                .filter(x -> "dev2".equals(x.getName()) && x.getAge() > 35)
                .map(Developer::getMoney)
                .findFirst()
                .orElse(null);
        System.out.println(bd);


        newline("3, super przerobienie jednej listy na druga");
        List<BigDecimal> bdList = developersList.stream().map(Developer::getMoney).collect(Collectors.toList());
        bdList.forEach(System.out::print);

        newline("4, super przemapowanie listy jednych obiektow na drugie");
        List<Human> humans = developersList.stream()
                .map(x->{return new Human(x.getName(),x.getAge());})
                .collect(Collectors.toList());
        System.out.println(humans);

    }

    public void newline(String line) {
        System.out.println("\n_____________" + line + "_____________");
    }
}
