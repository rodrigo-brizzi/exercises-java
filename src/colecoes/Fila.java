package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args){
        Queue<String> fila = new LinkedList<>();


        // Offer e Add -> adiciona elementos na fila

        //Diferença é o comportamento que ocorre quando a fila está cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Ana"); //
        fila.offer("Bia");
        fila.add("Ana");
        fila.offer("Bia");

        //Peek e Element -> Obter o proximo elemento da vila (sem remover)

        // Diferença é o comportamento que ocorre quando a fila está vazia
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // Lança uma exceção

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        // Poll e Remove -> obter o proximo elemento da fila e remove!

        // Diferença é o comportamento que ocorre quando a fila está vazia
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.remove()); //Lança uma exceção

    }

}
