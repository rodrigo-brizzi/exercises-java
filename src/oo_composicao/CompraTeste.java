package oo_composicao;

public class CompraTeste {

    public static void main(String[] args){

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.adicionarItem("Caneta", 20, 7.45);
        c1.adicionarItem(new Item("Borracha", 12, 3.45));
        c1.adicionarItem(new Item("Caderno", 12, 18.79));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValortotal());

        c1.itens.get(0).compra.itens.get(1).compra.obterValortotal();
    }

}
