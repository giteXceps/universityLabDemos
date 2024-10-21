package dataStructers.Lab3.ArrayList;

public class LinkList {
    private Link head;

    public LinkList() {
        head = null;
    }

    //basa eleman ekleme
    public void insertToHead(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = head;
        head = newLink;
    }

    //bastan link silme
    public Link deleteFirst(){
        Link temp = head;
        head = head.next;
        return temp;
    }

    //listeleme
    public void displayList(){
        System.out.println("Liste:");
        Link current = head;
        while(current != null){
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }

    //liste boş mu dolu mu kontrolü
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
}
