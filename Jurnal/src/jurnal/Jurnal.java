/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;
/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan deret Fibonacci : ");
        int angka = scan.nextInt();
        long fibonacci[] = new long[angka];
        
        fibonacci[0]=1;
        fibonacci[1]=1;
        
        for (int i = 2; i < angka; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        for (int i = 0; i < angka; i++){
            System.out.print(fibonacci[i] + " ");
        }
    }
    
}
