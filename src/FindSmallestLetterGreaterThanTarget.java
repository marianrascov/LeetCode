public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (letters[right] <= target) {
            return letters[0];
        }
        if (letters[left] > target) {
            return letters[left];
        }
        return letters[right];
    }
}
