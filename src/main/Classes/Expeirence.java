package main.Classes;
/**
 * Интерфейс для системы опыта
 */
public interface Expeirence extends ExpeirenceEvent {
    /**
     * Получить текущий уровень
     */
    int getCurrentLevel();

    /**
     * Получить текущий опыт
     */
    int getCurrentExpeirence();

    /**
     * Получить текущий величину границы нового уровня
     */
    int getLevelExpeirence();

    /**
     * Установить текущий уровень
     */
    void setCurrentLevel(int level);

    /**
     * Установить текущий опыт
     */
    void setCurrentExpeirence(int exp);

    //Дополнительные параметры и методы
    /**
     * Получить метод получения опыта
     */
    String getMethodForGetExpeirence();

    /**
     * Установить текущий величину границы нового уровня
     */
    void setLevelExpeirence(int levelLimit);

    /**
     * Получить коэфицент повышения границы нового уровня
     */
    float getGrowthExpLimitCoefficient();
}
