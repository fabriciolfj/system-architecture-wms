package com.github.remessa.domain.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Random;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Apartamento {

    private static final Random RANDOM = new Random();

    @EqualsAndHashCode.Include
    private String code;
    private Integer lastro;
    private Integer capacidade;

    public Apartamento(final String predio, final Integer altura, final Integer largura, final Integer tamanhoPalete) {
        this.code = predio + "-" + RANDOM.nextInt();
        this.capacidade = altura * largura;
        this.lastro = this.capacidade / tamanhoPalete;
    }

}
