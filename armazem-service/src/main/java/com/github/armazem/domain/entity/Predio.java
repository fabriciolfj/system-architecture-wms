package com.github.armazem.domain.entity;

import com.github.armazem.domain.command.ApartamentoCommand;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Slf4j
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Predio {

    private static final Random RANDOM = new Random();

    @EqualsAndHashCode.Include
    private String code;
    private List<Apartamento> apartamentos;

    public Predio(final String armazem) {
        this.code = armazem + "-" + RANDOM.nextInt(100);
    }

    public List<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void addApartamento(final ApartamentoCommand command) {
        if (apartamentos == null) {
            this.apartamentos = new ArrayList<>();
        }

        var quantidade = command.getQuantidade();

        while(quantidade > 0) {
            log.info("Numero apartamento: {}", quantidade);
            this.apartamentos.add(new Apartamento(this.code, command.getAltura(), command.getLargura(), command.getTamanhoPalete()));
            quantidade--;
        }
    }
}
