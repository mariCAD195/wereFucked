public class Main {
    public static void main(String[] args) {
        MyLinkedList seznam = new MyLinkedList();

        System.out.println(seznam.isEmpty());
        seznam.addFirst(3);
        seznam.addFirst(4);
        seznam.addFirst(1);
        seznam.addFirst(2);
        seznam.addToEnd(8);
        seznam.addToEnd(3);

        System.out.println(seznam);
        System.out.println(seznam.getIndex(5));
        System.out.println("\n"+seznam);

        seznam.deleteLast();
        System.out.println("\n"+seznam);

        System.out.println(seznam.indexOf(4));
        System.out.println(seznam.contains(2));
        System.out.println(seznam.contains(3));
        System.out.println(seznam.contains(55));

        System.out.println(seznam.isEmpty());

    }
}
