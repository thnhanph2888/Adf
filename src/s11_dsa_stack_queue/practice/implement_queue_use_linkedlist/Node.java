package practice.implement_queue_use_linkedlist;

public class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{\n" +
                "key=" + key +
                "\n, next=" + next +
                '}';
    }
}
