package team.Impl;

import hero.Archer;
import hero.Mage;
import hero.Warrior;
import hero.impl.elf.ElfArcher;
import hero.impl.elf.ElfMage;
import hero.impl.elf.ElfWarrior;
import team.Team;


public class ElfTeam extends Team {


    public Mage createMage() {
        return new ElfMage();
    }

    public Archer createArcher() {
        return new ElfArcher(8987, 4);}

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
