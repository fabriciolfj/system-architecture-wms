package com.github.armazem.domain.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApartamentoCommand {

    private Integer largura;
    private Integer altura;
    private Integer tamanhoPalete;
    private Integer quantidade;
}
