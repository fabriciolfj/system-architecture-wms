package com.github.armazem.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Palete {

    private String code;
    private Integer tamanho;
    private String produto;
    private Integer quantidade;
}
