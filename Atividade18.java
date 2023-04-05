/* 
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Nome do Programa: Pratica1_Atividade18
 * Descrição: 
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em
 * Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 * Data: 05/04/2023
 */

// 

import java.util.Scanner;

public class Atividade18 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    float fileSize;

    System.out.println("Qual o tamanho do arquivo em MB?");
    fileSize = input.nextFloat();

    System.out.println("Qual a velocidade do link na internet, em Mbps?");
    float velLinkMbps = input.nextFloat();

    input.close();

    float tempoSegundos = fileSize / velLinkMbps;
    float tempoMinutos = tempoSegundos / 60;

    System.out.printf("Para download deste arquivo de %f Mb, será preciso %f minutos.\n", fileSize, tempoMinutos);
  }
}
