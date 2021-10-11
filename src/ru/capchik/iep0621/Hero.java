package ru.capchik.iep0621;

public class Hero {
    private String name;

    public Hero(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "*Звуки неловкого молчания*";
    }
}
