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


public static int puissance (int a, int b ){
    int p=1;
    
    if (b>=1){
    for (int i=1; i<=b; i++) {
        p = p*a;
    }
}
return p;
}
public static int paire (int a){
    if ((a/2)==0) return 1;
}



public static void main(String[] args) {
     

    system.out.println(paire(2));
}










}