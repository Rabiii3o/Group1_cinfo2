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
    /**
     *
     * @param number
     * @return
     */
    

public class Group1_2info2 {

    /**
     * @param args the command line arguments
     */

     public static int Somme(int a, int b){
        return a+b;}
      
    
     public static int pgcd(int a, int b) {
      while (b != 0) {
        int temp = a;
        a = b;
        b = temp % b;
      }
      return 2*a;
    }

 public static int Factoriel(int n){
      if(n==0){
          return 1;
      }
      return n*Factoriel(n-1);
  }
    
  public static boolean estPair(int nombre) {
    return nombre % 2 == 0;
  }
public static int paire(int a){
    if ((a/2)==0) 
    return a;
    else return -1;
   
    
}
public static int calculateSquare(int number) {
    if (number < 0) {
        
        throw new IllegalArgumentException("Impossible de calculer la racine carrée d'un nombre négatif.");
    }
    return (int) Math.sqrt(number);
}
public static int puissance (int a, int b ){
    int p=1; 
    if (b>=1){
        for (int i=1; i<=b; i++) {
            p = p*a;
        }
    }
    return p;
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
        System.out.println(Somme(2,7));
        System.out.println(paire(2));
        System.out.println("ahmed code");

}
 

  

    

}
