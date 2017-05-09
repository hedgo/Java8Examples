package pl.com.hedgo.java8.testclasses;

import pl.com.hedgo.java8.model.Developer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestGroupCountSort {

    public static final List<String> animalsList = Arrays.asList("cat", "dog", "cat", "cat", "eagle", "dog", "eagle", "snake");

    public static final List<Developer> developersList = Arrays.asList(
            new Developer("dev1", new BigDecimal("70000"), 33),
            new Developer("dev2", new BigDecimal("170000"), 40),
            new Developer("dev3", new BigDecimal("170000"), 42),
            new Developer("dev4", new BigDecimal("270000"), 100));


    public void execute() {

        newline("1, super grupowanie w java a nie oracle:)");
        Map<String, Long> result = animalsList.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(result);

        //newline("2");
        //Map<String, Long> result2 = developersList.stream().collect(
        //        Collectors.groupingBy(Developer::getAge, Collectors.summarizingDouble(Developer::getMoneyLong)));


        newline("2, super, rozbija na podlisty!!");
        Map<BigDecimal,List<Developer>> groupByMoneyMap =
                developersList.stream().collect(Collectors.groupingBy(Developer::getMoney));
        System.out.println(groupByMoneyMap);

    }

    public void newline(String line) {
        System.out.println("\n_____________" + line + "_____________");
    }
}
