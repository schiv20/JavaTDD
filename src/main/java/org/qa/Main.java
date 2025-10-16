package org.qa;

import Buildings.Casino;
import Human.Footballer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Casino casino = new Casino("LARRY LUCKY'S FAMOUS CASINO", 100, 30, 1000000);

        System.out.println(casino);

        Footballer fb1 = new Footballer("Jaycee", 21);
        Footballer fb2 = new Footballer("Goob", 2000);
        Footballer fb3 = new Footballer("Felix", 75);
        Footballer fb4 = new Footballer("Junior", 6);

        List<Footballer> footballerList = Arrays.asList(fb1,fb2,fb3,fb4);

//        for(Footballer footballer : footballerList){
//
//        }

        System.out.println("avg age: " +
                footballerList
                        .stream()
                        .collect(Collectors.averagingInt(Footballer::getAge))
        );
    }
}