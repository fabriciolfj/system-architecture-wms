package com.github.remessa.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Palete {

    private Integer tamanho;
    private String produto;
    private Integer quantidade;
}
