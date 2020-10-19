/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsoalno6;

import java.util.Scanner;

/**
 *
 * @author ninda try alviani 
 */
public class TestSoalNo6 {

    /**
     * @param args the command line arguments
     */
    
    public static int fungsiMembalik(int param){
        int tamWhile=param;
        int a=1;
        int jumlah = 0;
        String balik = "";
        while(a<param){
            a=a*10;
            
        }
        
        int b=1;
        while (b<a) {
            int z =tamWhile%10;
            balik += String.valueOf(z);
            tamWhile = tamWhile/10;
            b=b*10;
        }
        return Integer.parseInt(balik);
    }
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Silahkan Inputkan Angka : ");
        int input = scan.nextInt();
        System.out.println("HASIL BALIK = "+ fungsiMembalik(input));
        
    }
    
}
