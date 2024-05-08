package org.example;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String agency;
        String name;
        float balance;

        System.out.println("Olá! Criando sua conta no Banco Santander DIO...");

        System.out.println("Digite o número da sua conta: ");
        number = Integer.parseInt(scanner.nextLine());

        if(number < 0 || number > 9999){
            System.out.println("NÚMERO INVÁLIDO, DEFININDO NÚMERO DA CONTA 0001");
            number = 1;
        }

        System.out.println("Digite o número da sua agência: ");
        agency = scanner.nextLine();

        if(!agency.contains("-")){
            agency = agency.concat("-0");
        }

        System.out.println("Digite o seu nome: ");
        name = scanner.nextLine();

        System.out.println("Digite o seu saldo: ");
        balance = scanner.nextFloat();

        if(balance < 0){
            System.out.println("SALDO INVÁLIDO! Redefinindo saldo para 0");
            balance = 0;
        }

        System.out.printf("%s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", name, agency, number, balance);
    }
}