/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testno7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ninda Try Alviani
 */
public class TestNo7 {

    /**
     * @param args the command line arguments
     */
    public static Scanner inputData = new Scanner(System.in);

    public static void main(String[] args) {

        //variabel
        int barisMatriksA, kolomMatriksA, barisMatriksB, kolomMatriksB;

        System.out.print("Masukkan Jumlah Baris Matriks A : ");
        barisMatriksA = inputData.nextInt();

        System.out.print("Masukkan Jumlah Kolom Matriks A : ");
        kolomMatriksA = inputData.nextInt();

        System.out.print("Masukkan Jumlah Baris Matriks B : ");
        barisMatriksB = inputData.nextInt();

        System.out.print("Masukkan Jumlah Kolom Matriks B : ");
        kolomMatriksB = inputData.nextInt();
        int hasil[][] = new int[barisMatriksA][kolomMatriksA];
        if (kolomMatriksA != barisMatriksB) {
            System.out.println("Tidak Memenuhi Syarat Perkalian Matriks");
        } else {

            hasil = hasilKaliMatriks(barisMatriksA, kolomMatriksA, barisMatriksB, kolomMatriksB);
            System.out.println("Hasil");
            for (int i = 0; i < barisMatriksA; i++) {
                for (int j = 0; j < kolomMatriksA; j++) {
                    System.out.print(hasil[i][j] + " ");
                }
                System.out.println("");
            }
        }

    }

    public static int[][] hasilKaliMatriks(int barisMatriksA, int kolomMatriksA, int barisMatriksB, int kolomMatriksB) {
        int matriksA[][] = new int[barisMatriksA][kolomMatriksA];
        int matriksB[][] = new int[barisMatriksB][kolomMatriksB];
        int hasil[][] = new int[barisMatriksA][kolomMatriksA];
        System.out.println("Matriks A");
        for (int i = 0; i < barisMatriksA; i++) {
            for (int j = 0; j < kolomMatriksA; j++) {
                System.out.print("Matriks A baris - " + (i + 1) + " Kolom - " + (j + 1) + " : ");
                matriksA[i][j] = inputData.nextInt();
            }
        }

        for (int i = 0; i <= barisMatriksA - 1; i++) {
            for (int j = 0; j <= kolomMatriksA - 1; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriks B");
        for (int i = 0; i < barisMatriksB; i++) {
            for (int j = 0; j < kolomMatriksB; j++) {
                System.out.print("Matriks B baris - " + (i + 1) + " Kolom - " + (j + 1) + " : ");
                matriksB[i][j] = inputData.nextInt();
            }
        }

        for (int i = 0; i <= barisMatriksB - 1; i++) {
            for (int j = 0; j <= kolomMatriksB - 1; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < barisMatriksA; i++) {
            for (int j = 0; j < kolomMatriksA; j++) {
                int hasils = 0;
                if (kolomMatriksB == kolomMatriksA) {
                    for (int z = 0; z < kolomMatriksB; z++) {
                        hasils += matriksA[i][z] * matriksB[z][j];

                    }
                } else {
                    for (int z = 0; z < kolomMatriksB; z++) {
                        hasils += matriksA[i][j] * matriksB[j][z];
                    }
                }
                hasil[i][j] = hasils;
            }
        }

        return hasil;
    }

}
