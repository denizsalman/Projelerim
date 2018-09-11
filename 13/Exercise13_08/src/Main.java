public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        MyStack myStack1 = (MyStack) myStack.clone();
        myStack1.push(4);
        System.out.println(myStack1.pop());
        System.out.println(myStack1.pop());
    }
}
