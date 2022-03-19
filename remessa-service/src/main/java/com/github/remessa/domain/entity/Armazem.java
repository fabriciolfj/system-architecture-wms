package com.github.remessa.domain.entity;

import com.github.remessa.domain.command.ApartamentoCommand;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Stream.of;

@Slf4j
@ToString
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Armazem {

    @EqualsAndHashCode.Include
    private String code;
    private List<Predio> predios;

    public void setCode(String code) {
        this.code = code;
    }

    public List<Predio> getPredios() {
        return predios;
    }

    public void addPredios(Integer quantidade) {
        if(predios == null) {
            this.predios = new ArrayList<>();
        }

        while(quantidade > 0) {
            log.info("Adicionando predio {}", quantidade);
            predios.add(new Predio(this.code));
            quantidade--;
        }
    }

    public void addApartamentoPorPredio(final ApartamentoCommand command) {
        if (predios == null) {
            throw new RuntimeException("Predios não foram criados");
        }

        predios.stream().forEach(p -> p.addApartamento(command));
    }
}