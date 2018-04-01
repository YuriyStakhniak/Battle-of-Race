package race;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Race {

    @Getter
   private int damage;
    @Getter
   private int health;


}
