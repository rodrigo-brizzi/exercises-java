package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        Ana mae = new Ana();

        // System.out.println(mae.segredo);
        // System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(mae.todosSabem);
    }
}
