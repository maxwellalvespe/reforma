package com.authsecurity.retorma.domain.usecases;

import com.authsecurity.retorma.domain.model.Comodo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MedirComodoUseCase {

    public static Logger log = LoggerFactory.getLogger(MedirComodoUseCase.class);

    public static void main(String[] args) {
        Comodo quartoGabriel = new Comodo(1.995, 2.83, 2.17);
        Comodo quartoSophia = new Comodo(1.995, 2.83, 2.17);
        Comodo cozinha = new Comodo(3d, 2.80, 2.17);
        Comodo quartoCasal = new Comodo(3.3, 4d, 2.17);
        Comodo swith = new Comodo(1.34, 1.67, 2.17);
        Comodo banheiro2 = new Comodo(1.34, 1.63, 2.17);
        Comodo sala = new Comodo(3d, 2.74, 2.17);

        log.info("Area construida : {}", CalcularAreaUseCase.calc(Arrays.asList(quartoCasal, quartoGabriel, quartoSophia, cozinha, swith, banheiro2, sala)));

    }
}
