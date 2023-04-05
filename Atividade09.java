/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade9
 * Descrição: Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. 
 * C = 5 * ((F-32) / 9).
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade09 {
  public static void main(String[] args) {

    // Variáveis e scanner
    float tempFahrenheit, tempCelsius;
    Scanner inputValue = new Scanner(System.in);

    // Recolhendo temperatura em F
    System.out.println("Informe a temperatura em graus Fahrenheit: ");
    tempFahrenheit = inputValue.nextFloat();

    inputValue.close();

    // Convertendo temp para Celsius
    tempCelsius = 5 * ((tempFahrenheit - 32) / 9);

    // Devolvendo valor
    System.out.println("A temperatura é " + tempCelsius + "ºC");

  }

}
