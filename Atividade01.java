/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade1
 * Descrição: Faça um Programa que pergunte ao usuário o seu nome e, em seguida, mostre o nome do usuário na tela.
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Atividade01 {
  public static void main(String[] args) {

    Scanner nameInput = new Scanner(System.in); // instanciando o Scanner
    String usrName; // Definindo a variável a receber o nome

    System.out.println("Informe o seu nome: "); // perguntando nome ao usuário
    usrName = nameInput.nextLine(); // registrando o nome na variável

    nameInput.close();

    // Acolhendo o usuário chamando-o pelo nome
    System.out.println("Bem vindo " + usrName + "!");
  }
}
