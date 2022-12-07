package streams;

public class Carro {
    String marca;
    int qtdePorta;
    boolean direcaoHidraulica;

    public Carro(String marca, int qtdePorta, boolean direcaoHidraulica){
        this.marca = marca;
        this.qtdePorta = qtdePorta;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public String toString(){
        return marca;
    }
}
