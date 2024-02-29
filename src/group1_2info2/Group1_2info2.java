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
        int numToCheck = 17; // Remplacez cela par le nombre que vous voulez vérifier
        if (isPrime(numToCheck)) {
            System.out.println(numToCheck + " est un nombre premier.");
        } else {
            System.out.println(numToCheck + " n'est pas un nombre premier.");
        }

        int numToCalculate = 25; 
        try {
            int result = calculateSquare(numToCalculate);
            System.out.println("La racine carrée de " + numToCalculate + " est : " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     *
     * @param number
     * @return
     */
    public static int calculateSquare(int number) {
        if (number < 0) {
            
            throw new IllegalArgumentException("Impossible de calculer la racine carrée d'un nombre négatif.");
        }
        return (int) Math.sqrt(number);
    }

    

}
