package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Cliente {
    public Cliente(String cpf, String nome, String dataNascimento) throws ParseException {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade(dataNascimento);
    }
    private String cpf;
    private String nome;
    private String dataNascimento;
    private int idade;

    public void show(){
        System.out.println(cpf + nome + dataNascimento + idade);
    }
    public int calcularIdade(String dataNascimento) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date nascimento = sdf.parse(dataNascimento);

            int anoNasc = nascimento.getYear();
            int anoAtual = Date.from(Instant.now()).getYear();
            int idade = anoAtual - anoNasc;

            if(idade>=18) return idade;
            else throw new RuntimeException("IDADE INVÁLIDA!");
    }
}
