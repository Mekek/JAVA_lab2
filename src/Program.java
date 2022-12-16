import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

    // https://pokemondb.net/pokedex/ho-oh
    // https://pokemondb.net/pokedex/smoochum
    // https://pokemondb.net/pokedex/jynx
    // https://pokemondb.net/pokedex/igglybuff
    // https://pokemondb.net/pokedex/jigglypuff
    // https://pokemondb.net/pokedex/wigglytuff

    public static void main(String[] args){
        Battle b = new Battle();
        Ho_Oh p1 = new Ho_Oh("Первый", 1);
        Smoochum p2 = new Smoochum("Второй", 1);
        Jynx p3 = new Jynx("Третий", 1);
        Igglybuff p4 = new Igglybuff("Четвёртый", 1);
        Jigglypuff p5 = new Jigglypuff("Пятый", 1);
        Wigglytuff p6 = new Wigglytuff("Шестой", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

//    public static boolean chance(double d) {
//        return d > Math.random();
//    }
}
