/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        AssistenteAdministrativo assistente = new AssistenteAdministrativo(1, "João");
        Tecnico tecnico = new Tecnico(2, "Maria");

        System.out.println("Assistente Administrativo:");
        System.out.println("Matrícula: " + assistente.getMatricula());
        System.out.println("Nome: " + assistente.getNome());

        System.out.println("\nTécnico:");
        System.out.println("Matrícula: " + tecnico.getMatricula());
        System.out.println("Nome: " + tecnico.getNome());
    }
}