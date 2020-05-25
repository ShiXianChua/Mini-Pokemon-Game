package pokemongame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import javax.sound.sampled.Clip;
import static pokemongame.SongInput.playSound;

public class Main {

    public static void main(String[] args) throws IOException {
        playSound("Background.wav");
//        Clip controller2 = playSound("Opening.wav");
//        new Scanner(System.in).nextLine();
//        controller2.stop();
        Scanner first = new Scanner(System.in);
        System.out.println("                                .;:**'\n"
                + "   .:XHHHHk.              db.  `.;;.     dH  MX\n"
                + " oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN\n"
                + " QMMMMMb  \"MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM\n"
                + "   `MMMM.  )M> :X!Hk. MMMM   XMM.o\"  .  MMMMMMM X?XMMM MMM>!MMP\n"
                + "    'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `\" MX MMXXMM\n"
                + "     ~MMMMM~ XMM. .XM XM`\"MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP\n"
                + "      ?MMM>  YMMMMMM! MM   `?MMRb.    `\"\"\"   !L\"MMMMM XM IMMM\n"
                + "       MMMX   \"MMMM\"  MM       ~%:           !Mh.\"\"\" dMI IMMP\n"
                + "       'MMM                                              IMX\n"
                + "\n"
                + "         Presented to you by Team Lost in the Loop " + '\u2665' + "\n"
                + "                  press ENTER to continue:\n                      ");

        first.nextLine();
        playSound("Selection.wav");
        try {
            Scanner input = new Scanner(new FileInputStream("Ash.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("");
        System.out.println("Hi, I'm Ash Ketchum. Nice to meet you. How should I address you?");
        String playerName = first.nextLine();
        playSound("Selection.wav");

        System.out.println("\n-------------------------------------------------------\n"
                + "]   `-.+_       '-   __           ,--. ./             ]\n"
                + "]        `-.._     .:  ).        (`--\"| \\             ]\n"
                + "]             7    | `\" |         `...'  \\            ]\n"
                + "]             |     `--'     '+\"        ,\". ,\"\"-      ]\n"
                + "]             |   _...        .____     | |/    '     ]\n"
                + "]        _.   |  .    `.  '--\"   /      `./     j     ]\n"
                + "]       \\' `-.\\  '     |   `.   /        /     /      ]\n"
                + "]       '     `-. `---\"      `-\"        /     /       ]\n"
                + "-------------------------------------------------------");

        System.out.println("\nOh, it's " + playerName + ". Welcome to the pokemon trainer recruitment centre!");
        System.out.println("First, congratulations as your first step here has marked a good beginning in your journey towards becomming a dominant pokemon master in the future!");
        System.out.println("Well, without further ado, let's get right into the real stuff.");
        first.nextLine();
        playSound("Selection.wav");
        System.out.println("In this combat system, you will get to pick three different pokemons among 13 pokemons and so will I.");
        System.out.println("And whoever wipes out the enemy team first wins.");
        System.out.println("Alright, let's get right into it!");
        first.nextLine();
        playSound("Selection.wav");
        System.out.println("1. Bulbasaur \n"
                + "2. Charmander \n"
                + "3. Chikorita \n"
                + "4. Chimchar \n"
                + "5. Cyndaquil \n"
                + "6. Oshawott \n"
                + "7. Pikachu \n"
                + "8. Piplup \n"
                + "9. Snivy \n"
                + "10. Squirtle \n"
                + "11. Tepig \n"
                + "12. Totodile \n"
                + "13. Turtwig");

        TeamA TeamA1 = new TeamA();
        TeamA TeamA2 = new TeamA();
        TeamA TeamA3 = new TeamA();
        TeamB TeamB1 = new TeamB();
        TeamB TeamB2 = new TeamB();
        TeamB TeamB3 = new TeamB();

        TeamA1.pickPokemon();
        playSound("Selection.wav");
        TeamA1.display(TeamA1.getName());
        playSound(TeamA1.getName() + "Cry.wav");
        System.out.println("\npress Enter to see which pokemon Ash has chosen:");
        first.nextLine();
        playSound("Selection.wav");
        String firstBotPoke = TeamB1.pickPokemon();
        while (true) {
            if (!firstBotPoke.equals(TeamA1.getName())) {
                break;
            }
            firstBotPoke = TeamB1.pickPokemon();
        }
        TeamB1.display(firstBotPoke);
        playSound(firstBotPoke + "Cry.wav");

        TeamA2.pickPokemon();
        TeamA2.display(TeamA2.getName());
        playSound(TeamA2.getName() + "Cry.wav");
        System.out.println("\npress Enter to see which pokemon Ash has chosen:");
        first.nextLine();
        playSound("Selection.wav");
        String secondBotPoke = TeamB2.pickPokemon();
        while (true) {
            if (!secondBotPoke.equals(TeamA1.getName()) && !secondBotPoke.equals(TeamA2.getName()) && !secondBotPoke.equals(firstBotPoke)) {
                break;
            }
            secondBotPoke = TeamB2.pickPokemon();
        }
        TeamB2.display(secondBotPoke);
        playSound(secondBotPoke + "Cry.wav");

        System.out.println("\nNow it's the turn for your last pokemon.");
        TeamA3.pickPokemon();
        TeamA3.display(TeamA3.getName());
        playSound(TeamA3.getName() + "Cry.wav");
        System.out.println("\npress Enter to see the last pokemon Ash has chosen:");
        first.nextLine();
        playSound("Selection.wav");
        String thirdBotPoke = TeamB2.pickPokemon();
        while (true) {
            if (!thirdBotPoke.equals(TeamA1.getName()) && !thirdBotPoke.equals(TeamA2.getName()) && !thirdBotPoke.equals(TeamA3.getName()) && !thirdBotPoke.equals(firstBotPoke) && !thirdBotPoke.equals(secondBotPoke)) {
                break;
            }
            thirdBotPoke = TeamB3.pickPokemon();
        }
        TeamB3.display(thirdBotPoke);
        playSound(thirdBotPoke + "Cry.wav");

        Player player = new Player(TeamA1.getName(), TeamA2.getName(), TeamA3.getName());
        Bot bot = new Bot(TeamB1.getName(), TeamB2.getName(), TeamB3.getName());
        System.out.println("\n" + playerName + " have chosen " + TeamA1.getName() + "," + TeamA2.getName() + " and " + TeamA3.getName() + ".");
        System.out.println("\nAsh has chosen " + TeamB1.getName() + "," + TeamB2.getName() + " and " + TeamB3.getName() + ".");

        //PLayer choosing a pokemon to send into the battle
        System.out.println("\nChoose a pokemon to send into battle: ");
        System.out.println("[1]" + TeamA1.getName() + " [2]" + TeamA2.getName() + " [3]" + TeamA3.getName());
        System.out.print("Enter your choice : ");
        Scanner s = new Scanner(System.in);
        int choiceByPlayer = s.nextInt();
        playSound("Selection.wav");
        if (choiceByPlayer == 1) {
            player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
            player.setMainHp(TeamA1.getHp());
        } else if (choiceByPlayer == 2) {
            player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
            player.setMainHp(TeamA2.getHp());
        } else if (choiceByPlayer == 3) {
            player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
            player.setMainHp(TeamA3.getHp());
        }
        System.out.println("\n" + playerName + " sent " + player.getMainPokemon() + " into battle!");
        displayPic(player.getMainPokemon());
        playSound(player.getMainPokemon() + "Cry.wav");

        //Bot chosing a pokemon to send into battle
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("\nPokemon chosen by Ash to send into battle: ");
        System.out.print("[1]" + TeamB1.getName() + " [2]" + TeamB2.getName() + " [3]" + TeamB3.getName());
        input.nextLine();
        playSound("Selection.wav");
        int choiceByBot = rand.nextInt(3) + 1;
        if (choiceByBot == 1) {
            bot.choose(TeamB1.getName(), TeamB1.getType(), TeamB1.getMove1(), TeamB1.getMove2(), TeamB1.getMove3(), TeamB1.getMove4(), TeamB1.getMove1T(), TeamB1.getMove2T(), TeamB1.getMove3T(), TeamB1.getMove4T(), TeamB1.getMove1P(), TeamB1.getMove2P(), TeamB1.getMove3P(), TeamB1.getMove4P(), TeamB1.getMove1A(), TeamB1.getMove2A(), TeamB1.getMove3A(), TeamB1.getMove4A(), TeamB1.getAttack(), TeamB1.getSpeed(), TeamB1.getDefense());
            bot.setMainHp(TeamB1.getHp());
        } else if (choiceByBot == 2) {
            bot.choose(TeamB2.getName(), TeamB2.getType(), TeamB2.getMove1(), TeamB2.getMove2(), TeamB2.getMove3(), TeamB2.getMove4(), TeamB2.getMove1T(), TeamB2.getMove2T(), TeamB2.getMove3T(), TeamB2.getMove4T(), TeamB2.getMove1P(), TeamB2.getMove2P(), TeamB2.getMove3P(), TeamB2.getMove4P(), TeamB2.getMove1A(), TeamB2.getMove2A(), TeamB2.getMove3A(), TeamB2.getMove4A(), TeamB2.getAttack(), TeamB2.getSpeed(), TeamB2.getDefense());
            bot.setMainHp(TeamB2.getHp());
        } else if (choiceByBot == 3) {
            bot.choose(TeamB3.getName(), TeamB3.getType(), TeamB3.getMove1(), TeamB3.getMove2(), TeamB3.getMove3(), TeamB3.getMove4(), TeamB3.getMove1T(), TeamB3.getMove2T(), TeamB3.getMove3T(), TeamB3.getMove4T(), TeamB3.getMove1P(), TeamB3.getMove2P(), TeamB3.getMove3P(), TeamB3.getMove4P(), TeamB3.getMove1A(), TeamB3.getMove2A(), TeamB3.getMove3A(), TeamB3.getMove4A(), TeamB3.getAttack(), TeamB3.getSpeed(), TeamB3.getDefense());
            bot.setMainHp(TeamB3.getHp());
        }
        System.out.println("\nAsh sent " + bot.getMainPokemon() + " into battle!");
        displayPic(bot.getMainPokemon());
        playSound(bot.getMainPokemon() + "Cry.wav");
        input.nextLine();
        playSound("Selection.wav");

        int counterForPlayer = 0, counterForBot = 0;
        int sumSpeed1 = 0, sumSpeed2 = 0;

        //battle loop until one side loses all its three pokemons
        while ((counterForPlayer != 3 && counterForBot != 3)) {
            while (true) {
                System.out.println("Pokemon sent by " + playerName + ": " + player.getMainPokemon());
                System.out.println(player.getMainPokemon() + "'s HP  : " + player.getMainHp());
                System.out.println(player.getMainPokemon() + "'s moves : ");
                System.out.println("[1]" + player.getMainMove1() + " [2]" + player.getMainMove2() + " [3]" + player.getMainMove3() + " [4]" + player.getMainMove4());
                System.out.println("Pick a move : ");
                int choiceM1 = s.nextInt();
                playSound("Selection.wav");
                switch (choiceM1) {
                    case 1:
                        player.setDamage(player.getMainAtck(), player.getMainM1P(), bot.getMainDef(), player.damageMultiplier(player.getMainM1T(), bot.getMainPokemonType()));
                        player.confirmedDamage(player.getDamage(), player.getMainM1A());
                        player.setMoveused(player.getMainMove1());
                        break;
                    case 2:
                        player.setDamage(player.getMainAtck(), player.getMainM2P(), bot.getMainDef(), player.damageMultiplier(player.getMainM2T(), bot.getMainPokemonType()));
                        player.confirmedDamage(player.getDamage(), player.getMainM2A());
                        player.setMoveused(player.getMainMove2());
                        break;
                    case 3:
                        player.setDamage(player.getMainAtck(), player.getMainM3P(), bot.getMainDef(), player.damageMultiplier(player.getMainM3T(), bot.getMainPokemonType()));
                        player.confirmedDamage(player.getDamage(), player.getMainM3A());
                        player.setMoveused(player.getMainMove3());
                        break;
                    case 4:
                        player.setDamage(player.getMainAtck(), player.getMainM4P(), bot.getMainDef(), player.damageMultiplier(player.getMainM4T(), bot.getMainPokemonType()));
                        player.confirmedDamage(player.getDamage(), player.getMainM4A());
                        player.setMoveused(player.getMainMove4());
                        break;
                }

                System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                System.out.println(bot.getMainPokemon() + "'s HP  : " + bot.getMainHp());
                System.out.println(bot.getMainPokemon() + "'s moves : ");
                System.out.println("[1]" + bot.getMainMove1() + " [2]" + bot.getMainMove2() + " [3]" + bot.getMainMove3() + " [4]" + bot.getMainMove4());
                System.out.print("Move chosen by Ash: ");
                input.nextLine();
                playSound("Selection.wav");
                int choiceM2 = rand.nextInt(4) + 1;

                switch (choiceM2) {
                    case 1:
                        System.out.println(bot.getMainMove1());
                        break;
                    case 2:
                        System.out.println(bot.getMainMove2());
                        break;
                    case 3:
                        System.out.println(bot.getMainMove3());
                        break;
                    case 4:
                        System.out.println(bot.getMainMove4());
                        break;
                }

                switch (choiceM2) {
                    case 1:
                        bot.setDamage(bot.getMainAtck(), bot.getMainM1P(), player.getMainDef(), bot.damageMultiplier(bot.getMainM1T(), player.getMainPokemonType()));
                        bot.confirmedDamage(bot.getDamage(), bot.getMainM1A());
                        bot.setMoveused(bot.getMainMove1());
                        break;
                    case 2:
                        bot.setDamage(bot.getMainAtck(), bot.getMainM2P(), player.getMainDef(), bot.damageMultiplier(bot.getMainM2T(), player.getMainPokemonType()));
                        bot.confirmedDamage(bot.getDamage(), bot.getMainM2A());
                        bot.setMoveused(bot.getMainMove2());
                        break;
                    case 3:
                        bot.setDamage(bot.getMainAtck(), bot.getMainM3P(), player.getMainDef(), bot.damageMultiplier(bot.getMainM3T(), player.getMainPokemonType()));
                        bot.confirmedDamage(bot.getDamage(), bot.getMainM3A());
                        bot.setMoveused(bot.getMainMove3());
                        break;
                    case 4:
                        bot.setDamage(bot.getMainAtck(), bot.getMainM4P(), player.getMainDef(), bot.damageMultiplier(bot.getMainM4T(), player.getMainPokemonType()));
                        bot.confirmedDamage(bot.getDamage(), bot.getMainM4A());
                        bot.setMoveused(bot.getMainMove4());
                        break;
                }
                input.nextLine();
                playSound("Selection.wav");

                //speed accumulator part
                while ((sumSpeed1 <= 100 && sumSpeed2 <= 100) || (sumSpeed1 >= 100 && sumSpeed2 >= 100) || (sumSpeed1 <= 100 || sumSpeed2 <= 100) || (sumSpeed1 >= 100 || sumSpeed2 >= 100)) {

                    sumSpeed1 += player.getMainSpeed();
                    sumSpeed2 += bot.getMainSpeed();
                    System.out.println("Speed of " + player.getMainPokemon() + " = " + sumSpeed1);
                    System.out.println("");
                    System.out.println("Speed of " + bot.getMainPokemon() + " = " + sumSpeed2);
                    System.out.println("");
                    if (sumSpeed1 >= 100 && sumSpeed1 > sumSpeed2) {
                        System.out.println(player.getMainPokemon() + " moves 1st");
                        player.setTurn(1);
                        sumSpeed1 -= 100;
                        break;
                    } else if (sumSpeed2 >= 100 && sumSpeed2 > sumSpeed1) {
                        System.out.println(bot.getMainPokemon() + " moves 1st");
                        bot.setTurn(1);
                        sumSpeed2 -= 100;
                        break;
                    } else if (sumSpeed1 >= 100 && sumSpeed2 >= 100 && sumSpeed1 == sumSpeed2) {
                        Random random = new Random();
                        int chance = random.nextInt(2);
                        if (chance == 0) {
                            System.out.println(player.getMainPokemon() + " moves 1st");
                            player.setTurn(1);
                            sumSpeed1 -= 100;
                            break;
                        } else if (chance == 1) {
                            System.out.println(bot.getMainPokemon() + " moves 1st");
                            bot.setTurn(1);
                            sumSpeed2 -= 100;
                            break;
                        }
                    }
                }

                //player gets to attack first then bot
                if (player.getTurn() == 1) {
                    System.out.println("\n" + player.getMainPokemon() + " used " + player.getMoveused() + ".");
                    playSound(player.getMoveused() + ".wav");
                    if (player.getDamage() == 0) {
                        System.out.println(player.getMainPokemon() + " missed!");
                    }
                    if (player.getDamage() >= 8) {
                        System.out.println(player.getMoveused() + " is super effective!");
                    }
                    System.out.println("It dealt " + player.getDamage() + " damage.");
                    bot.setMainHp((bot.getMainHp() - player.getDamage()));
                    player.setTurn(0);
                    first.nextLine();
                    playSound("Selection.wav");
                    if (bot.getMainHp() > 0) {
                        System.out.println(bot.getMainPokemon() + " has " + bot.getMainHp() + " HP left.");
                        //player2
                        System.out.println("\n" + bot.getMainPokemon() + " used " + bot.getMoveused() + ".");
                        playSound(bot.getMoveused() + ".wav");
                        if (bot.getDamage() == 0) {
                            System.out.println(bot.getMainPokemon() + " missed!");
                        }
                        if (bot.getDamage() >= 8) {
                            System.out.println(bot.getMoveused() + " is super effective!");
                        }
                        System.out.println("It dealt " + bot.getDamage() + " damage.");
                        player.setMainHp((player.getMainHp() - bot.getDamage()));
                        System.out.println("");
                        if (player.getMainHp() > 0) {
                            System.out.println(player.getMainPokemon() + " has " + player.getMainHp() + " HP left.");
                            System.out.println("");
                        } else if (player.getMainHp() <= 0) {
                            System.out.println(player.getMainPokemon() + " has 0 HP left.");
                            System.out.println(player.getMainPokemon() + " has fainted.");
                            first.nextLine();
                            playSound("Selection.wav");
                            System.out.println("It's okay, " + player.getMainPokemon() + ". Come back now.");
                            playSound("SwitchedOut.wav");
                            first.nextLine();
                            playSound("Selection.wav");
                            break;
                        }
                    } else if (bot.getMainHp() <= 0) {
                        System.out.println(bot.getMainPokemon() + " has 0 HP left.");
                        System.out.println(bot.getMainPokemon() + " has fainted.");
                        System.out.println("");
                        first.nextLine();
                        playSound("Selection.wav");
                        System.out.println("Ash is now switching out " + bot.getMainPokemon() + ".");
                        playSound("SwitchedOut.wav");
                        first.nextLine();
                        playSound("Selection.wav");
                        break;
                    }

                    //bot gets to attack first then player
                } else if (bot.getTurn() == 1) {
                    System.out.println("\n" + bot.getMainPokemon() + " used " + bot.getMoveused() + ".");
                    playSound(bot.getMoveused() + ".wav");
                    if (bot.getDamage() == 0) {
                        System.out.println(bot.getMainPokemon() + " missed!");
                    }
                    if (bot.getDamage() >= 8) {
                        System.out.println(bot.getMoveused() + " is super effective!");
                    }
                    System.out.println("It dealt " + bot.getDamage() + " damage.");
                    player.setMainHp((player.getMainHp() - bot.getDamage()));
                    bot.setTurn(0);
                    first.nextLine();
                    playSound("Selection.wav");
                    if (player.getMainHp() > 0) {
                        System.out.println(player.getMainPokemon() + " has " + player.getMainHp() + " HP left.");
                        //player 1
                        System.out.println("\n" + player.getMainPokemon() + " used " + player.getMoveused() + ".");
                        playSound(player.getMoveused() + ".wav");
                        if (player.getDamage() == 0) {
                            System.out.println(player.getMainPokemon() + " missed!");
                        }
                        if (player.getDamage() >= 8) {
                            System.out.println(player.getMoveused() + " is super effective!");
                        }
                        System.out.println("It dealt " + player.getDamage() + " damage.");
                        bot.setMainHp((bot.getMainHp() - player.getDamage()));
                        System.out.println("");
                        if (bot.getMainHp() > 0) {
                            System.out.println(bot.getMainPokemon() + " has " + bot.getMainHp() + " HP left.");
                            System.out.println("");
                        } else if (bot.getMainHp() <= 0) {
                            System.out.println(bot.getMainPokemon() + " has 0 HP left.");
                            System.out.println(bot.getMainPokemon() + " has fainted.");
                            first.nextLine();
                            playSound("Selection.wav");
                            System.out.println("Ash is now switching out " + bot.getMainPokemon() + ".");
                            playSound("SwitchedOut.wav");
                            first.nextLine();
                            playSound("Selection.wav");
                            break;
                        }
                    } else if (player.getMainHp() <= 0) {
                        System.out.println(player.getMainPokemon() + " has 0 HP left.");
                        System.out.println(player.getMainPokemon() + " has fainted.");
                        first.nextLine();
                        playSound("Selection.wav");
                        System.out.println("It's okay, " + player.getMainPokemon() + ". Come back now.");
                        playSound("SwitchedOut.wav");
                        first.nextLine();
                        playSound("Selection.wav");
                        break;
                    }
                }

                // pokemon switching out phase
                if (TeamA1.getHp() != 0 || TeamA2.getHp() != 0 || TeamA3.getHp() != 0) {
                    System.out.println("Do you want to switch out your current Pokemon, " + player.getMainPokemon() + "?");
                    Scanner meow = new Scanner(System.in);
                    String reply = meow.nextLine();
                    playSound("Selection.wav");
                    int choiceOfPokemonToSwitchIn;
                    if (reply.equalsIgnoreCase("yes")) {
                        if (player.getMainPokemon().equals(TeamA1.getName())) {
                            if (TeamA2.getHp() != 0 && TeamA3.getHp() != 0) {
                                System.out.println("[1]" + TeamA2.getName() + " [2]" + TeamA3.getName());
                                System.out.println("Choose the pokemon you want to switch in: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                if (choiceOfPokemonToSwitchIn == 1) {
                                    player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                                    TeamA1.setHp(player.getMainHp());
                                    player.setMainHp(TeamA2.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA1.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                } else if (choiceOfPokemonToSwitchIn == 2) {
                                    player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                                    TeamA1.setHp(player.getMainHp());
                                    player.setMainHp(TeamA3.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA1.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                }
                            } else if (TeamA2.getHp() != 0 && TeamA3.getHp() == 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA2.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                                TeamA1.setHp(player.getMainHp());
                                player.setMainHp(TeamA2.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA1.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA2.getHp() == 0 && TeamA3.getHp() != 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA3.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                                TeamA1.setHp(player.getMainHp());
                                player.setMainHp(TeamA3.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA1.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA2.getHp() == 0 && TeamA3.getHp() == 0) {
                                System.out.println("You dont have any other Pokemons left");
                                System.out.println("Believe in " + player.getMainPokemon() + " !");
                            }
                        } else if (player.getMainPokemon().equals(TeamA2.getName())) {
                            if (TeamA1.getHp() != 0 && TeamA3.getHp() != 0) {
                                System.out.println("[1]" + TeamA1.getName() + " [2]" + TeamA3.getName());
                                System.out.println("Choose the pokemon you want to switch in: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                if (choiceOfPokemonToSwitchIn == 1) {
                                    player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                                    TeamA2.setHp(player.getMainHp());
                                    player.setMainHp(TeamA1.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA2.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                } else if (choiceOfPokemonToSwitchIn == 2) {
                                    player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                                    TeamA2.setHp(player.getMainHp());
                                    player.setMainHp(TeamA3.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA2.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                }
                            } else if (TeamA1.getHp() != 0 && TeamA3.getHp() == 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA1.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                                TeamA2.setHp(player.getMainHp());
                                player.setMainHp(TeamA1.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA2.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA1.getHp() == 0 && TeamA3.getHp() != 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA3.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                                TeamA2.setHp(player.getMainHp());
                                player.setMainHp(TeamA3.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA2.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA1.getHp() == 0 && TeamA3.getHp() == 0) {
                                System.out.println("You dont have any other Pokemons left");
                                System.out.println("Believe in " + player.getMainPokemon() + " !");
                            }
                        } else if (player.getMainPokemon().equals(TeamA3.getName())) {
                            if (TeamA1.getHp() != 0 && TeamA2.getHp() != 0) {
                                System.out.println("[1]" + TeamA1.getName() + " [2]" + TeamA2.getName());
                                System.out.println("Choose the pokemon you want to switch in: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                if (choiceOfPokemonToSwitchIn == 1) {
                                    player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                                    TeamA3.setHp(player.getMainHp());
                                    player.setMainHp(TeamA1.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA3.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                } else if (choiceOfPokemonToSwitchIn == 2) {
                                    player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                                    TeamA3.setHp(player.getMainHp());
                                    player.setMainHp(TeamA2.getHp());
                                    sumSpeed1 = 0;
                                    sumSpeed2 = 0;
                                    playSound("SwitchedOut.wav");
                                    System.out.println("You did well, " + TeamA3.getName() + "!. Take a rest now.");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                    System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                    displayPic(player.getMainPokemon());
                                    playSound(player.getMainPokemon() + "Cry.wav");
                                    first.nextLine();
                                    playSound("Selection.wav");
                                }
                            } else if (TeamA1.getHp() != 0 && TeamA2.getHp() == 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA1.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                                TeamA3.setHp(player.getMainHp());
                                player.setMainHp(TeamA1.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA3.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA1.getHp() == 0 && TeamA2.getHp() != 0) {
                                System.out.println("You only have one pokemon left.\n" + "[1]" + TeamA2.getName());
                                System.out.println("Pick it: ");
                                choiceOfPokemonToSwitchIn = meow.nextInt();
                                playSound("Selection.wav");
                                player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                                TeamA3.setHp(player.getMainHp());
                                player.setMainHp(TeamA2.getHp());
                                sumSpeed1 = 0;
                                sumSpeed2 = 0;
                                playSound("SwitchedOut.wav");
                                System.out.println("You did well, " + TeamA3.getName() + "!. Take a rest now.");
                                first.nextLine();
                                playSound("Selection.wav");
                                System.out.println("It's your time to shine, " + player.getMainPokemon() + "!");
                                displayPic(player.getMainPokemon());
                                playSound(player.getMainPokemon() + "Cry.wav");
                                first.nextLine();
                                playSound("Selection.wav");
                            } else if (TeamA1.getHp() == 0 && TeamA2.getHp() == 0) {
                                System.out.println("You dont have any other Pokemons left");
                                System.out.println("Believe in " + player.getMainPokemon() + " !");
                            }
                        }
                    } else {
                        System.out.println("");
                    }
                }
            }

            // Summoning another pokemon upon death of previous one
            // for PLAYER
            if (player.getMainHp() <= 0) {
                if (player.getMainPokemon().equals(TeamA1.getName())) {
                    TeamA1.setHp(0.0);
                    if (TeamA1.getHp() == 0.0 && TeamA2.getHp() != 0.0 && TeamA3.getHp() != 0.0) {
                        System.out.println("Choose another pokemon to fight: ");
                        System.out.println("[1]" + TeamA2.getName() + " [2]" + TeamA3.getName());
                        System.out.print("Enter your choice: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                            player.setMainHp(TeamA2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByPlayer == 2) {
                            player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                            player.setMainHp(TeamA3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() != 0.0) {
                        System.out.println("[1]" + TeamA3.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                            player.setMainHp(TeamA3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() != 0.0 && TeamA3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamA2.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                            player.setMainHp(TeamA2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() == 0.0) {
                        counterForBot = 3;
                    }

                } else if (player.getMainPokemon().equals(TeamA2.getName())) {
                    TeamA2.setHp(0.0);
                    if (TeamA1.getHp() != 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() != 0.0) {
                        System.out.println("Choose another pokemon to fight: ");
                        System.out.println("[1]" + TeamA1.getName() + " [2]" + TeamA3.getName());
                        System.out.print("Enter your choice: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                            player.setMainHp(TeamA1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByPlayer == 2) {
                            player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                            player.setMainHp(TeamA3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() != 0.0) {
                        System.out.println("[1]" + TeamA3.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA3.getName(), TeamA3.getType(), TeamA3.getMove1(), TeamA3.getMove2(), TeamA3.getMove3(), TeamA3.getMove4(), TeamA3.getMove1T(), TeamA3.getMove2T(), TeamA3.getMove3T(), TeamA3.getMove4T(), TeamA3.getMove1P(), TeamA3.getMove2P(), TeamA3.getMove3P(), TeamA3.getMove4P(), TeamA3.getMove1A(), TeamA3.getMove2A(), TeamA3.getMove3A(), TeamA3.getMove4A(), TeamA3.getAttack(), TeamA3.getSpeed(), TeamA3.getDefense());
                            player.setMainHp(TeamA3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() != 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamA1.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                            player.setMainHp(TeamA1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() == 0.0) {
                        counterForBot = 3;
                    }

                } else if (player.getMainPokemon().equals(TeamA3.getName())) {
                    TeamA3.setHp(0.0);
                    if (TeamA1.getHp() != 0.0 && TeamA2.getHp() != 0.0 && TeamA3.getHp() == 0.0) {
                        System.out.println("Choose another pokemon to fight: ");
                        System.out.println("[1]" + TeamA1.getName() + " [2]" + TeamA2.getName());
                        System.out.print("Enter your choice: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                            player.setMainHp(TeamA1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByPlayer == 2) {
                            player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                            player.setMainHp(TeamA2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() != 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() != 0.0) {
                        System.out.println("[1]" + TeamA1.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA1.getName(), TeamA1.getType(), TeamA1.getMove1(), TeamA1.getMove2(), TeamA1.getMove3(), TeamA1.getMove4(), TeamA1.getMove1T(), TeamA1.getMove2T(), TeamA1.getMove3T(), TeamA1.getMove4T(), TeamA1.getMove1P(), TeamA1.getMove2P(), TeamA1.getMove3P(), TeamA1.getMove4P(), TeamA1.getMove1A(), TeamA1.getMove2A(), TeamA1.getMove3A(), TeamA1.getMove4A(), TeamA1.getAttack(), TeamA1.getSpeed(), TeamA1.getDefense());
                            player.setMainHp(TeamA1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() != 0.0 && TeamA3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamA2.getName());
                        System.out.print("Summon your last pokemon: ");
                        choiceByPlayer = s.nextInt();
                        playSound("Selection.wav");
                        if (choiceByPlayer == 1) {
                            player.choose(TeamA2.getName(), TeamA2.getType(), TeamA2.getMove1(), TeamA2.getMove2(), TeamA2.getMove3(), TeamA2.getMove4(), TeamA2.getMove1T(), TeamA2.getMove2T(), TeamA2.getMove3T(), TeamA2.getMove4T(), TeamA2.getMove1P(), TeamA2.getMove2P(), TeamA2.getMove3P(), TeamA2.getMove4P(), TeamA2.getMove1A(), TeamA2.getMove2A(), TeamA2.getMove3A(), TeamA2.getMove4A(), TeamA2.getAttack(), TeamA2.getSpeed(), TeamA2.getDefense());
                            player.setMainHp(TeamA2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            displayPic(player.getMainPokemon());
                            playSound(player.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamA1.getHp() == 0.0 && TeamA2.getHp() == 0.0 && TeamA3.getHp() == 0.0) {
                        counterForBot = 3;
                    }
                }
            }

            // Summoning another pokemon upon death of previous one
            // for BOT
            if (bot.getMainHp() <= 0) {
                if (bot.getMainPokemon().equals(TeamB1.getName())) {
                    TeamB1.setHp(0.0);
                    if (TeamB1.getHp() == 0.0 && TeamB2.getHp() != 0.0 && TeamB3.getHp() != 0.0) {
                        System.out.println("\nAnother pokemon chosen by Ash to send into battle: ");
                        System.out.println("[1]" + TeamB2.getName() + " [2]" + TeamB3.getName());
                        input.nextLine();
                        playSound("Selection.wav");
                        choiceByBot = rand.nextInt(2) + 1;
                        if (choiceByBot == 1) {
                            bot.choose(TeamB2.getName(), TeamB2.getType(), TeamB2.getMove1(), TeamB2.getMove2(), TeamB2.getMove3(), TeamB2.getMove4(), TeamB2.getMove1T(), TeamB2.getMove2T(), TeamB2.getMove3T(), TeamB2.getMove4T(), TeamB2.getMove1P(), TeamB2.getMove2P(), TeamB2.getMove3P(), TeamB2.getMove4P(), TeamB2.getMove1A(), TeamB2.getMove2A(), TeamB2.getMove3A(), TeamB2.getMove4A(), TeamB2.getAttack(), TeamB2.getSpeed(), TeamB2.getDefense());
                            bot.setMainHp(TeamB2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByBot == 2) {
                            bot.choose(TeamB3.getName(), TeamB3.getType(), TeamB3.getMove1(), TeamB3.getMove2(), TeamB3.getMove3(), TeamB3.getMove4(), TeamB3.getMove1T(), TeamB3.getMove2T(), TeamB3.getMove3T(), TeamB3.getMove4T(), TeamB3.getMove1P(), TeamB3.getMove2P(), TeamB3.getMove3P(), TeamB3.getMove4P(), TeamB3.getMove1A(), TeamB3.getMove2A(), TeamB3.getMove3A(), TeamB3.getMove4A(), TeamB3.getAttack(), TeamB3.getSpeed(), TeamB3.getDefense());
                            bot.setMainHp(TeamB3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() != 0.0) {
                        System.out.println("[1]" + TeamB3.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB3.getName(), TeamB3.getType(), TeamB3.getMove1(), TeamB3.getMove2(), TeamB3.getMove3(), TeamB3.getMove4(), TeamB3.getMove1T(), TeamB3.getMove2T(), TeamB3.getMove3T(), TeamB3.getMove4T(), TeamB3.getMove1P(), TeamB3.getMove2P(), TeamB3.getMove3P(), TeamB3.getMove4P(), TeamB3.getMove1A(), TeamB3.getMove2A(), TeamB3.getMove3A(), TeamB3.getMove4A(), TeamB3.getAttack(), TeamB3.getSpeed(), TeamB3.getDefense());
                        bot.setMainHp(TeamB3.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() != 0.0 && TeamB3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamB2.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB2.getName(), TeamB2.getType(), TeamB2.getMove1(), TeamB2.getMove2(), TeamB2.getMove3(), TeamB2.getMove4(), TeamB2.getMove1T(), TeamB2.getMove2T(), TeamB2.getMove3T(), TeamB2.getMove4T(), TeamB2.getMove1P(), TeamB2.getMove2P(), TeamB2.getMove3P(), TeamB2.getMove4P(), TeamB2.getMove1A(), TeamB2.getMove2A(), TeamB2.getMove3A(), TeamB2.getMove4A(), TeamB2.getAttack(), TeamB2.getSpeed(), TeamB2.getDefense());
                        bot.setMainHp(TeamB2.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() == 0.0) {
                        counterForPlayer = 3;
                    }
                } else if (bot.getMainPokemon().equals(TeamB2.getName())) {
                    TeamB2.setHp(0.0);
                    if (TeamB1.getHp() != 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() != 0.0) {
                        System.out.println("\nAnother pokemon chosen by Ash to send into battle: ");
                        System.out.println("[1]" + TeamB1.getName() + " [2]" + TeamB3.getName());
                        input.nextLine();
                        playSound("Selection.wav");
                        choiceByBot = rand.nextInt(2) + 1;
                        if (choiceByBot == 1) {
                            bot.choose(TeamB1.getName(), TeamB1.getType(), TeamB1.getMove1(), TeamB1.getMove2(), TeamB1.getMove3(), TeamB1.getMove4(), TeamB1.getMove1T(), TeamB1.getMove2T(), TeamB1.getMove3T(), TeamB1.getMove4T(), TeamB1.getMove1P(), TeamB1.getMove2P(), TeamB1.getMove3P(), TeamB1.getMove4P(), TeamB1.getMove1A(), TeamB1.getMove2A(), TeamB1.getMove3A(), TeamB1.getMove4A(), TeamB1.getAttack(), TeamB1.getSpeed(), TeamB1.getDefense());
                            bot.setMainHp(TeamB1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByBot == 2) {
                            bot.choose(TeamB3.getName(), TeamB3.getType(), TeamB3.getMove1(), TeamB3.getMove2(), TeamB3.getMove3(), TeamB3.getMove4(), TeamB3.getMove1T(), TeamB3.getMove2T(), TeamB3.getMove3T(), TeamB3.getMove4T(), TeamB3.getMove1P(), TeamB3.getMove2P(), TeamB3.getMove3P(), TeamB3.getMove4P(), TeamB3.getMove1A(), TeamB3.getMove2A(), TeamB3.getMove3A(), TeamB3.getMove4A(), TeamB3.getAttack(), TeamB3.getSpeed(), TeamB3.getDefense());
                            bot.setMainHp(TeamB3.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() != 0.0) {
                        System.out.println("[1]" + TeamB3.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB3.getName(), TeamB3.getType(), TeamB3.getMove1(), TeamB3.getMove2(), TeamB3.getMove3(), TeamB3.getMove4(), TeamB3.getMove1T(), TeamB3.getMove2T(), TeamB3.getMove3T(), TeamB3.getMove4T(), TeamB3.getMove1P(), TeamB3.getMove2P(), TeamB3.getMove3P(), TeamB3.getMove4P(), TeamB3.getMove1A(), TeamB3.getMove2A(), TeamB3.getMove3A(), TeamB3.getMove4A(), TeamB3.getAttack(), TeamB3.getSpeed(), TeamB3.getDefense());
                        bot.setMainHp(TeamB3.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() != 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamB1.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB1.getName(), TeamB1.getType(), TeamB1.getMove1(), TeamB1.getMove2(), TeamB1.getMove3(), TeamB1.getMove4(), TeamB1.getMove1T(), TeamB1.getMove2T(), TeamB1.getMove3T(), TeamB1.getMove4T(), TeamB1.getMove1P(), TeamB1.getMove2P(), TeamB1.getMove3P(), TeamB1.getMove4P(), TeamB1.getMove1A(), TeamB1.getMove2A(), TeamB1.getMove3A(), TeamB1.getMove4A(), TeamB1.getAttack(), TeamB1.getSpeed(), TeamB1.getDefense());
                        bot.setMainHp(TeamB1.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast Pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() == 0.0) {
                        counterForPlayer = 3;
                    }

                } else if (bot.getMainPokemon().equals(TeamB3.getName())) {
                    TeamB3.setHp(0.0);
                    if (TeamB1.getHp() != 0.0 && TeamB2.getHp() != 0.0 && TeamB3.getHp() == 0.0) {
                        System.out.println("\nAnother pokemon chosen by Ash to send into battle: ");
                        System.out.println("[1]" + TeamB1.getName() + " [2]" + TeamB2.getName());
                        input.nextLine();
                        playSound("Selection.wav");
                        choiceByBot = rand.nextInt(2) + 1;
                        if (choiceByBot == 1) {
                            bot.choose(TeamB1.getName(), TeamB1.getType(), TeamB1.getMove1(), TeamB1.getMove2(), TeamB1.getMove3(), TeamB1.getMove4(), TeamB1.getMove1T(), TeamB1.getMove2T(), TeamB1.getMove3T(), TeamB1.getMove4T(), TeamB1.getMove1P(), TeamB1.getMove2P(), TeamB1.getMove3P(), TeamB1.getMove4P(), TeamB1.getMove1A(), TeamB1.getMove2A(), TeamB1.getMove3A(), TeamB1.getMove4A(), TeamB1.getAttack(), TeamB1.getSpeed(), TeamB1.getDefense());
                            bot.setMainHp(TeamB1.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        } else if (choiceByBot == 2) {
                            bot.choose(TeamB2.getName(), TeamB2.getType(), TeamB2.getMove1(), TeamB2.getMove2(), TeamB2.getMove3(), TeamB2.getMove4(), TeamB2.getMove1T(), TeamB2.getMove2T(), TeamB2.getMove3T(), TeamB2.getMove4T(), TeamB2.getMove1P(), TeamB2.getMove2P(), TeamB2.getMove3P(), TeamB2.getMove4P(), TeamB2.getMove1A(), TeamB2.getMove2A(), TeamB2.getMove3A(), TeamB2.getMove4A(), TeamB2.getAttack(), TeamB2.getSpeed(), TeamB2.getDefense());
                            bot.setMainHp(TeamB2.getHp());
                            sumSpeed1 = 0;
                            sumSpeed2 = 0;
                            System.out.println("\nPokemon sent by Ash: " + bot.getMainPokemon());
                            displayPic(bot.getMainPokemon());
                            playSound(bot.getMainPokemon() + "Cry.wav");
                            System.out.println("");
                        }
                    } else if (TeamB1.getHp() != 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamB1.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB1.getName(), TeamB1.getType(), TeamB1.getMove1(), TeamB1.getMove2(), TeamB1.getMove3(), TeamB1.getMove4(), TeamB1.getMove1T(), TeamB1.getMove2T(), TeamB1.getMove3T(), TeamB1.getMove4T(), TeamB1.getMove1P(), TeamB1.getMove2P(), TeamB1.getMove3P(), TeamB1.getMove4P(), TeamB1.getMove1A(), TeamB1.getMove2A(), TeamB1.getMove3A(), TeamB1.getMove4A(), TeamB1.getAttack(), TeamB1.getSpeed(), TeamB1.getDefense());
                        bot.setMainHp(TeamB1.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() != 0.0 && TeamB3.getHp() == 0.0) {
                        System.out.println("[1]" + TeamB2.getName());
                        System.out.print("Ash is summoning its last pokemon: ");
                        bot.choose(TeamB2.getName(), TeamB2.getType(), TeamB2.getMove1(), TeamB2.getMove2(), TeamB2.getMove3(), TeamB2.getMove4(), TeamB2.getMove1T(), TeamB2.getMove2T(), TeamB2.getMove3T(), TeamB2.getMove4T(), TeamB2.getMove1P(), TeamB2.getMove2P(), TeamB2.getMove3P(), TeamB2.getMove4P(), TeamB2.getMove1A(), TeamB2.getMove2A(), TeamB2.getMove3A(), TeamB2.getMove4A(), TeamB2.getAttack(), TeamB2.getSpeed(), TeamB2.getDefense());
                        bot.setMainHp(TeamB2.getHp());
                        sumSpeed1 = 0;
                        sumSpeed2 = 0;
                        System.out.println("\nLast pokemon sent by Ash: " + bot.getMainPokemon());
                        displayPic(bot.getMainPokemon());
                        playSound(bot.getMainPokemon() + "Cry.wav");
                        System.out.println("");
                    } else if (TeamB1.getHp() == 0.0 && TeamB2.getHp() == 0.0 && TeamB3.getHp() == 0.0) {
                        counterForPlayer = 3;
                    }
                }
            }
        }
        //GAME OUTCOME
        if (counterForPlayer == 3) {
            try {
                Scanner outcome = new Scanner(new FileInputStream("Victory.txt"));
                while (outcome.hasNextLine()) {
                    System.out.println(outcome.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            System.out.println("Congrats, You have won the battle against Ash!");
            System.out.println("You are now one step closer towards becoming a dominant pokemon master!");
            playSound("Victory.wav");
        } else if (counterForBot == 3) {
            try {
                Scanner outcome2 = new Scanner(new FileInputStream("PlayAgainLoser.txt"));
                while (outcome2.hasNextLine()) {
                    System.out.println(outcome2.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
            System.out.println("Unfortunately, your team has totally been wiped out by Ash.");
            System.out.println("However, you aint got time to give up! Try harder, " + playerName + "!");
            playSound("Defeat.wav");
        }
        first.nextLine();
        playSound("Selection.wav");
        System.out.println("Credit to: \nChua Shi Xian \nTan Eunice \nYong Weng Kuan A/L Yong Kuan Hong \nMuhammad Aiman bin Nonchik \nWan Mohamad Iqbal Hazim bin Wan Zulkifli");
    }

    public static void displayPic(String pokemonName) {
        try {
            Scanner input = new Scanner(new FileInputStream(pokemonName + "Pic.txt"));
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Pokemon not found");
        }
    }

}
