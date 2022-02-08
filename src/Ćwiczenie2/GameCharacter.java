package Ćwiczenie2;

public class GameCharacter {

    private String name;
    private double attack;
    private double defense;
    private double health;

    public GameCharacter(String name, double attack, double defense, double health) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }




}
