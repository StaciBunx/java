import java.util.Iterator;
public class LinkedList<T> implements Iterator<Node> {
    private Node current;

    public LinkedList(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        Node node = current;
        current = current.getNext();
        return node;
    }

}