import java.util.Iterator;

public class Personal<T> implements Iterable<Node> {

    private Node first;
    private Node last;

    public Personal() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(T data) {

        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if (first == null) {
            node.setPrev(null);
            first = last = node;

        } else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
    }

        @Override
        public Iterator<Node> iterator() {
            return new List(first);
        }
    }
