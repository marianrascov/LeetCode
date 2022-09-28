import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class ImplementQueueUsingStacks {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public ImplementQueueUsingStacks() {
        input = new Stack<Integer>();
        output = new Stack<Integer>();
    }

    //elementul se adauga intotdeauna in stiva "input"
    public void push(int x) {
        input.push(x);
    }

    //se foloseste stiva "output" pentru operatiunea de eliminare
    public int pop() {
        updateOutputStack();
        return output.pop();
    }

    //se foloseste stiva "output" pentru operatiunea de accesare
    public int peek() {
        updateOutputStack();
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Daca stiva "output" este goala, se muta toate elementele din stiva "input" in stiva "output"
    private void updateOutputStack() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}
