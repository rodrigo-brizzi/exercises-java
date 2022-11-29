package classe.desafio;

public class Jantar {
    public static void main(String[] args){
        Comida c1 = new Comida("Arroz", 28.6);
        Comida c2 = new Comida("Feijao", 12.9);
        Comida c3 = new Comida("Ovo", 5.4);

        Pessoa p1 = new Pessoa("jão", 65.6);
        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.println(p1.peso);

    }
}
