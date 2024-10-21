package dataStructers.Lab3.LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertToHead(22);
        theList.insertToHead(44);
        theList.insertToHead(66);

        theList.insertToLast(11);
        theList.insertToLast(33);
        theList.insertToLast(55);

        theList.displayList();

        theList.deleteFromHead();
        theList.deleteFromHead();

        theList.displayList();
    }
}
