package dataStructers.Lab3.ArrayList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertToHead(1, 2.3);
        theList.insertToHead(2, 3.4);
        theList.insertToHead(3, 4.5);
        theList.insertToHead(4, 5.6);
        theList.insertToHead(5, 6.7);

        theList.displayList();

        while(!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Silinen:");
            aLink.displayLink();
        }

        System.out.println("");
        theList.displayList();


    }
}
