package com.example.entity;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private Double limite;
    private List<Compra> compras;

    public Cartao(Double limite) {
        this.limite = limite;

        this.compras = new ArrayList<>(); //Necessário apenas em alguns casos
        // Construtor de reconstrução ou um factory method static (uso futuro, ex: ao carregar o cartão de um banco de dados).
        // Diferente do construtor acima, este remonta um cartão que já existia, com o limite
        // ATUAL (não o inicial) e as compras já feitas — por isso não deve chamar realizarCompra(),
        // senão o limite seria descontado de novo.
        // ainda estou com duvidas sobre isso
    }

    public Double getLimite() {
        return limite;
    }

    public void realizarCompra(Compra compra){
        if (compra.getValor() > this.limite){
            System.out.print("Saldo insuficiente!");
            exibirExtrato();
        }else {
            this.limite -= compra.getValor();
            this.compras.add(compra);
            System.out.println("Compra realizada com sucesso! " + compra.getDescricao() + " no valor de R$" + compra.getValor());
        }
    }

    public void exibirExtrato(){
        System.out.println("***********************************************");
        System.out.println("COMPRAS");
        this.compras.forEach(System.out::println);
        System.out.println("***********************************************");
        System.out.println("Limite Restante: "+ this.limite);
    }

    // tira setter para que apenas a propria classe altere o limite, com o setter, qualquer um poderia alterar o valor do limite
}
