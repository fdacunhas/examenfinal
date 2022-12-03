package com.mycompany.ejercicio1fd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1fd {

    public static void main(String[] args) {
        File archivo = null;
        FileReader Fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("matriz.txt");
            Fr = new FileReader(archivo.toString());
            br = new BufferedReader(Fr);
            String linea;
            String delimiter = ",";

            String matriz[][] = new String[4][5];
            
            int numlinea=0;
            
            while (((linea = br.readLine()) != null)) {
                String a[]=linea.split(delimiter);
                for (int l = 0; l < a.length; l++) {
                    matriz[numlinea][l] = a[l];
                }
                numlinea++;
            }
             System.out.println("MATRIZ");
             System.out.println("------");
            for (String[] matriz1 : matriz) {
                for (String matriz11 : matriz1) {
                    System.out.print(matriz11 + " ");   
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
