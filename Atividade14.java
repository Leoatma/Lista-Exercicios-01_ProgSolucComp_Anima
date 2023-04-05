/* 
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Nome do Programa: Pratica1_Atividade14
 * Descrição: 
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
 * (50   quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a
 * variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e
 * na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
 * 
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade14 {

  public static void main(String[] args) {

    float pesoMax = 50;
    float pesoDePeixes;

    // Capturando peso pescado pelo Pescador
    Scanner inputPeso = new Scanner(System.in);
    System.out.println("Favor informe o peso dos peixes:");
    pesoDePeixes = inputPeso.nextFloat();

    inputPeso.close();

    // Calculando kg excedentes
    float kiloExcedente = pesoDePeixes - pesoMax;

    float multa = 4 * kiloExcedente;

    System.out
        .println("A quantidade de peixes em excesso foi de " + kiloExcedente + "Kg " + "e a multa corresponde a R$"
            + multa + '.');
  }
}