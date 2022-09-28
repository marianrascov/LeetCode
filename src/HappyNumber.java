public class HappyNumber {
    public boolean isHappy(int n) {
        while (true) {
            int sum = 0;

            //se extrag cifrele lui n
            while (n != 0) {
                int lastDigit = n % 10;
                sum += lastDigit * lastDigit;
                n /= 10;
            }

            // verificare daca n este 1 sau 7 --> true
            if (sum / 10 == 0) {
                if (sum == 1 || sum == 7) {
                    return true;
                } else {
                    //ies din while
                    return false;
                }
            }

            n = sum;
        }
    }
}
