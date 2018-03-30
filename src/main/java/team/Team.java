package team;

import hero.Archer;
import hero.Mage;
import hero.Warrior;

public abstract class Team {

    public abstract Mage createMage();

    public abstract Archer createArcher();

    public abstract Warrior createWarrior();



}
