import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1, stack2;
    boolean currentStackIs1;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        currentStackIs1 = true;
    }

    public void push(int x) {
        if (!currentStackIs1) {
            int size = stack2.size();
            for (int i = 0; i < size; i++) {
                stack1.push(stack2.pop());
            }
            currentStackIs1 = true;
        }
        stack1.push(x);
    }

    public int pop() {
        int element;
        if (currentStackIs1) {
            int size = stack1.size();
            for (int i = 0; i < size; i++) {
                stack2.push(stack1.pop());
            }
            element = stack2.pop();
            currentStackIs1 = false;
        }
        else {
            element = stack2.pop();
        }
        return element;
    }

    public int peek() {
        int element;
        if (currentStackIs1) {
            int size = stack1.size();
            for (int i = 0; i < size; i++) {
                stack2.push(stack1.pop());
            }
            element = stack2.peek();
            currentStackIs1 = false;
        }
        else {
            element = stack2.peek();
        }
        return element;
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }

    public static void main(String[] args) {
        QueueUsingStacks myQueue = new QueueUsingStacks();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.push(1); // queue is: [1]
        myQueue.push(2);
        myQueue.pop(); // return 1, queue is [2]
        myQueue.push(2);
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();

    }
}
