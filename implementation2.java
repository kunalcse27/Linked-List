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
class LinkedList{
    Node head;
    Node tail;
    //insert function 
    public void insert(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else 
        {
            tail.next=temp;
            tail=temp;
        }
    }
    //print function 
    public void printll(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
public class implementation2 {
    public static void main(String[] args) {
         LinkedList ll=new LinkedList();
         ll.insert(10);
         ll.insert(20);
         ll.insert(24);
         ll.insert(30);
         ll.printll(ll.head);
    }
}
