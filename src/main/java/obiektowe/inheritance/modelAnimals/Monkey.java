package obiektowe.inheritance.modelAnimals;

import obiektowe.interfaces.LandCreature;
import obiektowe.interfaces.WildAnimal;

public class Monkey extends Animal implements WildAnimal, LandCreature {

    private int taleLength;

    public Monkey(String name, int age, int taleLength) {
        super(name, age);
        this.taleLength = taleLength;
    }

    public Monkey() {
        super("Jacek", 8);
        taleLength = 20;

    }

    public void uhaha() {
        System.out.println(name + " robi uhahaha!!!");
    }

    public void jump() {
        System.out.println(name + " skacze w poszukiwaniu banana!");
    }

    public void eat() {
        System.out.println("Małpa je banana!");
    }

    @Override
    public void makeSound() {
        uhaha();
    }
}
