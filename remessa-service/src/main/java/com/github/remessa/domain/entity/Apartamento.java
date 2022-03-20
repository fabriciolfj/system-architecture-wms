package com.github.remessa.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Apartamento {

    private static final Random RANDOM = new Random();

    @EqualsAndHashCode.Include
    private String code;
    private Integer lastro;
    private Integer capacidade;
    private List<Palete> paletes;

    public Apartamento(final String predio, final Integer altura, final Integer largura, final Integer tamanhoPalete) {
        this.code = predio + "-" + RANDOM.nextInt();
        this.capacidade = altura * largura;
        this.lastro = this.capacidade / tamanhoPalete;
    }

    public Apartamento addPalete(final Palete palete) {
        if (Objects.isNull(paletes)) {
            this.paletes = new ArrayList<>();
        }

        paletes.add(palete);
        return this;
    }

    public Apartamento removePalete(final Palete palete) {
        this.paletes.remove(palete);
        return this;
    }
}
