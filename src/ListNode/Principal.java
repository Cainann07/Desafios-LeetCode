package ListNode;
class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Principal {
    public ListNode middleNode(ListNode head) {
        int qtdNos = 0;
        while (head != null) {
            qtdNos++;
            head = head.next;
        }



        if (qtdNos % 2 == 0) {
            ListNode aux = head;
            for (int i = 0; i <= qtdNos / 2; i++) {
                aux = head.next;
                if (i == qtdNos/2) head = aux;
            }
        } else {
            ListNode aux = head;
            for (int i = 0; i <= (qtdNos - 1) / 2; i++) {
                aux = head.next;
                if (i == (qtdNos-1)/2) head = aux;
            }
        }
        return head;
    }
}
