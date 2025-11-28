public class Main {
    public static void main(String[] args) {
        MyLinkedList seznam = new MyLinkedList();

        seznam.addFirst(3);
        seznam.addFirst(4);
        seznam.addFirst(1);
        seznam.addFirst(2);
        seznam.addToEnd(8);
        seznam.addToEnd(3);

        LinkedListIterator iterator = (LinkedListIterator) seznam.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
