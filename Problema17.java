/* 
 * Nome do Aluno: Leandro S. de Aguiar
 * RA: 1272319129
 * Nome do Programa: Nome do Programa: Pratica1_Atividade17
 * Descrição: 
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18
 * litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
 *    comprar apenas latas de 18 litros;
 *    comprar apenas galões de 3,6 litros;
 *    misturar latas e galões, de forma que o desperdício de tinta seja menor. 
 * Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 * Data: 05/04/2023
 */

import java.util.Scanner;
import java.lang.Math;

public class Problema17 {

  public static void main(String[] args) {

    float area;
    double qtdeLitros;
    double valorTLatas;
    double valorTGaloes;

    Scanner inputValue = new Scanner(System.in);

    System.out.println("Olá, bem vindo a loja de tintas!"); // msg de boas-vindas

    // Perguntando e registrando valor de área em m²
    System.out.println("Qual é o tamanho da área a ser pintada? (em m²)");
    area = inputValue.nextFloat();

    inputValue.close();

    // Calculando qtdade de litros de tinta necessários conforme cobertura (1L/6m²)
    // e adicionando 10%
    qtdeLitros = area / 6 * 1.1;

    // Calculando e arredondando para um inteiro acima, a qtdade de latas de tinta
    // necessários
    double qtdadeLatasTinta = Math.ceil(qtdeLitros / 18);

    // Calculando e arredondando para um inteiro acima, a qtdade de galões de tinta
    // necessários
    double qtdadeGaloes = Math.ceil(qtdeLitros / 3.6);

    float valorLataTinta = 80;
    float valorGalao = 25;

    valorTLatas = qtdadeLatasTinta * valorLataTinta;
    valorTGaloes = qtdadeGaloes * valorGalao;

    System.out.println("A quantidade de latas de tinta necessárias seria de " + qtdadeLatasTinta
        + " latas, com o valor final de R$" + valorTLatas + ".\n");
    System.out.println("A quantidade de Galões de tinta seria de " + qtdadeGaloes + " galões, com o custo final de R$"
        + valorTGaloes + ".\n");

    // Calculando qual melhor alternativa, com 10% de folga e menor desperdício

    double latasMistura = Math.floor(qtdeLitros / 18); // calculando a qtdade latas sem excedente, arredondando para
                                                       // baixo

    double galoesMistura = Math.floor((qtdeLitros - latasMistura * 18) / 3.6);// calc qtdade de galoes a partir do
                                                                              // excedente das latas

    double valTotalMistura;

    // verificando se ainda haverá excedente após o calc dos galoes, se sim
    // adicionar +1 pra n faltar tinta
    // e calculando o preço total a partir da mistura entre latas e galoes
    if (((qtdeLitros - (latasMistura * 18) % 3.6) != 0)) {
      galoesMistura += 1;
      valTotalMistura = (latasMistura * 80) + (galoesMistura * 25);

      System.out.println("Procurando economizar, e misturando entre galoes e latas, você poderia comprar " +
          latasMistura + " latas e " + galoesMistura + " galoes de tinta," +
          " o que daria o custo total de " + valTotalMistura + " reais.");
    }

  }
}
