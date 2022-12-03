/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios3;

import static com.mycompany.ejercicios3.Main.printList;
import static com.mycompany.ejercicios3.Main.push;
import static com.mycompany.ejercicios3.Main.reverse;
import java.util.Arrays;


/**
 *
 * @author fabio
 */
public class Ejercicios3 {

    public static void main(String[] args){
        int[] numeros = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(numeros));
 
        Node head = null;
        for (int i = numeros.length - 1; i >=0; i--) {
            head = push(head, numeros[i]);
        }
 
        head = reverse(head);
        printList(head);
    }
}
