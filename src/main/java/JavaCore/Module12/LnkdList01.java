package JavaCore.Module12;

public class LnkdList01 {
    public static void main(String[] args) {

    }
}

/*private static*/ class Node<E> {
    E item;
    Node<E> prev;
    Node<E> next;

    Node(Node <E> prev, E item, Node<E> next){
        this.prev = prev;
        this.item = item;
        this.next = next;
    }
}