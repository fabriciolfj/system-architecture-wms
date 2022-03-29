package com.github.armazem.domain;

import com.github.armazem.domain.command.ApartamentoCommand;
import com.github.armazem.domain.builder.ArmazemBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArmazemBuilderTest {

    @Test
    public void testCriacaoArmazemCom5Predios10Apartamentos() {
        var armazem = ArmazemBuilder.builder()
                .addCode("1b")
                .addPredios(5)
                .addApartamento(ApartamentoCommand.builder()
                        .quantidade(10)
                        .altura(56)
                        .largura(78)
                        .tamanhoPalete(10)
                        .build())
                .build();

        assertNotNull(armazem.getCode());
        assertNotNull(armazem);
        assertTrue(armazem.getPredios().size() == 5);

        var predios = armazem.getPredios();

        predios.forEach(p -> assertTrue(p.getApartamentos().size() == 10));;
    }
}
