package com.authsecurity.retorma.domain.usecases;

import com.authsecurity.retorma.domain.model.Comodo;

import java.util.List;

public class Calcular {

    protected double areaTotal(List<Comodo> comodos) {
        return comodos.stream().map(e -> e.obterAreaTotal(e)).reduce(Double::sum).orElseThrow();
    }

    protected double areaSuperior(List<Comodo> comodos) {
        return comodos.stream().map(e -> e.obterAreaSuperior(e)).reduce(Double::sum).orElseThrow();
    }
}
