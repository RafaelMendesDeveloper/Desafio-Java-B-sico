package org.example;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        while (true) {

            System.out.println("\n1. Depositar \n2.Sacar \n3.Consultar Saldo \n4.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("DEPÓSITO");
                    System.out.println("Digite o Valor a ser depositado: ");
                    int valor = scanner.nextFloat()
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
