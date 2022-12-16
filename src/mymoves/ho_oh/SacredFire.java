package mymoves.ho_oh;


import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SacredFire extends PhysicalMove {

    public SacredFire(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(Math.random() < 0.5){
            Effect.burn(p);
        }

//        if(Program.chance(0.5)) {
//            Effect.burn(p);
//        }
    }

    @Override
    protected String describe() {
        // class.pokemon.SampleMove
        String[] words = this.getClass().toString().split("\\."); // вычленяем название
        return "Использует " + words[words.length - 1];
    }
}
