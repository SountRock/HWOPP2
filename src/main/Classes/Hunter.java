package main.Classes;

/**
 * Класс Юнита: Охотник
 */
public class Hunter extends UnitHP_EXP{
    public Hunter(String name, int maxHealth) {
        super(name, maxHealth, "kill animal", 30, 250, 1.3F);
    }
}
