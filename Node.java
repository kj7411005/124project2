/**
 * The Node class represents a generic node that stores a value and a reference to the next node.
 * This class is commonly used in data structures such as linked lists.
 */
public class Node<E> {

    private E value;
    private Node<E> next;

    /**
     * Constructs a node with a specified value and sets the next node reference to null.
     */
    public Node(E name) {
        this.value = name;
        this.next = null;
    }

    /**
     * Constructs a node with a specified value and a reference to the next node.
     */
    public Node(E name, Node<E> nextNode) {
        this.value = name;
        this.next = nextNode;
    }

    /**
     * Retrieves the value stored in this node.
     */
    public E getValue() {
        return this.value;
    }

    /**
     * Retrieves the next node linked to this node.
     */
    public Node<E> getNext() {
        return this.next;
    }

    /**
     * Sets the reference to the next node.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }

    /**
     * Returns a string representation of the node, displaying its value.
     */
    @Override
    public String toString() {
        return "Node: " + this.value;
    }
}

