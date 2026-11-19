/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/


class Solution {
    public Node flatten(Node head) {

        flattenDFS(head);

        return head;
    }

    private Node flattenDFS(Node head) {

        Node curr = head;
        Node tail = head;

        while(curr != null) {

            Node next = curr.next;

            if(curr.child != null) {

                // Recursively flatten child list
                Node childHead = curr.child;
                Node childTail = flattenDFS(childHead);

                // Connect current node with child list
                curr.next = childHead;
                childHead.prev = curr;

                // Remove child pointer
                curr.child = null;

                // Connect child tail with original next
                if(next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                tail = childTail;
            }
            else {
                tail = curr;
            }

            curr = next;
        }

        return tail;
    }
}
