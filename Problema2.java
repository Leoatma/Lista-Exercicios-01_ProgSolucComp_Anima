/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade2
 * Descrição: Faça um programa que peça um número e então mostre a mensagem "o número informado foi [numero]".
 * Data: 05/04/2023
 */

// Importando a ferramenta Scanner
import java.util.Scanner;

public class Problema2 {
  public static void main(String[] args) {

    // Definindo variáveis
    Scanner insertNumber = new Scanner(System.in); // criando scanner
    int userNumber;

    // Solicitando número ao usuario e registrando em uma variável
    System.out.println("Por favor, informe um número inteiro: ");
    userNumber = insertNumber.nextInt();

    insertNumber.close();

    // Devolvendo o valor ao usuário
    System.out.println("O número informado foi " + userNumber);

  }
}