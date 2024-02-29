/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group1_2info2;

/**
 *
 * @author Rabii
 */
public class Group1_2info2 {

    /**
     * @param args the command line arguments
     */
      
    
     public static int pgcd(int a, int b) {
      while (b != 0) {
        int temp = a;
        a = b;
        b = temp % b;
      }
      return a;
    }
    
  
    public static boolean estPair(int nombre) {
      return nombre % 2 == 0;
    }
    public static void main(String[] args) {
        // Appelez les fonctions puissance et pgcd ici
    
System.out.println("ahmed code");

     
    }
  
    
}
