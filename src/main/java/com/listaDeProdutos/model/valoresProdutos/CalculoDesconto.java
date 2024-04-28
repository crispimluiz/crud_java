package com.aula42.listaDeProdutos.model.valoresProdutos;

public class CalculoDesconto {
    public Double descontoProduto(Double valor, Double porcentagemDesconto){
        Double resultado = valor * (porcentagemDesconto / 100);
        return resultado;
    }

    public Double valorFinal (Double valor, Double valorDoDesconto){
        Double resultadoFinal = valor - valorDoDesconto;
        return resultadoFinal;
    }
}
