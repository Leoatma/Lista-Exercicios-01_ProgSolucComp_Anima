/* 
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Nome do Programa: Pratica1_Atividade15
 * Descrição: 
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
 * total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5%
 * para o sindicato, faça um programa que nos dê:
 * salário bruto.
 * quanto pagou ao INSS.
 * quanto pagou ao sindicato.
 * o salário líquido.
 * calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * + Salário Bruto : R$
 * - IR (11%) : R$
 * - INSS (8%) : R$
 * - Sindicato ( 5%) : R$
 * = Salário Liquido : R$
 * 
 * Obs.: Salário Bruto - Descontos = Salário Líquido.
 * 
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade15 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double salarioPorHora;
    int horasTrabMes;

    System.out.println("Informe o quanto você recebe por hora trabalhada: ");
    salarioPorHora = input.nextDouble();

    System.out.println("Quantas horas foram trabalhadas este mês? ");
    horasTrabMes = input.nextInt();

    input.close();

    double salarioBruto = salarioPorHora * horasTrabMes;

    double contribINSS = salarioBruto * 0.08;
    double contribIR = salarioBruto * 0.11;
    double contribSindicato = salarioBruto * 0.05;

    double salarioLiquido = salarioBruto - (contribINSS + contribIR + contribSindicato);

    System.out.println("Olá, segue sua contabilidade salarial mensal: \n" +
        "Salário Bruto: R$" + salarioBruto +
        ". \n\n Contribuição INSS: R$" + contribINSS +
        ". \n Contribuição IR: R$" + contribIR +
        ". \n Contribuição Sindicato: R$" + contribSindicato +
        ". \n\n Salário Líquido: R$" + salarioLiquido + ".");

  }
}
