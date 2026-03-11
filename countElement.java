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
//Linkedlist class 
class LinkedList
{
    Node head;
    void insert(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
        }
        else 
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=temp;
        }
    }
    //count function 
    void count(Node head)
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        System.out.println("The total elements in LL :" +count);
    }
}

public class countElement {
    public static void main(String[] args)
    {
      LinkedList ll=new LinkedList();
      ll.insert(10);
      ll.insert(20);
      ll.insert(24);
      ll.insert(30);
      ll.count(ll.head);
    }
}
