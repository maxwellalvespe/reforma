package com.authsecurity.exampleinicial.domain.usecases;

import com.authsecurity.exampleinicial.domain.model.Comodo;

public class MedirComodoUseCase {

    public static void main(String[] args) {
        Comodo quartoGabriel = new Comodo(1.995,2.83,2.17);
        Comodo quartoSophia = new Comodo(1.995,2.83,2.17);
        Comodo cozinha = new Comodo(3d,2.80,2.17);
        Comodo quartoCasal = new Comodo(3.3,4d,2.17);
        Comodo swith = new Comodo(1.34,1.67,2.17);
        Comodo banheiro2 = new Comodo(1.34,1.63,2.17);
        Comodo sala = new Comodo(3d,2.74,2.17);

        System.out.printf("Area construida : %f", calcAreaTotal(quartoCasal, quartoGabriel, quartoSophia, cozinha, swith, banheiro2,sala));


    }

    private static double calcAreaTotal(Comodo quartoCasal, Comodo quartoGabriel, Comodo quartoSophia, Comodo cozinha, Comodo swith, Comodo banheiro2,Comodo sala) {
        return quartoCasal.obterAreaTotal(quartoCasal) +
                quartoGabriel.obterAreaTotal(quartoGabriel) +
                quartoSophia.obterAreaTotal(quartoSophia) +
                cozinha.obterAreaTotal(cozinha) +
                swith.obterAreaTotal(swith) +
                banheiro2.obterAreaTotal(banheiro2) +
                sala.obterAreaTotal(sala);
    }
}
