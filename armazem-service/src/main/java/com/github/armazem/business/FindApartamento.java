package com.github.armazem.business;

import com.github.armazem.domain.entity.Apartamento;

public interface FindApartamento {

    Apartamento findCode(final String code);
}
