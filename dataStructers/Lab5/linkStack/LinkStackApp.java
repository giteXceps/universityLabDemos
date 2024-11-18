public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack();
        theStack.push(23);
        theStack.push(25);
        theStack.push(45);
        theStack.push(99);

        theStack.displayStack();

        System.out.println(theStack.peek());

        theStack.pop();

        System.out.println(theStack.peek());
    }
}
