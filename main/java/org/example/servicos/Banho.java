package org.example.servicos;

import org.example.servicos.Servico;

public class Banho extends Servico {

    @Override
    public String descricao() {
        return "Banho no animal";
    }

    @Override
    public double preco() {
        return 30.0;  //Valor do banho
    }
}
