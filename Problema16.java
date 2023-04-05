/* 
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Nome do Programa: Pratica1_Atividade16
 * Descrição: 
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
 * litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 * Data: 05/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Problema16 {

  public static void main(String[] args) {

    // Variáveis e instanciando Scanner
    float area;
    double qtdeLatasTinta;
    double valorTotal;

    Scanner inputValue = new Scanner(System.in);

    System.out.println("Olá, bem vindo a loja de tintas!"); // msg de boas-vindas

    // Perguntando e registrando valor de área em m²
    System.out.println("Qual é o tamanho da área a ser pintada em m²?");
    area = inputValue.nextFloat();

    inputValue.close();

    // Calculando qtdade de latas necessárias, com arredondamento do valor decimal
    // para cima.
    qtdeLatasTinta = Math.ceil(area / 54);

    // Calculando custo total
    valorTotal = qtdeLatasTinta * 80;

    // Informando quantidade de latas necessárias e valor total
    System.out.println("Para essa área você precisará de " + qtdeLatasTinta + " latas de tinta. Isto custará "
        + valorTotal + " reais.");

  }
}