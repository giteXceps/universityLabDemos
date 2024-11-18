public class LinkStack {
    private LinkList linkList;

    public LinkStack() {
        linkList = new LinkList();
    }

    public void push(long d) {
        linkList.insertFirst(d);
    }

    public long pop() {
        return linkList.deleteFirst();
    }

    public boolean isEmpty() {
        return linkList.isEmpty();
    }

    public void displayStack() {
        System.out.println("Stack (top --> bottom)");
        linkList.displayList();
        System.out.println(" ");
    }

    public long peek() {
        return linkList.displayHead();
    }
}
