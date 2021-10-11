package ru.capchik.iep0621;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Square(10);
        r.setHeight(5);
    }


    public static Rectangle formatter(
            Rectangle r,
            int baseSize) {
        r.setWidth(baseSize);
        r.setHeight(baseSize * 2);
        return r;
    }


    private static void workWithHero() {
        Hero h1 = new AlyansHero("Первый");
        Hero h2 = new OrdaHero("Второй");
        Hero h3 = new NezitHero("Третий");


        Hero[] people = {h1,h2,h3};
        for (Hero person : people) {
            System.out.println(person.speak());
        }
    }

    private static Person[] workWithTreePeople() {
        Person[] people = {
            new Person(null),
            new Person("Alex"),
            new Person(null)
        };

        Random random = new Random(100500);

        for (Person person : people) {
            person.addXp(random.nextDouble() * 500);
            System.out.println(person.getXp());
        }

        printInfoAboutPeople(people);
        Person.setXpPerLevel(0);
        return people;
    }

    private static void printInfoAboutPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(
                    person.getId() + " " +
                    person.getName() + " " +
                    person.getLevel());

        }
    }

    private static void workWithOnePerson() {
        Person p = new Person(null);
        System.out.println(p.getName());
        p.setName("LolKek");
        System.out.println(p.getName());
        p.addXp(560);
        System.out.println(p.getLevel());
        p.subtractXp(1000);
        System.out.println(p.getLevel());
    }

    private static void workWithCalc() {
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.sum(3));
        System.out.println(calculator1.sum(-8));
        Calculator calculator2 = new Calculator(15);
        System.out.println(calculator2.sum(-8));
        calculator2 = calculator1;
        System.out.println(calculator2.getCurrent());
    }
}
