package main.Classes;

/**
 * Персонаж с HP и Энергией
 */
public class Unit implements HasHealth, HasEnergy {

  private final int maxHealth;
  private int currentHealth;

  private final int maxEnergy;
  private int currentEnergy;

  public Unit(int maxHealth, int maxEnergy) {
    this.maxHealth = maxHealth;
    this.maxEnergy = maxEnergy;

    this.currentHealth = maxHealth;
    this.currentEnergy = maxEnergy;
  }

  @Override
  public void setCurrentHealth(int currentHealth) {
    this.currentHealth = currentHealth;
  }

  @Override
  public void setCurrentEnergy(int currentEnergy) {
    this.currentEnergy = currentEnergy;
  }

  @Override
  public int maxHealth() {
    return maxHealth;
  }

  @Override
  public int currentHealth() {
    return currentHealth;
  }

  @Override
  public int maxEnergy() {
    return maxEnergy;
  }

  @Override
  public int currentEnergy() {
    return currentEnergy;
  }
}
