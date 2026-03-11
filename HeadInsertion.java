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
    //Insert at beginning 
    public void insertAtbeginning(int data)
    {
        Node temp=new Node(data);
        //case 1: Ll is empty
        if(head==null)
        {
            head=temp;
        }
        //case 2: Non empty
        else{
            temp.next=head;
            head=temp;
        }
    }
    public void printll(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
}

public class HeadInsertion {
    public static void main(String[] args)
    {
      LinkedList ll=new LinkedList();
      ll.insert(10);
      ll.insert(20);
      ll.insert(24);
      ll.insert(30);
      ll.insertAtbeginning(9);
      ll.printll(ll.head);
    }
}