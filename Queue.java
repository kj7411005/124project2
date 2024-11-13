/**
 * The Queue interface represents a generic queue data structure that operates in a first-in,
 * first-out (FIFO) manner. It defines methods for adding elements, removing elements, and checking
 * the size of the queue.
 */
public interface Queue<T> {

    /**
     * Adds an element to the back of the queue.
     */
    public void enqueue(T value);

    /**
     * Removes and retrieves the element from the front of the queue.
     */
    public T dequeue();

    /**
     * Checks the number of elements in the queue.
     */
    public int size();
}
