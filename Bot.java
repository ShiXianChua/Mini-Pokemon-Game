
package pokemongame;

import java.util.Random;


public class Bot {

    private final String pokemon1;
    private String pokemon1Type;
    private final String pokemon2;
    private String pokemon2Type;
    private final String pokemon3;
    private String pokemon3Type;
    private String mainPokemon;
    private String mainPokemonType;
    private double mainHp;
    private int mainAtck;
    private int mainDef;
    private int mainSpeed;
    private String mainMove1;
    private String mainM1T;
    private int mainM1P;
    private int mainM1A;
    private String mainMove2;
    private String mainM2T;
    private int mainM2P;
    private int mainM2A;
    private String mainMove3;
    private String mainM3T;
    private int mainM3P;
    private int mainM3A;
    private String mainMove4;
    private String mainM4T;
    private int mainM4P;
    private int mainM4A;
    private double damage;
    private int turn;
    private String moveused;

    public Bot(String pokemon1, String pokemon2, String pokemon3) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        this.pokemon3 = pokemon3;
        this.mainPokemon = this.pokemon1;
        this.mainMove1 = "";
        this.mainMove2 = "";
        this.mainMove3 = "";
        this.mainMove4 = "";
    }

    public double damageMultiplier(String attackType, String pokemonType) {
        if (attackType.equals("fire") && pokemonType.equals("grass")) {
            return 2;
        } else if (attackType.equals("grass") && pokemonType.equals("water")) {
            return 2;
        } else if (attackType.equals("water") && pokemonType.equals("fire")) {
            return 2;
        } else if (attackType.equals("electric") && pokemonType.equals("water")) {
            return 2;
        } else if (attackType.equals("fire") && pokemonType.equals("electric")) {
            return 1.5;
        } else if (attackType.equals("electric") && pokemonType.equals("grass")) {
            return 0.5;
        } else if (attackType.equals("grass") && pokemonType.equals("fire")) {
            return 0.5;
        } else if (attackType.equals("water") && pokemonType.equals("grass")) {
            return 0.5;
        } else if (attackType.equals("fire") && pokemonType.equals("water")) {
            return 0.5;
        } else if ((attackType.equals(pokemonType)) || (attackType.equals("normal") || pokemonType.equals("normal"))) {
            return 1;
        } else {
            return 1;
        }
    }

    public double setDamage(int Pokemonattack, int Skillpower, int OPD, double damageMultiplier) {

        this.damage = ((((Pokemonattack * Skillpower) / OPD) / 20) + 2) * damageMultiplier;

        return damage;
    }

    public double confirmedDamage(double damage, int skillAccuracy) {
        Random bodoh = new Random();
        int hitOrMiss = bodoh.nextInt(101);
        if (hitOrMiss <= skillAccuracy) {
            this.damage = damage;
            return this.damage;
        } else {
            this.damage = 0;
            return this.damage;
        }
    }

    public void choose(String pokemonChosen, String pokemonType, String move1, String move2, String move3, String move4, String move1T, String move2T, String move3T, String move4T, int move1P, int move2P, int move3P, int move4P, int move1A, int move2A, int move3A, int move4A, int atck, int speed, int def) {
        this.mainPokemon = pokemonChosen;
        this.mainPokemonType = pokemonType;
        this.mainAtck = atck;
        this.mainSpeed = speed;
        this.mainDef = def;
        this.mainMove1 = move1;
        this.mainM1P = move1P;
        this.mainM1A = move1A;
        this.mainM1T = move1T;
        this.mainMove2 = move2;
        this.mainM2P = move2P;
        this.mainM2A = move2A;
        this.mainM2T = move2T;
        this.mainMove3 = move3;
        this.mainM3P = move3P;
        this.mainM3A = move3A;
        this.mainM3T = move3T;
        this.mainMove4 = move4;
        this.mainM4P = move4P;
        this.mainM4A = move4A;
        this.mainM4T = move4T;
        this.turn = 0;
    }

    public void setMainHp(double hp) {
        this.mainHp = hp;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getMainPokemon() {
        return mainPokemon;
    }

    public double getMainHp() {
        return mainHp;
    }

    public String getMainMove1() {
        return mainMove1;
    }

    public String getMainMove2() {
        return mainMove2;
    }

    public String getMainMove3() {
        return mainMove3;
    }

    public String getMainMove4() {
        return mainMove4;
    }

    public int getMainAtck() {
        return mainAtck;
    }

    public int getMainDef() {
        return mainDef;
    }

    public String getMainPokemonType() {
        return mainPokemonType;
    }

    public int getMainSpeed() {
        return mainSpeed;
    }

    public int getMainM1P() {
        return mainM1P;
    }

    public int getMainM1A() {
        return mainM1A;
    }

    public String getMainM1T() {
        return mainM1T;
    }

    public int getMainM2P() {
        return mainM2P;
    }

    public int getMainM2A() {
        return mainM2A;
    }

    public String getMainM2T() {
        return mainM2T;
    }

    public int getMainM3P() {
        return mainM3P;
    }

    public int getMainM3A() {
        return mainM3A;
    }

    public String getMainM3T() {
        return mainM3T;
    }

    public int getMainM4P() {
        return mainM4P;
    }

    public int getMainM4A() {
        return mainM4A;
    }

    public String getMainM4T() {
        return mainM4T;
    }

    public int getTurn() {
        return turn;
    }

    public String getMoveused() {
        return moveused;
    }

    public void setMoveused(String moveused) {
        this.moveused = moveused;
    }

    public double getDamage() {
        return damage;
    }

}
