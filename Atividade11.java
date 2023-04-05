/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade11
 * Descrição: Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
 *    - o produto do dobro do primeiro com metade do segundo .
 *    - a soma do triplo do primeiro com o terceiro.
 *    - o terceiro elevado ao cubo. 
 * Data: 05/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Atividade11 {

  public static void main(String[] args) {

    int numero_1, numero_2;
    float numero_3;

    Scanner input = new Scanner(System.in);

    System.out.println("Qual o primeiro numero inteiro? ");
    numero_1 = input.nextInt();

    System.out.println("Agora informe o segundo inteiro: ");
    numero_2 = input.nextInt();

    System.out.println("Informe agora o terceiro numero, que deverá ser um numero real: ");
    numero_3 = input.nextFloat();

    input.close();

    float operacao01 = (2 * numero_1) * (numero_2 / 2);

    float operacao02 = (3 * numero_1) + numero_3;

    double operacao03 = Math.pow(numero_3, 3);

    System.out.println("O resultado das operações foram: \n Operação 01 = " + operacao01 + ". \n Operação 02 = "
        + operacao02 + ". \n Operação 03 = " + operacao03 + ".");

  }

}
