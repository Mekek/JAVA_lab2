package mypokemons;

import mymoves.wigglytuff.Facade;
import mymoves.wigglytuff.HyperVoice;
import mymoves.wigglytuff.Psychic;
import mymoves.wigglytuff.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wigglytuff extends Pokemon {
    public Wigglytuff(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(140, 70, 45, 85, 50, 45);

        Psychic psychic = new Psychic(90, 100);
        Facade facade = new Facade(70, 100);
        HyperVoice hyperVoice = new HyperVoice(90, 100);
        Thunder thunder = new Thunder(110, 70);

        super.setMove(psychic, facade, hyperVoice, thunder);
    }
}
