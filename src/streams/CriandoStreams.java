package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args){

        Consumer<String> print = System.out::print; // Criando uma função lambda do tipu consumer que aponta para o metodo print
        Consumer<Integer> println = System.out::println;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = { "Python", "Lisp ", "Perl ", "Go\n" };

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outrasLinguagens = Arrays.asList( "C ", "PHP ", "Kotlin\n" );
        outrasLinguagens.stream().forEach(print);
        outrasLinguagens.parallelStream().forEach(print);

        //Stream.generate(() -> "a").forEach(print); //loop infinito;
        //Stream.iterate(0, n -> n + 1).forEach(println);

    }
}
