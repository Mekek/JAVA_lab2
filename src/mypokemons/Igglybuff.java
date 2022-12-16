package mypokemons;

import mymoves.Igglybuff.Facade;
import mymoves.Igglybuff.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(90, 30, 15, 40, 20, 15);

        Psychic psychic = new Psychic(90, 100);
        Facade facade = new Facade(70, 100);

        super.setMove(psychic, facade);
    }
}
