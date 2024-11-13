/**
 * The NodeQueue class implements a generic queue using linked nodes.
 * It supports basic queue operations such as enqueue, dequeue, and checking the size of the queue.
 * This implementation follows a first-in, first-out (FIFO) order.
 */
public class NodeQueue<E> implements Queue<E> {

    private int size;
    private Node<E> front;
    private Node<E> back;

    /**
     * Constructs an empty NodeQueue, initializing the size to 0 and the front and back to null.
     */
    public NodeQueue() {
        this.size = 0;
        this.front = null;
        this.back = null;
    }

    /**
     * Adds an element to the back of the queue.
     * If the queue is empty, the element becomes both the front and back of the queue.
     */
    @Override
    public void enqueue(E name) {
        Node<E> newNode = new Node<>(name);
        if (isEmpty()) {
            this.front = newNode;
            this.back = newNode;
            size++;
        } else {
            this.back.setNext(newNode);
            this.back = newNode;
            size++;
        }
    }

    /**
     * Removes and returns the element from the front of the queue.
     * If the queue becomes empty after this operation, both the front and back are set to null.
     */
    @Override
    public E dequeue() {
        if (this.front == null) { // Check if the queue is empty
            return null;
        }

        Node<E> temp = this.front;
        this.front = this.front.getNext();
        size--;

        // If the queue is now empty, reset the back reference to null
        if (this.front == null) {
            this.back = null;
        }

        // Return the value of the removed node
        return temp.getValue();
    }

    /**
     * Retrieves the number of elements currently in the queue.
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Retrieves the front node of the queue without removing it.
     */
    public Node<E> getFirst() {
        return this.front;
    }

    /**
     * Retrieves the back node of the queue without removing it.
     */
    public Node<E> getLast() {
        return this.back;
    }

    /**
     * Checks if the queue is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Main method to test the functionality of NodeQueue.
     */
    public static void main(String args[]) {

        NodeQueue<String> nq = new NodeQueue<>();

        System.out.println(nq.size()); // Initially, the queue size is 0
        nq.enqueue("node2");
        nq.enqueue("node3");

        System.out.println("Now the size of the queue is: " + nq.size()); // Output the size after enqueuing

        nq.dequeue();
        nq.dequeue();

        System.out.println("Now size of the queue is: " + nq.size()); // Output the size after dequeuing
        System.out.println(nq.dequeue()); // Try dequeuing from an empty queue
    }
}
