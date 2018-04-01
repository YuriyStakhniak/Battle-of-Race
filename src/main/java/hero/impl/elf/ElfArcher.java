package hero.impl.elf;

import hero.Archer;
import race.Elf;


public class ElfArcher extends Elf implements Archer {

    public ElfArcher(int damage, int health) {
        super(damage, health);
    }

    @Override
    public int shoot() {
        System.out.println("Elf archer shoot for 10 DP");
        return 10;
    }
}
