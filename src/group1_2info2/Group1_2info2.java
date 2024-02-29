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
    public static void main(String[] args) {
        // Appelez les fonctions puissance et pgcd ici
    int nombre = 2;
    int exposant = 5;
    int resultatPuissance = puissance(nombre, exposant);
    System.out.println("Résultat de la puissance : " + resultatPuissance);

    int a = 12;
    int b = 18;
    int pgcdResultat = pgcd(a, b);
    System.out.println("Résultat du PGCD : " + pgcdResultat);
    int nombre1 = 10;
    int nombre2 = 17;

    if (estPair(nombre1)) {
      System.out.println(nombre1 + " est pair.");
    } else {
      System.out.println(nombre1 + " n'est pas pair.");
    }

    if (estPremier(nombre2)) {
      System.out.println(nombre2 + " est premier.");
    } else {
      System.out.println(nombre2 + " n'est pas premier.");
    }
    }
    public static int puissance(int nombre, int exposant) {
        if (exposant == 0) {
          return 1;
        } else {
          return nombre * puissance(nombre, exposant - 1);
        }
      }
    
      public static int pgcd(int a, int b) {
        while (b != 0) {
          int temp = a;
          a = b;
          b = temp % b;
        }
        return a;
      }
      public static boolean estPremier(int nombre) {
        if (nombre <= 1) {
          return false;
        }
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
          if (nombre % i == 0) {
            return false;
          }
        }
        return true;
      }
    
      public static boolean estPair(int nombre) {
        return nombre % 2 == 0;
      }
    
}
