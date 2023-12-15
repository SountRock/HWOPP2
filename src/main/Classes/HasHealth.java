package main.Classes;

public interface HasHealth {

  /**
   * Возвращает максимальное количство HP
   * @return max health
   */
  int maxHealth();

  /**
   * Возвращает текущее количство HP
   * @return current health
   */
  int currentHealth();

  /**
   * Устанавливает текущую величину HP
   * @param currentHealth
   */
  void setCurrentHealth(int currentHealth);

}
