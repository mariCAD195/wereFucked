import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer>{

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size++;
    }

    public void addToEnd(int value){
        Node newNode = new Node(value);
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        if(head == null){
            head = newNode;
        }
        size++;
    }

    public int getIndex(int index){
        //index 0 = head
        Node current = head;
        for (int i = 0; i < this.size; i++) {
                if(i == index){
                   return current.value;
               }
                if(current.next != null){
                    current = current.next;
                }
        }
        return -1;
    }

    public int indexOf(int value){
        //index 0 = head
        Node current = head;
        for (int i = 0; i < this.size; i++) {
            if(current.value == value){
                return i;
            }
            if(current.next != null){
                current = current.next;
            }
        }
        return -1;
    }

    public boolean contains(int value){
        Node current = head;
        for (int i = 0; i < this.size; i++) {
            if(current.value == value){
                return true;
            }
            if(current.next != null){
                current = current.next;
            }
        }
        return false;
    }

    public int deleteLast(){
        int deletedValue = tail.value;
        Node current = head;
        for (int i = 0; i < this.size; i++) {
            if(current.next == tail){
                current.next = null;
                tail = current;
            }
            if(current.next != null){
                current = current.next;
            }
        }
        size--;
        return deletedValue;
    }

    public int deleteFirst(){
        int deletedValue = head.value;
        head = head.next;
        size--;
        return deletedValue;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }


    public String toString(){
        String text = "";
        Node curr = head;
        while(curr != null){
           if(curr.next != null){
               text += curr.value + " -> ";
               curr = curr.next;
           }else{
               text += curr.value + "";
               curr = curr.next;
           }
        }
        text += " meow";
        return text;
    }

    public int count(){
        return size;
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
            this.next = null;
        }

    }

}
