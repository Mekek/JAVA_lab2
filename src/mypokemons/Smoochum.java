package mypokemons;

import mymoves.smoochum.Facade;
import mymoves.smoochum.HeartStamp;
import mymoves.smoochum.PowderSnow;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Smoochum extends Pokemon {
    public Smoochum(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.PSYCHIC);
        super.setStats(45, 30, 15, 85, 65, 65);

        Facade facade = new Facade(70, 100);
        HeartStamp heartStamp = new HeartStamp(60, 100);
        PowderSnow powderSnow = new PowderSnow(40, 100);

        super.setMove(facade, heartStamp, powderSnow);
    }
}
