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
class LinkedList
{
    Node head;
    //insert function 
    public void insert(int data)
    {
        Node temp=new Node(data);
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
    
    //insert at random index 
  public void insertAtIndex(int idx, int data)
{
    Node t = new Node(data);

    if(idx == 0)   // insert at beginning
    {
        t.next=head;
        head = t;
        return;
    }

    Node temp = head;
    
    for(int i = 0; i < idx-1; i++)
    {
        temp = temp.next;
    }
    t.next = temp.next;
    temp.next = t;
}
    //print function 
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
//main cass 
public class insertRandomindex
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.printll(ll.head);
        ll.insertAtIndex(2, 25);
        ll.printll(ll.head);
        
    }
}