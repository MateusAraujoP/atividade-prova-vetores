/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Atividade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menorValor, maiorValor;
        System.out.println(" Exercicio 1:");
        int[] valor = new int[5];
        System.out.println("Entre o valor 1:");
        valor[0] = sc.nextInt();
        maiorValor = valor[0];
        menorValor = valor[0];
        
        System.out.println("Entre o valor 2:");
        valor[1] = sc.nextInt();
        if (valor[1] > maiorValor) {
            maiorValor = valor[0];
        } else if (valor[1] < menorValor) {
            menorValor = valor[0];
        }
        
        System.out.println("Entre o valor 3:");
        valor[2] = sc.nextInt();
        if (valor[1] > maiorValor) {
            maiorValor = valor[1];
        } else if (valor[1] < menorValor) {
            menorValor = valor[1];
        }
        
        System.out.println("Entre o valor 4:");
        valor[3] = sc.nextInt();
        if (valor[1] > maiorValor) {
            maiorValor = valor[2];
        } else if (valor[1] < menorValor) {
            menorValor = valor[2];
        }
        
        System.out.println("Entre o valor 5:");
        valor[4] = sc.nextInt();
        if (valor[1] > maiorValor) {
            maiorValor = valor[3];
        } else if (valor[1] < menorValor) {
            menorValor = valor[3];
        }
        
        System.out.println("Maior valor: " + maiorValor + "\nMenor valor: " + menorValor);
        
        System.out.println(" Exercicio 2:");
        double[] salario = new double[26];
        double aumento = 0.015;
        salario[0] = 1000 * 1.015;
        for (int i = 1; i < 26; i++) {
            aumento = aumento * 2;
            salario[i] = salario[i - 1] * (1 + aumento);
        }
        System.out.println("Salário atual: " + salario[25]);
        
        System.out.println(" Exercicio 3:");
        
        System.out.println("Entre a massa inicial:");
        double massaInicial = sc.nextDouble();
        double massaAtual = massaInicial;
        int tempo = 0;
        while (massaAtual >= 0.5) {
            massaAtual = massaAtual / 2;
            tempo = tempo + 50;
        }
        int tamanho = tempo / 50;
        double[] massa = new double[tamanho];
        massa[0] = massaInicial;
        int i = 0;
        while (massa[i] >= 0.5) {
            massa[i] = massa[i] / 2;
            i++;
        }
        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massa[tamanho - 2]);
        System.out.println("Tempo em Horas: " + tempo / 3600);
        System.out.println("Tempo em Minutos: " + tempo / 60);
        System.out.println("Tempo em Segundos: " + tempo);
        
    }
}
