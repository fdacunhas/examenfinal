package com.mycompany.ejercicio2_fd;

import static com.mycompany.ejercicio2_fd.Main.contarNodes;
import static com.mycompany.ejercicio2_fd.Main.push;

public class Ejercicio2_fd {

    public static void main(String[] args) {
    Node head = null;
    head = push(head, 14);
    head = push(head, 28);
    head = push(head, 3);
    head = push(head, 32);
 
    System.out.printf("%d", contarNodes(head));
    }
}