package main.Classes;

/**
 * Класс Юнита: Рыбак
 */
public final class Fisherman extends UnitHP_EXP{
    public Fisherman(String name, int maxHealth) {
        super(name, maxHealth, "fishing", 10, 100, 1.5F);
    }
}
