package com.github.armazem.business.usecase;

import com.github.armazem.business.FindApartamento;
import com.github.armazem.business.validation.ValidacaoApartamento;
import com.github.armazem.domain.entity.Palete;
import lombok.RequiredArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
@RequiredArgsConstructor
public class CreatePalateUseCase {

    public final List<ValidacaoApartamento> validacoes;
    private final FindApartamento findApartamento;

    public void execute(final Palete palete, final String code) {
        var apartamento = findApartamento.findCode(code);

        validacoes.forEach(e -> e.execute(palete, apartamento));
        apartamento.addPalete(palete);
    }
}
