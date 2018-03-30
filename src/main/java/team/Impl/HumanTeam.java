package team.Impl;

import hero.Archer;
import hero.Mage;
import hero.Warrior;
import hero.impl.human.HumanArcher;
import hero.impl.human.HumanMage;
import hero.impl.human.HumanWarrior;
import team.Team;

/**
 * Created by yurezzz13 on 30.03.18.
 */
public class HumanTeam extends Team {
    public Mage createMage() {
        return new HumanMage();
    }

    public Archer createArcher() {
        return new HumanArcher();
    }

    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
