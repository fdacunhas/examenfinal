package com.mycompany.ejercicio3_fd;

/**
 *
 * @author fabio
 */
public class Main {
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
 
    public static Node push(Node head, int data)
    {
        Node node = new Node(data);
        node.next = head;
        return node;
    }
 
    public static Node reverse(Node curr, Node prev, Node head)
    {
        if (curr == null)
        {
            head = prev;
            return head;
        }
 
        head = reverse(curr.next, curr, head);
 
        curr.next = prev;
 
        return head;
    }
 
    public static Node reverse(Node head) {
        return reverse (head, null, head);
    }
}