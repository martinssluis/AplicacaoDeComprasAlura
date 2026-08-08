package com.example.entity;

public class Compra implements Comparable<Compra>{
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
        return "Compra - Descricao: "+ this.getDescricao() + " no valor de R$"+this.valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return outraCompra.getValor().compareTo(this.getValor());
    }
}
