/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade3_e_4
 * Descrição: Faça um Programa que peça para o usuário digitar 4 notas de avaliação bimestrais e mostre a soma total das notas e a sua média.
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Problema3_e_4 {
  public static void main(String[] args) {

    // Definindo variáveis e Scanner
    float nota1, nota2, nota3, nota4;
    float notasSoma, notasMedia;
    Scanner teclado = new Scanner(System.in);

    // Perguntando as notas e registrando-as
    System.out.println("Olá, por favor digite a primeira nota bimestral: ");
    nota1 = teclado.nextFloat();

    System.out.println("Olá, por favor digite a segunda nota bimestral: ");
    nota2 = teclado.nextFloat();

    System.out.println("Olá, por favor digite a terceira nota bimestral: ");
    nota3 = teclado.nextFloat();

    System.out.println("Olá, por favor digite a quarta nota bimestral: ");
    nota4 = teclado.nextFloat();

    teclado.close();

    // Calculando soma e média das notas
    notasSoma = nota1 + nota2 + nota3 + nota4;

    notasMedia = notasSoma / 4;

    // Devolvendo os resultados
    System.out.println("A soma das notas é " + notasSoma + ", e a média corresponde a " + notasMedia);
  }

}
