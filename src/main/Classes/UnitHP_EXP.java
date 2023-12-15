package main.Classes;

import java.util.LinkedList;
import java.util.List;

/**
 * Базовый класс для персонажа, коорый имеет только HP и возможность прокачки.
 */
public class UnitHP_EXP implements HasHealth, Expeirence {

    private String name;
    private static List<String> usingNames = new LinkedList<>();
    private final int maxHealth;
    private int currentHealth;

    ///////////////////////////////
    private int exp = 0;
    private int expAfterEvent; //сколько приобретаем оцков опыта после "действия"
    private int level = 1;
    private int levelLimit; //количесво очков, которое необходимо достить, для перехода на новый уровень
    private float GrowthExpLimitCoefficient; //коэфицент повышения levelLimit
    private String methodForGetExpeirence; //метод прокачки
    ///////////////////////////////

    public UnitHP_EXP(String name, int maxHealth, String methodForGetExpeirence, int expAfterEvent, int levelLimit, float GrowthExpLimitCoefficient) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.name = testName(name);
        this.methodForGetExpeirence = methodForGetExpeirence;
        this.GrowthExpLimitCoefficient = GrowthExpLimitCoefficient;
        this.levelLimit = levelLimit;
        this.expAfterEvent = expAfterEvent;
    }

    /**
     * Проверяет имя на уникальность
     * @param name
     * @return unique name
     */
    private String testName(String name){
        if(usingNames.indexOf(name) == -1){
            usingNames.add(name);
            return name;
        } else {
            return name + this.hashCode();
        }
    }

    /**
     * Возврашает имя Юнита
     * @return name
     */
    public String getName() {
        return name;
    }

    @Override
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public int maxHealth() {
        return maxHealth;
    }

    @Override
    public int currentHealth() {
        return currentHealth;
    }

    ///////////////////////////////
    @Override
    public int getCurrentLevel() {
        return level;
    }

    @Override
    public int getCurrentExpeirence() {
        return exp;
    }

    @Override
    public int getLevelExpeirence() {
        return levelLimit;
    }

    @Override
    public void setCurrentLevel(int level) {
        this.level = level;
    }

    @Override
    public void setCurrentExpeirence(int exp) {
        this.exp = exp;
    }

    @Override
    public String getMethodForGetExpeirence() {
        return methodForGetExpeirence;
    }

    @Override
    public void setLevelExpeirence(int levelLimit) {
        this.levelLimit = levelLimit;
    }

    @Override
    public int getExpeirence() {
        return expAfterEvent;
    }

    @Override
    public float getGrowthExpLimitCoefficient() {
        return GrowthExpLimitCoefficient;
    }
    ///////////////////////////////
}
