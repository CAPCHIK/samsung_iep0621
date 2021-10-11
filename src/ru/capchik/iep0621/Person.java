package ru.capchik.iep0621;

import java.util.concurrent.RecursiveTask;

public class Person {
    private static int lastId;
    private String name;
    private double xp;
    private final int id;

    private static int xpPerLevel = 50;

    public Person(String name) {
        this.id = lastId++;
        if (name == null) {
            name = "PERSON WITHOUT NAME #" + id;
        }
        this.name = name;
    }

    public static void setXpPerLevel(int xpPerLevel) {
        if (xpPerLevel < 1) {
            xpPerLevel = 1;
        }
        Person.xpPerLevel = xpPerLevel;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public double getXp() {
        return xp;
    }

    public void addXp(double xp) {
        if (xp < 0) {
            xp = 0;
        }
        this.xp += xp;
    }

    public void subtractXp(double xp) {
        if (xp < 0) {
            xp = 0;
        }
        if (xp > this.xp) {
            xp = this.xp;
        }
        this.xp -= xp;
    }

    public int getLevel() {
        return (int) (xp / xpPerLevel);
    }

    public int getId() {
        return id;
    }
}
