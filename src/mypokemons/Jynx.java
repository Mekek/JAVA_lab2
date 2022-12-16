package mypokemons;


import mymoves.junx.Facade;
import mymoves.junx.HeartStamp;
import mymoves.junx.LovelyKiss;
import mymoves.junx.PowderSnow;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jynx extends Pokemon {
    public Jynx(String name, int level) {
        super(name, level);

        super.setType(Type.ICE, Type.PSYCHIC);
        super.setStats(65, 50, 35, 115, 95, 95);

        Facade facade = new Facade(70, 100);
        HeartStamp heartStamp = new HeartStamp(60, 100);
        PowderSnow powderSnow = new PowderSnow(40, 100);
        LovelyKiss lovelyKiss = new LovelyKiss(0, 75);

        super.setMove(facade, heartStamp, powderSnow, lovelyKiss);
    }
}
