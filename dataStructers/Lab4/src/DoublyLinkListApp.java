public class DoublyLinkListApp {
    public static void main(String[] args) throws Exception {
        DoublyLinkList theList = new DoublyLinkList();
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertToTail(11);
        theList.insertToTail(33);
        theList.insertToTail(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        System.out.println("bastan silindi");
        theList.displayForward();

        theList.deleteFromTail();
        System.out.println("sondan silindi");
        theList.displayForward();

        theList.delete(11);
        System.out.println("11 silindi");
        theList.displayForward();
    }
}
