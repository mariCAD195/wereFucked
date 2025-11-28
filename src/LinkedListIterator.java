import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<Integer> {

    private MyLinkedList.Node currentNode;

    public LinkedListIterator(MyLinkedList linkedList) {
        this.currentNode = linkedList.getHead();
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Integer next(){
        if(currentNode == null){
            throw new NoSuchElementException();
        }
        MyLinkedList.Node tempNode = currentNode;
        currentNode = currentNode.next;
        return tempNode.value;
    }
}
