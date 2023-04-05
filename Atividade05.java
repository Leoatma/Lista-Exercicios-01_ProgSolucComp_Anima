/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade5
 * Descrição: Faça um Programa que pergunte ao usuário um valor em metros e converta o valor digitado para centímetros.
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade05 {
  public static void main(String[] args) {

    // Definindo variáveis
    double valorMetros;
    double valorCentimetros;

    // Criando Scanner
    Scanner valorDigitado = new Scanner(System.in);

    // Solicitando valor em metros e registrando em variável
    System.out.println("Por favor, informe um número em metros");
    valorMetros = valorDigitado.nextDouble();

    valorDigitado.close();

    // Convertendo o valor para centímetros
    valorCentimetros = valorMetros * 100;

    // Enviando mensagem ao usuário com o valor convertido
    System.out.println("Em centímetros o valor informado é: " + valorCentimetros);

  }
}
