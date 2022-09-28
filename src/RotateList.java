public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode lastElement = head;
        int length = 1;

        //Se afla ultimul element si lungimea listei
        while (lastElement.next != null) {
            lastElement = lastElement.next;
            length++;
        }

        // Se creeaza o lista circulara
        lastElement.next = head;

        // Nr de pasi de mutat in lista
        int stepRotate = length - (k % length);

        for (int i = 0; i < stepRotate; i++) {
            head = head.next;
            lastElement = lastElement.next;
        }

        lastElement.next = null;

        return head;
    }
}
