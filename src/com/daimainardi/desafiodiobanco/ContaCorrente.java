package com.daimainardi.desafiodiobanco;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, double saldo, Cliente cliente) {
        super(agencia, numero, saldo, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("###### Extrato Conta Corrente ######");
        super.imprimirDadosConta();
    }
}
