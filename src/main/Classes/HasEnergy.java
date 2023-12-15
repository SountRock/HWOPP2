package main.Classes;

/**
 * Интерфейс системы Энергии
 */
public interface HasEnergy {

  /**
   * Возвращает максимальное количство Энергии
   * @return max energy
   */
  int maxEnergy();

  /**
   * Возвращает текущее количство Энергии
   * @return current energy
   */
  int currentEnergy();

  /**
   * Устанавливает текущую величину Энергии
   * @param currentEnergy
   */
  void setCurrentEnergy(int currentEnergy);

}
