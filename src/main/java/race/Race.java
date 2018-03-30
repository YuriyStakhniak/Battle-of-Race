package race;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Race {

    @Getter
    @Setter
   private int damage;
   private int health;


}
