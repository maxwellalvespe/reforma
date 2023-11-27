package com.authsecurity.retorma.domain.usecases;

import com.authsecurity.retorma.domain.model.Comodo;

import java.util.List;

public class CalcularAreaUseCase {

    public static double calc(List<Comodo> comodos) {

        return comodos.stream().map(e -> e.obterAreaTotal(e)).reduce(Double::sum).orElseThrow();
    }
}
