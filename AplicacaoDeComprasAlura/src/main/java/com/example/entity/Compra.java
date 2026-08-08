package com.example.entity;

public class Compra {
    private String descricao;
    private Double valor;

    // sempre que informarmos descricao e valor, criaremos uma nova compra
    public Compra(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Compra : \n" +
        "Descricao: "+this.descricao + " no valor de R$"+this.valor;
    }
}
