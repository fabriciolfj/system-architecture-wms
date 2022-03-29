package com.github.armazem.business.validation;

import com.github.armazem.domain.entity.Apartamento;
import com.github.armazem.domain.entity.Palete;

public interface ValidacaoApartamento {

    void execute(final Palete palete, final Apartamento apartamento);
}
