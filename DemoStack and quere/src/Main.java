public class Main {
    public static void main(String[] args) {
        MyArrayStack myArrayStack = new MyArrayStack(3);

        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);
        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();

    }
}
