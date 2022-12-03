package com.mycompany.ejercicio3_fd;

import static com.mycompany.ejercicio3_fd.Main.printList;
import static com.mycompany.ejercicio3_fd.Main.push;
import static com.mycompany.ejercicio3_fd.Main.reverse;
import java.util.Arrays;


public class Ejercicio3_fd {

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
