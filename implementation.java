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
//Linked list class   insert method, print method
class LinkedList
{ 
   Node head;
   public void insert(int data)
   {  
       Node temp=new Node(data);
       
       //head insertaion
    if(head==null)
    {
        head=temp;
    }
    else 
    {
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
    }
   }
   //print method
   public void printLL(Node head)
   {
       Node temp=head;
       while(temp!=null)
       {
          System.out.print(temp.data +" ");
          temp=temp.next;
       }
   }
}

//Main class 
public class implementation
{
    public static void main(String[] args)
    {
        LinkedList ll =new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(25);
        ll.insert(30);
        ll.insert(35);
        ll.printLL(ll.head);
    }
}