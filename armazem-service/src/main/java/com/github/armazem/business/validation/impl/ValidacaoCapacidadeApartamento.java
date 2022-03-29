package com.github.armazem.business.validation.impl;

import com.github.armazem.business.validation.ValidacaoApartamento;
import com.github.armazem.domain.entity.Apartamento;
import com.github.armazem.domain.entity.Palete;

import javax.enterprise.context.ApplicationScoped;
import java.util.stream.Collectors;

@ApplicationScoped
public class ValidacaoCapacidadeApartamento implements ValidacaoApartamento {

    @Override
    public void execute(final Palete palete, final Apartamento apartamento) {
        var uso = apartamento.getPaletes().stream().collect(Collectors.summarizingInt(Palete::getTamanho)).getSum();
        uso += palete.getTamanho();

        if (uso > apartamento.getCapacidade()) {
            throw new RuntimeException("Apartamento " + apartamento.getCode() + " cheio: " + uso);
        }
    }
}
