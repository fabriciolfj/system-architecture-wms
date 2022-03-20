package com.github.remessa.business.validation.impl;

import com.github.remessa.business.validation.ValidacaoApartamento;
import com.github.remessa.domain.entity.Apartamento;
import com.github.remessa.domain.entity.Palete;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ValidacaoLastroApartamento implements ValidacaoApartamento {

    @Override
    public void execute(final Palete palete, final Apartamento apartamento) {
        if (palete.getTamanho() != apartamento.getLastro()) {
            throw new RuntimeException("Lastro do palete diferente do configurado no apartamento " + apartamento.getCode());
        }
    }
}
