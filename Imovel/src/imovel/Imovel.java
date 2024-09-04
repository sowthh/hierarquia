/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imovel;

/**
 *
 * @author Admin
 */
public class Imovel {
    private double valor;

    public Imovel(double valor) {
        this.valor = valor;
    }

    public double calcularValorFinal(boolean novo) {
        if (novo) {
            return valor;
        } else {
            return valor * 0.7; // Exemplo: valor de imóvel velho é 70% do valor original
        }
    }
}
