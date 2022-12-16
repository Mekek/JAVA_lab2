package mypokemons;

import mymoves.SampleMove;
import mymoves.ho_oh.FireBlast;
import mymoves.ho_oh.Flamethrower;
import mymoves.ho_oh.SacredFire;
import mymoves.ho_oh.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ho_Oh extends Pokemon {
    public Ho_Oh(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE, Type.FLYING);
        super.setStats(106, 130, 90, 110, 154, 90);

        SacredFire sacredFire = new SacredFire(100, 95);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        FireBlast fireBlast = new FireBlast(110, 85);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);

        super.setMove(sacredFire, flamethrower, fireBlast, thunderbolt);
    }
}
