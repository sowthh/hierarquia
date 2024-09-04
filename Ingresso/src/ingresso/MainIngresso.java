/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MainIngresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para ingresso normal e 2 para VIP:");
        int tipoIngresso = scanner.nextInt();
        Ingresso ingresso = null;

        if (tipoIngresso == 1) {
            ingresso = new Ingresso(100.0); // Exemplo de valor para ingresso normal
            System.out.println("Tipo de ingresso: " + ingresso.tipoIngresso());
        } else if (tipoIngresso == 2) {
            ingresso = new VIP(200.0); // Exemplo de valor inicial para VIP
            System.out.println("Digite 1 para camarote superior e 2 para camarote inferior:");
            int tipoCamarote = scanner.nextInt();
            ((VIP) ingresso).setTipoCamarote(tipoCamarote);
            System.out.println("Tipo de ingresso: " + ((VIP) ingresso).tipoIngresso());
            System.out.println("Tipo de camarote: " + ((VIP) ingresso).getTipoCamarote());
        } else {
            System.out.println("Tipo de ingresso inválido.");
            return;
        }

        System.out.println("Valor do ingresso: R$ " + ingresso.getValor());
    }
}
