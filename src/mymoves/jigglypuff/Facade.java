package mymoves.jigglypuff;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        super.applyOppDamage(p, damage);
        super.applyOppDamage(p, damage);
    }

    @Override
    protected String describe() {
        // class.pokemon.SampleMove
        String[] words = this.getClass().toString().split("\\."); // вычленяем название
        return "Использует " + words[words.length - 1];
    }
}
