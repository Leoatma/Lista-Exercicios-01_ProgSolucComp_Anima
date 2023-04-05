/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade10
 * Descrição: Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
 * C = 5 * ((F-32) / 9).
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade10 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    float tempCelsius;
    float tempFahrenheit;

    System.out.println("Informe a temperatura em Celsius: ");
    tempCelsius = input.nextFloat(); // capturando temperatura em Celsius

    input.close();

    tempFahrenheit = ((tempCelsius * 9) / 5) + 32;

    System.out.println(tempCelsius + "ºC equivale a " + tempFahrenheit + "ºF");

  }

}
