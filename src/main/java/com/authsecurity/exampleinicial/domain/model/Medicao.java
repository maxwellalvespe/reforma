package com.authsecurity.exampleinicial.domain.model;

public interface Medicao {

    default double getArea(Comodo x) {
        return x.getComprimento() * x.getLargura();
    }

    default double getAreaSuperior(Comodo x) {
        return (x.getComprimento() * x.getLargura()) * x.getAltura();
    }
}
