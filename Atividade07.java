/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade7
 * Descrição: Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 * Data: 05/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Atividade07 {

  public static void main(String[] args) {

    int ladoQuadrado;

    Scanner input = new Scanner(System.in);

    System.out.println("Qual o valor do lado do quadrado? ");
    ladoQuadrado = input.nextInt();

    input.close(); // 'Fechando' Scanner

    double areaQuadrado = Math.pow(ladoQuadrado, 2); // elevando ladoQuadrado a 2 para calcular a area

    System.out.println("A area do quadrado é " + areaQuadrado + "cm² e o seu dobro é " + areaQuadrado * 2 + "cm²");

  }

}
