import Model.ListNode;

public class MergeSortedList {
    public static void main(String[] args){
        ListNode l1val4 = new ListNode(4);
        ListNode l1val2 = new ListNode(2,l1val4);
        ListNode l1 = new ListNode(1,l1val2);
        ListNode l2val4 = new ListNode(4);
        ListNode l2val3 = new ListNode(3,l2val4);
        ListNode l2 = new ListNode(1,l2val3);
        System.out.println(mergeTwoLists(l1,l2));
    }
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){

        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while( l1 !=null && l2 != null){
            if(l1.val <= l2.val){
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }
        if(l1 != null){
            current_node.next = l1;
        }
        if(l2 != null){
            current_node.next = l2;
        }
        return temp_node.next;
    }

}
