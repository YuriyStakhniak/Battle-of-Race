import hero.Archer;
import hero.Mage;
import hero.Warrior;
import team.Impl.ElfTeam;

public class BattlePreparing {

    public static void createElfTeam(ElfTeam elfTeam){

        Mage mage = elfTeam.createMage();
        Warrior warrior = elfTeam.createWarrior();
        Archer archer = elfTeam.createArcher();
    }

}
