
/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade6
 * Descrição: Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * Data: 05/04/2023
 */

import java.lang.Math;
import java.util.Scanner;

public class Atividade06 {

  public static void main(String[] args) {

    double areaCirculo;
    float raio;

    Scanner input = new Scanner(System.in);

    System.out.println("Por favor, informe o valor do raio da circunferência, em centimentros: ");
    raio = input.nextInt();

    input.close();

    // calculando a area através da biblioteca Math, com Pi e exponenciaçao (.pow)

    areaCirculo = Math.PI * Math.pow(raio, 2); // raio elevado a 2

    System.out.println("A area do círculo equivale a " + areaCirculo + "cm.");

  }

}
