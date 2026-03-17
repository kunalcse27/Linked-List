public class nthNodefromEnd {
    public static Node nthNode(Node head, int n) {
        int size=0;
        Node temp=head;
        // Count size
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int a = size - n + 1;

        // Reset temp to head
        temp = head;
        for (int i=1; i<=a - 1;i++) {
            temp = temp.next;
        }

        return temp;
    }
    //slow fast technique-- rabbit turtle 
    public static Node nthNode2(Node head,int n)
    {
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
        while(fast!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
        return slow;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(12);
        Node c = new Node(13);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(100);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node result = nthNode(a, 2); // Example: 2nd node from end
        System.out.println(result.data); // Output: 50

         Node result = nthNode2(a, 2); // Example: 2nd node from end
        System.out.println(result.data);
    }
}
