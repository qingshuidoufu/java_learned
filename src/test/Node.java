package test;

public class Node {
    Node previous;//上一个
    Node next;//下一个
    Object element;//元素数据

    public Node(Node previous, Node next, Object element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        this.element = element;
    }
}
