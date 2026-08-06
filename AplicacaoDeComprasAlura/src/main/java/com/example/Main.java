package com.example;

import com.example.entity.Cartao;
import com.example.entity.Compra;
import com.example.entity.Menu;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cartao cartaoDeCretido = new Cartao();
        System.out.println("Digite o limite do cartão: ");
        cartaoDeCretido.setLimite(sc.nextDouble());
        sc.nextLine();

        Compra compra = new Compra();
        System.out.println("Nome da compra: ");
        compra.setNome(sc.nextLine());
        sc.nextLine();
        System.out.println("Valor da compra: ");
        compra.setValor(sc.nextDouble());
        compra.realizarCompra(cartaoDeCretido);
        System.out.println("Novo Limite: " + cartaoDeCretido.getLimite());

        Menu menuInicial = new Menu();
        menuInicial.exibirMenu(1);

        List<Compra> extratoCompras = new LinkedList<>();
        extratoCompras.add(compra);
        System.out.println(extratoCompras);


    }
}