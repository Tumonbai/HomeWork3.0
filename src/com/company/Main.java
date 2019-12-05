package com.company;

import java.text.BreakIterator;

public class Main {

    public static void main(String[] args) {
        String [] names =  {"Mark", "Adel","Dima"};

        System.out.println("Добро Пожаловать " + "Mark, " + "Adel, "+"Dima!" );
        for (String name: names) {

        switch (name) {
            case "Mark":
                System.out.println("Mark " + "Доброе утро!");
                break;
            case "Adel":
                System.out.println("Adel " + "Добрый день!");
                break;
            case "Dima":
                System.out.println("Dima " + "Добрый вечер!");
                break;
        }

        }

    }
}
