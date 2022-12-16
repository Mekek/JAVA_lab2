package mypokemons;

import mymoves.jigglypuff.Facade;
import mymoves.jigglypuff.HyperVoice;
import mymoves.jigglypuff.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jigglypuff extends Pokemon {
    public Jigglypuff(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(115, 45, 20, 45, 25, 20);

        Psychic psychic = new Psychic(90, 100);
        Facade facade = new Facade(70, 100);
        HyperVoice hyperVoice = new HyperVoice(90, 100);

        super.setMove(psychic, facade, hyperVoice);
    }
}
