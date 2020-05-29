package com.company;

public class LinkedList {
    Node head;

    public void append(int data)
    {
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next!=null)
        {
            current = current.next;
        }
        current.next = new Node(data);
        return;
    }
    public void prepend(int data)
    {
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        else
        {
            Node current = new Node(data);
            current.next = head;
            head = current;
        }
    }
    public void deletebyData(int data)
    {
        if(head==null)
        {
            return;
        }
        else
        {
            Node current = head;
            while(current.next!=null)
            {
                if(current.next.data == data)
                {
                    if(current.next.next!=null)
                    {
                        current.next = current.next.next;
                        System.out.println("The data - "+data+ " was deleted from the list");
                        return;
                    }
                    else
                    {
                        current.next = null;
                        System.out.println("The data - "+data+ " was deleted from the list");
                        return;
                    }
                }
                current = current.next;
            }
        }
    }
    public void insertafterbyData(int predecessor, int data)
    {
        if(predecessor==0 && head==null)
        {
            Node current = new Node(data);
            return;
        }
        else{
            Node current = head;
            while(current.next!=null)
            {
                if(current.data == predecessor)
                {
                    Node insertnode = new Node(data);
                    insertnode.next = current.next;
                    current.next = insertnode;
                    System.out.println("Data : "+data+" was inserted between "+predecessor+" and "+ insertnode.next.data);
                    printList(this);
                    return;
                }
                current = current.next;
            }
        }
    }
    public void printList(LinkedList list)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            Node current = head;
            while(current.next!=null)
            {
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
            return;
        }
    }

    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}

