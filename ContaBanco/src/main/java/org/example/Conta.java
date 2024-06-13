package org.example;

public abstract class Conta implements IConta{
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }
    protected int agencia;
    protected int numero;
    protected double saldo;

    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void sacar(double valor) {
        if(valor < saldo){
            saldo -= valor;
            System.out.println("SAQUE DE $" + valor + " REAIS REALIZADO!");
        }
        else throw new RuntimeException("SALDO INSUFICIENTE");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("DEPÓSITO DE $" + valor + " REAIS REALIZADO!");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("TRANSFERÊNCIA DE $" + valor + "REAIS REALIZADA PARA A CONTA " + contaDestino.agencia + getNumero());
    }
    protected void imprimirInfos(){
        System.out.println("AGENCIA: " + this.agencia);
        System.out.println("CONTA: " + this.numero);
        System.out.println("SALDO: " + this.saldo);
    }
}
