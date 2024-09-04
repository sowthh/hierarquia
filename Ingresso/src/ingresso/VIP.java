/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso;

/**
 *
 * @author Admin
 */
public class VIP extends Ingresso {
    private String tipoCamarote;

    public VIP(double valor) {
        super(valor);
    }

    @Override
    public String tipoIngresso() {
        return "VIP";
    }

    public void setTipoCamarote(int tipo) {
        if (tipo == 1) {
            tipoCamarote = "Camarote Superior";
            valor += 50.0; // Exemplo de incremento para VIP Camarote Superior
        } else if (tipo == 2) {
            tipoCamarote = "Camarote Inferior";
            valor += 30.0; // Exemplo de incremento para VIP Camarote Inferior
        } else {
            tipoCamarote = "Desconhecido";
        }
    }

    public String getTipoCamarote() {
        return tipoCamarote;
    }
}