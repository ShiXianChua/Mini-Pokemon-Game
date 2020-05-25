
package pokemongame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class TeamB {

    private String name;
    private String type;
    private int attack;
    private int defense;
    protected double hp;
    private int speed;

    private String Move1;
    private String Move1T;
    private int Move1P;
    private int Move1A;

    private String Move2;
    private String Move2T;
    private int Move2P;
    private int Move2A;

    private String Move3;
    private String Move3T;
    private int Move3P;
    private int Move3A;

    private String Move4;
    private String Move4T;
    private int Move4P;
    private int Move4A;

    String[] pokemonArrayForBot = {"Bulbasaur", "Charmander", "Chikorita", "Chimchar", "Cyndaquil", "Oshawott", "Piplup", "Snivy", "Squirtle", "Tepig", "Totodile", "Turtwig"};

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public double getHp() {
        return hp;
    }

    public double setHp(double MainHP) {
        hp = MainHP;
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMove1() {
        return Move1;
    }

    public String getMove1T() {
        return Move1T;
    }

    public int getMove1P() {
        return Move1P;
    }

    public int getMove1A() {
        return Move1A;
    }

    public String getMove2() {
        return Move2;
    }

    public String getMove2T() {
        return Move2T;
    }

    public int getMove2P() {
        return Move2P;
    }

    public int getMove2A() {
        return Move2A;
    }

    public String getMove3() {
        return Move3;
    }

    public String getMove3T() {
        return Move3T;
    }

    public int getMove3P() {
        return Move3P;
    }

    public int getMove3A() {
        return Move3A;
    }

    public String getMove4() {
        return Move4;
    }

    public String getMove4T() {
        return Move4T;
    }

    public int getMove4P() {
        return Move4P;
    }

    public int getMove4A() {
        return Move4A;
    }

    public String pickPokemon() {

        Random rand = new Random();
        return pokemonArrayForBot[rand.nextInt(12)];
    }

    public void display(String pokemonChosen) throws IOException {
        System.out.println("\nAsh has chosen: " + pokemonChosen);
        try {

            Scanner input = new Scanner(new FileInputStream(pokemonChosen + "Pic.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            Scanner s = new Scanner(new FileInputStream(pokemonChosen + ".txt"));

            name = s.next();
            type = s.next();
            attack = s.nextInt();
            defense = s.nextInt();
            hp = s.nextDouble();
            speed = s.nextInt();

            Move1 = s.next() + s.nextLine();
            Move1T = s.next();
            Move1P = s.nextInt();
            Move1A = s.nextInt();

            Move2 = s.next() + s.nextLine();
            Move2T = s.next();
            Move2P = s.nextInt();
            Move2A = s.nextInt();

            Move3 = s.next() + s.nextLine();
            Move3T = s.next();
            Move3P = s.nextInt();
            Move3A = s.nextInt();

            Move4 = s.next() + s.nextLine();
            Move4T = s.next();
            Move4P = s.nextInt();
            Move4A = s.nextInt();

            System.out.println(
                    "\nName            >> " + name
                    + "\nType            >> " + type
                    + "\nAttack          >> " + attack
                    + "\nSpeed           >> " + defense
                    + "\nHp              >> " + hp
                    + "\nDefense         >> " + speed
                    + "\n\nMove 1          >> " + Move1
                    + "\nMove 1 Type     >> " + Move1T
                    + "\n       Power    >> " + Move1P
                    + "\n       Accuracy >> " + Move1A
                    + "\n\nMove 2          >> " + Move2
                    + "\nMove 2 Type     >> " + Move2T
                    + "\n       Power    >> " + Move2P
                    + "\n       Accuracy >> " + Move2A
                    + "\n\nMove 3          >> " + Move3
                    + "\nMove 3 Type     >> " + Move3T
                    + "\n       Power    >> " + Move3P
                    + "\n       Accuracy >> " + Move3A
                    + "\n\nMove 4          >> " + Move4
                    + "\nMove 4 Type     >> " + Move4T
                    + "\n       Power    >> " + Move4P
                    + "\n       Accuracy >> " + Move3A);
        } catch (FileNotFoundException e) {
            System.out.println("Pokemon not found");

        }
    }
}
