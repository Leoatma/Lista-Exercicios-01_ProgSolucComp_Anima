/*
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Pratica1_Atividade12e13
 * Descrição: Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando * a seguinte fórmula:
 *      Para homens: (72.7*h) - 58
 *      Para mulheres: (62.1*h) - 44.7
 * Data: 05/04/2023
 */

import java.util.Scanner;

public class Problema12e13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sexo;
        double altura;
        double pesoIdeal;

        System.out.println("Qual o seu sexo? Digite: \n 'H' = Homem \n 'M' = Mulher");
        sexo = input.next();

        System.out.println("Informe a sua altura: ");
        altura = input.nextDouble();

        input.close();

        switch (sexo) {

            case "H":
                pesoIdeal = (72.7 * altura) - 58;
                System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
                break;

            case "M":
                pesoIdeal = (62.1 * altura) - 44.7;
                System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
                break;

            default:
                System.out.println("Erro, tente novamente.");
        }

        /*
         * Aqui uma outra forma de fazer, com if..else.
         *
         * double pesoIdealMulher = (62.1 * altura) - 44.7;
         * double pesoIdealHomem = (72.7 * altura) - 58;
         * 
         * if (sexo.equals("H")) {
         * pesoIdeal = pesoIdealHomem;
         * System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
         * } else if (sexo.equals("M")) {
         * pesoIdeal = pesoIdealMulher;
         * System.out.println("Seu peso ideal é " + pesoIdeal + "kg.");
         * } else {
         * System.out.println("Por favor, informe o sexo corretamente.");
         * }
         * 
         */
    }

}
