package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] main){

        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.36, 0.06);
        imprimirNome.accept(p1);

        Produto p2 = new Produto("Caneta1", 12.36, 0.06);
        Produto p3 = new Produto("Caneta2", 12.36, 0.06);
        Produto p4 = new Produto("Caneta3", 12.36, 0.06);
        Produto p5 = new Produto("Caneta4", 12.36, 0.06);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println); // -Method reference: Referencia para metodo
    }
}
