package com.example.entity;

public class Compra {
    private String nome;
    private Double valor;

    public Compra() {}

    public Compra(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

   public void realizarCompra(Cartao cartao){
        if (this.valor > cartao.getLimite()){
            System.out.println("Saldo insuficiente!");
        }else {
            System.out.println("Compra realizada com sucesso! " + this.getNome() + " no valor de R$" + this.valor);
            cartao.setLimite(cartao.getLimite() - this.valor);
        }
   }

    @Override
    public String toString() {
        return "Nome: "+this.nome + " no valor de R$"+this.valor;
    }
}
