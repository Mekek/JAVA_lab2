package mymoves.ho_oh;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Math.random() < 0.1){
            Effect.burn(p);
        }
    }


    @Override
    protected String describe() {
        // class.pokemon.SampleMove
        String[] words = this.getClass().toString().split("\\."); // вычленяем название
        return "Использует " + words[words.length - 1];
    }
}
