package classe.desafio;

import classe.desafio.Comida;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        this.peso += comida.peso;
    }
}
