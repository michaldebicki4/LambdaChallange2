package com.michaldebicki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<String> topNames2005 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "olivier",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> topNames2006 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "olivier",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

//        List<String> firstUpperCaseList = new ArrayList<>();
//        topNames2005.forEach(name ->{
//            firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1));
////            firstUpperCaseList.sort((s1,s2) ->s1.compareTo(s2));
////            firstUpperCaseList.forEach(s -> System.out.println(s));
//            firstUpperCaseList.sort(String::compareTo);
//            firstUpperCaseList.forEach(System.out::println);
//        });

        topNames2006
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .count();
                //.forEach(System.out::println);

        System.out.println(topNames2005
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(s ->s.startsWith("A"))
                .count());


    }

    public static String everySecondCharacter(Function<String,String> func, String source) {
        return func.apply(source);
    }
}
