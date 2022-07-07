public class LL {

    Node head;

    public class Node{
        int val;
        Node next;
        Node(int x)
        {
            val=x;
            next=null;
        }
    }
    public void insertb(int d)
    {
        Node l=new Node(d);
        if(head==null)
        {
            head=l;
            return;
        }
        l.next=head;
        head=l;
    }
    public void insertl(int d)
    {
        Node l=new Node(d);
        if(head==null)
        {
            head=l;
            return;
        }
        Node p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=l;
    }
    public void print()
    {
        Node l=head;
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        while(l!=null)
        {
            System.out.print(l.val+" ");
            l=l.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[])
    {
        LL l=new LL();
        System.out.println("A");
        l.insertb(2);
        l.insertl(3);
        l.print();
    }
}
