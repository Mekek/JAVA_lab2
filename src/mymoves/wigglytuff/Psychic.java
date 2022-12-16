package mymoves.wigglytuff;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Math.random() < 0.1){
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        // class.pokemon.SampleMove
        String[] words = this.getClass().toString().split("\\."); // вычленяем название
        return "Использует " + words[words.length - 1];
    }
}
