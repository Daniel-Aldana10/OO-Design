package src.main.java.edu;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A generic implementation of a singly linked list that implements the List interface.
 * This implementation provides basic linked list operations and supports generic types.
 *
 * @param <T> The type of elements stored in the list
 */
public class LinkedList<T> implements List<T> {
    private int size = 0;
    private Node<T> head;

    /**
     * Returns the number of elements in the list.
     *
     * @return The number of elements in the list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks if the list is empty.
     *
     * @return true if the list contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * Returns an iterator over the elements in the list.
     *
     * @return An iterator over the elements in the list
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.item;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    /**
     * Appends the specified element to the end of the list.
     *
     * @param t Element to be appended to the list
     * @return true (as specified by Collection.add)
     */
    @Override
    public boolean add(T t) {
        if(size==0){head = new Node<>(t);}
        else{
            Node<T> current = head;
            while (current.hasNext()){
                current = current.next;
            }
            current.next = new Node<>(t);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    /**
     * Returns the element at the specified position in the list.
     *
     * @param index Index of the element to return
     * @return The element at the specified position, or null if the index is out of range
     */
    @Override
    public T get(int index) {
        if(size < index||index < 0) {
            return null;
        }
        Node<T> current = head;
        int i = 0;
        while(i < index) {
            current= current.next;
            i++;
        }
        return current.item;
    }
    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }
    /**
     * Node class representing an element in the linked list.
     * Each node contains the element and a reference to the next node.
     *
     * @param <T> The type of element stored in the node
     */
    private static class Node<T> {
        public T item;
        public Node<T> next;

        /**
         * Constructs a new node with the specified element.
         *
         * @param element The element to be stored in the node
         */
        public Node(T element) {
            this.item = element;
            this.next = null;
        }
        /**
         * Checks if this node has a next node.
         *
         * @return true if this node has a next node, false otherwise
         */
        public boolean hasNext(){
            return  this.next!=null;
        }
    }
}
