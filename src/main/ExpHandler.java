package main;

import main.Classes.Expeirence;

/**
 * Класс для работы с системой накопления опыта
 */
public class ExpHandler {

    /**
     * Получить текущий уровень Юнита
     */
    public int getUnitLevel(Expeirence expeirence) {
        return expeirence.getCurrentLevel();
    }

    /**
     * Получить текущий опыт Юнита
     */
    public int getUnitCurrentExpeirence(Expeirence expeirence) {
        return expeirence.getCurrentExpeirence();
    }

    /**
     * Получить текущию границу нового уровня Юнита
     */
    public int getUnitLevelExpeirence(Expeirence expeirence) {
        return expeirence.getLevelExpeirence();
    }

    /**
     * Получить сводный статус опыта Юнита
     */
    public String status(Expeirence expeirence){
        return String.format("level: %d, exp: %d / %d", expeirence.getCurrentLevel(), expeirence.getCurrentExpeirence(), expeirence.getLevelExpeirence());
    }

    /**
     * Метод для повышения опыта Юнита. Он должен совершить опереленное десвие согласно его классу.
     * @param expeirence
     * @param event
     * @return success
     */
    public boolean upUnitExp(Expeirence expeirence, String event) {
        //проверяет совпадает ли команда с действием для прокачки класса
        if(event.toLowerCase().replaceAll(" ", "").equals(expeirence.getMethodForGetExpeirence().replaceAll(" ", ""))){
            int exp = expeirence.getCurrentExpeirence() + expeirence.getExpeirence(); //новое количество опыта

            //если опыт превышает грань для перехода на новый уровень
            if(exp > expeirence.getLevelExpeirence()){
                expeirence.setCurrentExpeirence(exp - expeirence.getLevelExpeirence());

                int level = expeirence.getCurrentLevel();
                expeirence.setCurrentLevel(level + 1);

                int levelLimit = (int) (expeirence.getLevelExpeirence() * expeirence.getGrowthExpLimitCoefficient());
                expeirence.setLevelExpeirence(levelLimit);

            //если нет
            } else {
                expeirence.setCurrentExpeirence(exp);
            }
            return true;
        } else {
            return false;
        }
    }
}
