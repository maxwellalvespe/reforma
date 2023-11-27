package com.authsecurity.retorma.domain.usecases;

import com.authsecurity.retorma.domain.model.Comodo;
import com.authsecurity.retorma.domain.model.imovel.Banheiro;
import com.authsecurity.retorma.domain.model.imovel.Cozinha;
import com.authsecurity.retorma.domain.model.imovel.Quarto;
import com.authsecurity.retorma.domain.model.imovel.Sala;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class MedirComodoUseCase {

    public static final Logger log = LoggerFactory.getLogger(MedirComodoUseCase.class);

    public static void main(String[] args) {
        Comodo quartoGabriel = new Quarto(1.995, 2.83, 2.17);
        Comodo quartoSophia = new Quarto(1.995, 2.83, 2.17);
        Comodo cozinha = new Cozinha(3d, 2.80, 2.17);
        Comodo quartoCasal = new Quarto(3.3, 4d, 2.17);
        Comodo swith = new Banheiro(1.34, 1.67, 2.17);
        Comodo banheiro2 = new Banheiro(1.34, 1.63, 2.17);
        Comodo sala = new Sala(3d, 2.74, 2.17);

        log.info("Area construida : {}", new Calcular().areaTotal(Arrays.asList(quartoCasal, quartoGabriel, quartoSophia, cozinha, swith, banheiro2, sala)));
        log.info("Area superior : {}", new Calcular().areaSuperior(Arrays.asList(quartoCasal, quartoGabriel, quartoSophia, cozinha, swith, banheiro2, sala)));

    }
}
