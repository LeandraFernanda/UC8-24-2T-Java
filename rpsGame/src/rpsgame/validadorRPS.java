/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpsgame;

/**
 *
 * @author LEANDRAFERNANDAVIEIR
 */
public class validadorRPS {
        public boolean validadorRPS(int guess, int numberToRPS) {
        if (guess > numberToRPS){
            System.out.println("Seu Palpite está errado!");
            return false;
        }
        else{
            return true; // Palpite correto
        }
        
    }
}
    

