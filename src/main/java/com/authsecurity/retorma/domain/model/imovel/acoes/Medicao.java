package com.authsecurity.retorma.domain.model.imovel.acoes;

import com.authsecurity.retorma.domain.model.Comodo;

public interface Medicao {

    default double obterAreaTotal(Comodo x) {
        return x.getComprimento() * x.getLargura();
    }

    default double obterAreaSuperior(Comodo x) {
        return (x.getComprimento() * x.getLargura()) * x.getAltura();
    }
}
