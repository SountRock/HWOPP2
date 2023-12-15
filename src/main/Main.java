package main;

import main.Classes.*;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //ExpHandler expHandler = new ExpHandler();
        //Unit unit1 = new Unit(100, 200);
        //expHandler.upUnitExp((Expeirence) unit1, "kill rock");

        //Fisherman fisherman = new Fisherman("Jack",100);

        //expHandler.upUnitExp(fisherman, "fishing");
        //expHandler.upUnitExp((Expeirence) hunter, "KILLmobs");
        //expHandler.upUnitExp((Expeirence) hunter, "kill rock");
        //expHandler.upUnitExp((Expeirence) unit1, "kill rock");
        //System.out.println(expHandler.status(fisherman));
        //System.out.println(fisherman.maxHealth());

        HashMap<String, UnitHP_EXP> persons = new HashMap<>();

        UnitHP_EXP fisherman = new Fisherman("jack",100);
        UnitHP_EXP hunter = new Hunter("anna",120);
        UnitHP_EXP miner = new Miner("michael",160);

        persons.put(fisherman.getName(), fisherman);
        persons.put(hunter.getName(), hunter);
        persons.put(miner.getName() , miner);

        Game game = new Game(persons);
        game.commandUp();
    }
}