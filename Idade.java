package com.mycompany.idade;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        int Nascimento;
        int AnoAtual;
        int Idade;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nascimento: ");
        Nascimento = scanner.nextInt();
        
        System.out.println("Digite o ano atual: ");
        AnoAtual = scanner.nextInt();
        
        Idade = Nascimento - AnoAtual;
        if (Idade < 0){
            Idade = -Idade;
        }
        
        System.out.println("Sua idade: " + Idade);
    }
}
