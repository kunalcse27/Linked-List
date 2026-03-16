//Node class 
class Node 
{
    int data;
    Node next;

    Node(int data)
    {
       this.data=data;
       this.next=null;
    }
}

//Linked List class
class Linkedlist
{
    Node head;
    //Insert at end
    public void insert(int data)
    {
        Node temp =new Node(data);

        if(head ==null)
        {
            head=temp;
        }
        else
        {
            Node curr=head;

            while(curr.next !=null)
            {
                curr =curr.next;
            }

            curr.next =temp;
        }
    }

    //Insert at random index
    public void insertAtindex(int index,int data)
    {
        Node temp = new Node(data);

        if(index ==0)
        {
            temp.next =head;
            head =temp;
            return;
        }

        Node curr =head;

        for(int i =0; i <index-1;i++)
        {
            if(curr ==null)
            {
                System.out.println("Index out of bounds");
                return;
            }
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;
    }

    //Delete head
    public void deleteHead()
    {
        if(head == null)
        {
            System.out.println("List empty");
            return;
        }

        head = head.next;
    }

    //Delete last node
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List empty");
            return;
        }

        if(head.next == null)
        {
            head = null;
            return;
        }

        Node curr = head;

        while(curr.next.next != null)
        {
            curr = curr.next;
        }

        curr.next = null;
    }

    //Delete at random index
    public void deleteAtindex(int index)
    {
        if(head == null)
        {
            System.out.println("List empty");
            return;
        }

        if(index == 0)
        {
            head = head.next;
            return;
        }

        Node curr = head;

        for(int i = 0; i < index-1; i++)
        {
            if(curr.next == null)
            {
                System.out.println("Index out of bounds");
                return;
            }

            curr = curr.next;
        }

        if(curr.next == null)
        {
            System.out.println("Index out of bounds");
            return;
        }

        curr.next = curr.next.next;
    }

    //Print Linked List
    public void printll()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}


//Main class
public class Main
{
    public static void main(String[] args)
    {
        Linkedlist ll = new Linkedlist();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);

        System.out.print("Initial List: ");
        ll.printll();

        ll.insertAtindex(2, 25);
        System.out.print("After Insert at Index 2: ");
        ll.printll();

        ll.deleteHead();
        System.out.print("After Delete Head: ");
        ll.printll();

        ll.deleteLast();
        System.out.print("After Delete Last: ");
        ll.printll();

        ll.deleteAtindex(1);
        System.out.print("After Delete at Index 1: ");
        ll.printll();
    }
}