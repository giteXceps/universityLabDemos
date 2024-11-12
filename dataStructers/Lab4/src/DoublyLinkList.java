
public class DoublyLinkList {

    private Link head;
    private Link tail;

    //listenin bos oldugu bildirilir
    public DoublyLinkList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //basa eleman ekleme
    public void insertFirst(long d) {
        Link newLink = new Link(d);
        //liste bossa hem head hem tail yeni dugumu isaret eder
        if (isEmpty()) {
            tail = newLink;
        } else {
            head.previous = newLink;
        }
        newLink.next = head;
        head = newLink;
    }

    //sona eleman ekleme
    public void insertToTail(long d) {
        Link newLink = new Link(d);
        //liste bossa
        if (isEmpty()) {
            head = newLink;
        } else {
            tail.next = newLink;
            newLink.previous = tail;
        }
        tail = newLink;
    }
    //bastaki elemani silme

    public Link deleteFirst() {
        Link temp = head;

        //listede tek eleman varsa
        if (head.next == null) {
            //liste bos hale getirilir
            tail = null;
        } else {
            //ikinci dugumun previous'i null olur
            head.next.previous = null;
        }
        head = head.next;

        return temp;
    }

    //sondan eleman silmw
    public Link deleteFromTail() {
        Link temp = tail;

        //liste tek elemanli ise
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        return temp;
    }

    //ilgili degeri arama metodu
    public Link find(long key) {
        Link current = head;

        while (current.data != key) {
            current = current.next;
            //sona gelindiyse ve key bulunamadiysa
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    //ilgili veriyi silme metodu
    public void delete(long d) {
        Link current = find(d);


        //aranan dugum bulunduysa
        if (current != null) {
            if (current == head) {
                //head guncellendi
                head = current.next;
                head.previous = null;

            }

            //silinecek deger sondaysa
            else if (current == tail) {
                //tail guncellenecek
                tail = current.previous;
                tail.next = null;
            } else {
                //onceki dugumun next'ini guncelle
                current.previous.next = current.next;
                //sonraki dugumun previous'ini guncelle
                current.next.previous = current.previous;
            }
        }
    }

    //listeyi bastan sona siralama
    public void displayForward() {
        System.out.println("bastan sona ->");
        Link current = head;
        while (current != null) {
            //dugumun degeri yazdirilir
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    public void displayBackward() {
        System.out.println("sondan basa ->");
        Link current = tail;
        while (current != null) {
            //dugumun degeri yazdirilir
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }

}