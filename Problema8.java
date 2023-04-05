/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade8
 * Descrição: Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Problema8 {
  public static void main(String[] args) {

    double salarioHoras;
    float horasTrabalhadas;
    double salarioTotal;

    Scanner input = new Scanner(System.in);

    // Solicitando o salario por hora trabalhada e registrando-o
    System.out.println("Por favor, informe o qual o seu salário por hora trabalhada: ");
    salarioHoras = input.nextDouble();

    // Solicitando horas trabalhadas
    System.out.println("Agora informe quantas horas você trabalhou este mês: ");
    horasTrabalhadas = input.nextFloat();

    input.close();

    // Calculando salario do mês
    salarioTotal = salarioHoras * horasTrabalhadas;

    // Informando o salario mensal
    System.out.println("Este mês o seu salário é R$" + salarioTotal);

  }
}
