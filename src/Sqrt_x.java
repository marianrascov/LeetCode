public class Sqrt_x {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid;
        int result = 0;

        if (x == 0 || x == 1) {
            return x;
        }

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (mid == (x / mid)) {
                return mid;
            } else if (mid < (x / mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
