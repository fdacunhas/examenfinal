/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios3;

class Main
{
    // Función auxiliar para imprimir una lista enlazada dada
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + ", ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
 
    // Función auxiliar para insertar un nuevo nodo al principio de la lista enlazada
    public static Node push(Node head, int data)
    {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
 
    // Función recursivo para invertir una lista enlazada dada. Invierte el
    // lista enlazada dada fijando el puntero principal y luego `.next`
    // punteros de cada nodo en orden inverso
    public static Node reverse(Node curr, Node prev, Node head)
    {
        // caso base: final de la lista alcanzado
        if (curr == null)
        {
            // fija el puntero de la cabeza
            head = prev;
            return head;
        }
 
        // recurre al siguiente nodo y pasa el nodo actual como un nodo anterior
        head = reverse(curr.next, curr, head);
 
        // arregla el nodo actual (los nodos que le siguen ya están arreglados)
        curr.next = prev;
 
        return head;
    }
 
    // La función para invertir una lista enlazada dada que toma un
    // referencia al nodo principal
    public static Node reverse(Node head) {
        return reverse (head, null, head);
    }
}
