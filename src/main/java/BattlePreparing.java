import hero.Archer;
import hero.Mage;
import hero.Warrior;
import team.Impl.ElfTeam;
import team.Impl.HumanTeam;
import team.Team;

public class BattlePreparing {

    public static void creatTeam(Team team){

        Mage mage = team.createMage();
        Warrior warrior = team.createWarrior();
        Archer archer = team.createArcher();
    }


    public static void startGame(ElfTeam elfTeam, HumanTeam humanTeam){

    }

}
