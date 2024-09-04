/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imovel;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MainImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para imóvel novo e 2 para imóvel velho:");
        int tipoImovel = scanner.nextInt();
        boolean novo = (tipoImovel == 1);

        Imovel imovel = new Imovel(500000.0); // Exemplo de valor inicial do imóvel
        double valorFinal = imovel.calcularValorFinal(novo);

        System.out.println("Valor final do imóvel: R$ " + valorFinal);
    }
}