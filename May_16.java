package may;

public class May_16 {
    public static void main(String[] args) {
        Node<Integer> head1 = new Node<>(1);
        Node<Integer> head2 = new Node<>(2);
        Node<Integer> head3 = new Node<>(3);
        Node<Integer> head4 = new Node<>(4);
        Node<Integer> head5 = new Node<>(5);
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;

        Node<Integer> ans = swapPairs(head1);
        while (ans!=null) {
            System.out.println(ans.data);
            ans = ans.next;
        }
    }
    public static Node<Integer> swapPairs(Node<Integer> head) {
        if(head==null || head.next == null){
            return head;
        }
        Node<Integer> n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}
