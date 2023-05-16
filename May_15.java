package may;

public class May_15 {
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

        Node<Integer> ans = swapNodes(head1,2);
        while (ans!=null) {
            System.out.println(ans.data);
            ans = ans.next;
        }

    }

    private static Node<Integer> swapNodes(Node<Integer> head1,int k) {
//        if (head1==null) return null;
//        Node<Integer> temp1 = head1;
//        Node<Integer> temp2 = head1;
//        int length =0;
//        while(head1 != null){
//            head1 = head1.next;
//            length++;
//        }
//
//        while (k>1){
//            temp1 = temp1.next;
//            k--;
//        }
//        while (length-k>0)

        Node<Integer> fast = head1;
        Node<Integer> slow = head1;
        Node<Integer> first = head1, second = head1;

        // Put fast (k-1) nodes after slow
        for(int i = 0; i < k - 1; ++i)
            fast = fast.next;

        // Save the node for swapping
        first = fast;

        // Move until the end of the list
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Save the second node for swapping
        // Note that the pointer second isn't necessary: we could use slow for swapping as well
        // However, having second improves readability
        second = slow;

        // Swap values
        int temp = first.data;
        first.data = second.data;
        second.data = temp;

        return head1;
    }
}
