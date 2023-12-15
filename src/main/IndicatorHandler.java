package main;

import main.Classes.HasEnergy;
import main.Classes.HasHealth;

public class IndicatorHandler {

  public void handleHealthIndicator(HasHealth hasHealth) {
    System.out.println("... max health: " + hasHealth.maxHealth() + ", current = " + hasHealth.currentHealth());
  }

  public void handleEnergyIndicator(HasEnergy hasEnergy) {
    System.out.println("... max energy: " + hasEnergy.maxEnergy() + ", current = " + hasEnergy.currentEnergy());
  }

}
