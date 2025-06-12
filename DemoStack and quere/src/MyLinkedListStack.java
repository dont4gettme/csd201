
public class MyLinkedListStack implements ISTACKQuere {
    private class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            next = null;

        }
    }

    @Override
    public boolean push(int value) {
        return false;
    }
    

    @Override
    public int pop() {
        return 0;
    }
    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void display() {

    }
}
