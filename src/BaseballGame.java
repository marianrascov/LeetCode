import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {

        Stack<Integer> stack = new Stack<>();

        int sum = 0;

        for (String op : ops) {
            switch (op) {
                case "+":
                    stack.add(stack.peek() + stack.get(stack.size() - 2));
                    sum += stack.peek();
                    break;
                case "D":
                    stack.add(stack.peek() * 2);
                    sum += stack.peek();
                    break;
                case "C":
                    sum -= stack.pop();
                    break;
                default:
                    stack.add(Integer.parseInt(op));
                    sum += stack.peek();
            }
        }

        return sum;
    }
}
