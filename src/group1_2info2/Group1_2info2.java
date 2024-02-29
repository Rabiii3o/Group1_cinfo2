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



    public static int Somme(int a, int b){
        return a+b;
    }

 public static int Factoriel(int n){
      if(n==0){
          return 1;
      }
      return n*Factoriel(n-1);
  }
        public static void main(String[] args) {
            
        System.out.println(Somme(2,7));
    
    }
    
}
