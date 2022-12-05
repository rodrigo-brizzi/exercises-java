package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args){


        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.97, 1);
        compra1.adicionarItem(new Produto("Notebook", 2800.96),1);

        Compra compra2 = new Compra();
        compra1.adicionarItem("Caderno", 5.50, 1);
        compra1.adicionarItem(new Produto("Impressora", 1800),1);

        Cliente cliente = new Cliente("Helena");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());


    }
}
