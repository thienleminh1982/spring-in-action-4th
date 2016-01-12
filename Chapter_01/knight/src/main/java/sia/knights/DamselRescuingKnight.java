package sia.knights;

/**
 * Bad design due to tightly coupling
 * @author lmthien
 *
 */
public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest(); // tightly coupling here!!!
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
