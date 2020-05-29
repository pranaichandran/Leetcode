package com.company;

public class DoublyLinkedList {
    public class DoublyNode{
        DoublyNode next;
        DoublyNode prev;
        int data;
        DoublyNode(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    DoublyNode head;
    public void append(int data)
    {
        if(head==null)
        {
            head = new DoublyNode(data);
            return;
        }
        else
        {
            DoublyNode current = head;
            while(current.next!=null)
            {
                current = current.next;
            }
            DoublyNode appendNode = new DoublyNode(data);
            current.next = appendNode;
            appendNode.prev = current;
            return;
        }
    }
    public void prepend(int data)
    {
        if(head==null)
        {
            head = new DoublyNode(data);
            return;
        }
        DoublyNode newHead = new DoublyNode(data);
        newHead.next = head;
        head.prev = newHead;
        head = newHead;
        return;
    }
    public void deletebyValue(int data)
    {
        if(head==null)
        {
            System.out.println("Value Not Found in the List");
            return;
        }
        else
        {
            DoublyNode current = head;
            while(current.next!=null)
            {
                if(current.next.data == data)
                {
                    if(current.next.next!=null)
                    {
                        current.next = current.next.next;
                        current.next.prev = current;
                        return;
                    }
                    else
                    {
                        current.next = null;
                        return;
                    }

                }
                current = current.next;
            }
        }
    }
    public void printList(DoublyLinkedList list)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        else
        {
            DoublyNode current = head;
            while(current.next!=null)
            {
                System.out.println(current.data);
                current = current.next;
            }
            System.out.println(current.data);
            return;
        }
    }

}
