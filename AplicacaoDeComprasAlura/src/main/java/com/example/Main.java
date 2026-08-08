package com.example;

import com.example.entity.Cartao;
import com.example.entity.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        Cartao cartaoDeCretido = new Cartao(limite);

        int opcao = 1;
        do{
            sc.nextLine(); // limpa o buffer que continha um \n no inicio
            System.out.print("Digite a descrição da compra: ");
            String descricaoCompra = sc.nextLine();
            System.out.print("Digite o valor da compra: ");
            double valorCompra = sc.nextDouble();
            Compra compra = new Compra(descricaoCompra, valorCompra);
            cartaoDeCretido.realizarCompra(compra);
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            opcao = sc.nextInt();
        }while(opcao!=0);
        if (opcao==0){
            cartaoDeCretido.exibirExtrato();
        }
        sc.close();
    }
}