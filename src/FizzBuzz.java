import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 15 == 0) {
                result.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                result.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i + 1));
            }
        }
        return result;
    }
}
