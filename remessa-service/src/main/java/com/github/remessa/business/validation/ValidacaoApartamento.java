package com.github.remessa.business.validation;

import com.github.remessa.domain.entity.Apartamento;
import com.github.remessa.domain.entity.Palete;

public interface ValidacaoApartamento {

    void execute(final Palete palete, final Apartamento apartamento);
}
