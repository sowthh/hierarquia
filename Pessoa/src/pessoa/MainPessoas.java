/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoa;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MainPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o status (1 - Rica, 2 - Pobre, 3 - Miserável):");
        int escolha = scanner.nextInt();
        Pessoa pessoa = null;

        switch (escolha) {
            case 1:
                pessoa = new Rica();
                break;
            case 2:
                pessoa = new Pobre();
                break;
            case 3:
                pessoa = new Miseravel();
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        pessoa.descreverStatus();
    }
}