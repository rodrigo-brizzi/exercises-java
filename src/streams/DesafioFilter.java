package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Carro c1 = new Carro("Toyota", 4, false);
        Carro c2 = new Carro("Audi",2, true);
        Carro c3 = new Carro("Nissan",4, true);
        Carro c4 = new Carro("Toyota",2, false);
        Carro c5 = new Carro("Citroen",4, false);
        Carro c6 = new Carro("Toyota",4, false);

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);

        Predicate<Carro> direcao = c -> c.direcaoHidraulica;
        Predicate<Carro> qtdePortas = c -> c.qtdePorta == 2;

        Function<Carro, String> formataResposta =
                c -> "Marca encontrada: " + c.marca;

        //Pipeline de execução

        carros.stream()
                .filter(direcao)
                .filter(qtdePortas)
                .map(formataResposta)
                .forEach(System.out::println);


    }
}
