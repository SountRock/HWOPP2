package main.Classes;

/**
 * Класс Юнита: Шахтер
 */
public class Miner extends UnitHP_EXP implements Expeirence {
    public Miner(String name, int maxHealth) {
        super(name, maxHealth, "mining in a cave", 30, 300, 1.7F);
    }
}
