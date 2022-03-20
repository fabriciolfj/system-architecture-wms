package com.github.remessa.business;

import com.github.remessa.domain.entity.Apartamento;

public interface FindApartamento {

    Apartamento findCode(final String code);
}
