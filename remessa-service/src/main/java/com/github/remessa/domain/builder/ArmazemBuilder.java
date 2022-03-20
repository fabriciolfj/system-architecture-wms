package com.github.remessa.domain.builder;

import com.github.remessa.domain.command.ApartamentoCommand;
import com.github.remessa.domain.entity.Armazem;

public class ArmazemBuilder {

    private Armazem armazem;

    public static ArmazemBuilder builder() {
        return new ArmazemBuilder();
    }

    public ArmazemBuilder() {
        this.armazem = new Armazem();
    }

    public ArmazemBuilder addCode(final String code) {
        this.armazem.setCode(code);
        return this;
    }

    public ArmazemBuilder addPredios(final Integer quantidade) {
        this.armazem.addPredios(quantidade);
        return this;
    }

    public ArmazemBuilder addApartamento(final ApartamentoCommand command) {
        this.armazem.addApartamentoPorPredio(command);
        return this;
    }

    public Armazem build() {
        return this.armazem;
    }
}
