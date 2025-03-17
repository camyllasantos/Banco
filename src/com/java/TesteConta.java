package com.java;

public class TesteConta {

    public static void main(String[] args) {

//       A palavra "new" em Java gera um objeto em memoria

        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 350;
        contaCorrente.cliente.nome = "Java";

        contaPoupanca.numero = 500;
        contaPoupanca.saldo = 100;
        contaPoupanca.cliente.nome = "Leo";

        contaInvestimento.numero = 63;
        contaInvestimento.saldo = 2;
        contaInvestimento.cliente.nome = "Mila";

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);

    }

}
