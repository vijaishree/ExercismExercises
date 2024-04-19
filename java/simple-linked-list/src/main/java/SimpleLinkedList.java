import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    Node head;
   class Node{
       T data ;
       Node next;
       public Node(T data){
            this.data = data;
            next = null;
       }

   }
   int size = 0;
    SimpleLinkedList() {}

    SimpleLinkedList(T[] values) {
        for(T value : values) push(value);
    }

    void push(T value) {
        Node newNode = new Node(value);
        newNode.next = head ;
        head = newNode;
        size++;
    }

    T pop() {
    if(size==0) throw new NoSuchElementException();
    Node current = head;
    head = current.next;
    size--;
    return current.data;
    }

    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    T[] asArray(Class<T> clazz) {

        T[] arrayList = (T[]) Array.newInstance(clazz,size);
        Node currentNode = head ;
        for(int i =0;i<size;i++){
            arrayList[i]= currentNode.data;
            currentNode = currentNode.next;
        }
        return arrayList;
    }

    int size() {
    return size;
    }
}
