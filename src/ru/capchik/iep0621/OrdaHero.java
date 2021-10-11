package ru.capchik.iep0621;

public class OrdaHero extends Hero{
    public OrdaHero(String name) {
        super(name);
    }

    public String speak() {
        return "За Орду от " + getName();
    }
}
