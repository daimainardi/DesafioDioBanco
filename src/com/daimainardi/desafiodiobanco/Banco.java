package com.daimainardi.desafiodiobanco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contaList = new ArrayList<>();

    public List<Conta> ordenaListaContas() {
        if (!contaList.isEmpty()) {
            List<Conta> listaContasOrdenada = new ArrayList<>(contaList);
            listaContasOrdenada.sort(Comparator.comparing(c -> c.getCliente().getNome()));
            return listaContasOrdenada;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
}
