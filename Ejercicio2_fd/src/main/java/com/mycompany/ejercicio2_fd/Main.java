package com.mycompany.ejercicio2_fd;

public class Main {
    public static Node push( Node head_ref, int data){
    Node ptr1 = new Node();
    Node temp = head_ref;
    ptr1.data = data;
    ptr1.next = head_ref;
 
    if (head_ref != null)
    {
        while (temp.next != head_ref)
            temp = temp.next;
        temp.next = ptr1;
    } else
        ptr1.next = ptr1;
 
    head_ref = ptr1;
    return head_ref;
}
 
static int contarNodes( Node head)
{
    Node temp = head;
    int result = 0;
    if (head != null)
    {
        do
        {
            temp = temp.next;
            result++;
        } while (temp != head);
}
 
    return result;
}
}
