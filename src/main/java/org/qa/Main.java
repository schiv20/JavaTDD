package org.qa;

import Buildings.Casino;
import Human.Footballer;
import Human.LoanShark;

import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("avg age: " +
                footballerList
                        .stream()
                        .collect(Collectors.averagingInt(Footballer::getAge))
        );

        LoanShark ls1 = new LoanShark("Slightly evil man", 30, 13);
        LoanShark ls2 = new LoanShark("Really evil man", 30, 26);
        LoanShark ls3 = new LoanShark("Evil man", 30, 21);

        List<LoanShark> loanSharkList = Arrays.asList(ls1,ls2,ls3);

        System.out.println(
                "The loan shark with the BEST interest rate is: " +
                        loanSharkList.stream().min(Comparator.comparing(LoanShark::getInterestRate)).get().getName()
        );
    }
}