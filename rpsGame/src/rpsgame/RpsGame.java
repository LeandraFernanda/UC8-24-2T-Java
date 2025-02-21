/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpsgame;

/**
 *
 * @author LEANDRAFERNANDAVIEIR
 */
public class RpsGame {
    public static void main(String[] args) {
        int Usuario, computador;
        Scanner teclado = new Scanner(System.in);
        System.out.print("###RPSgame");
        System.out.println("Digite seu nome:");
        System.out.println("Digite pedra, ou papel ou tesoura:");
        System.out.println("");
        System.out.println("1.pedra");
        System.out.println("2.papel");
        System.out.println("3.tesoura");
        System.out.println("Escilha a opção desejada:");
        
        Usuario = teclado.nextInt();
        swicth(Usuario){
        case 1:
        System.out.println(" Usuario escolheu papel");
        break;
        case 2:
        System.out.println(" Usuario escolheu tesoura");
        break;
        case 3:
        System.out.println(" Usuario escolheu pedra");
        default;
        System.out.println("Opção invalida!");
    }
        teclado close();
    }
}
