import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int num : nums1) {
            hashSet1.add(num);
        }

        for (int num : nums2) {
            if (hashSet1.contains(num)) {
                hashSet2.add(num);
            }
        }

        int index = 0;
        int[] result = new int[hashSet2.size()];
        for (int num : hashSet2) {
            result[index] = num;
            index++;
        }

        return result;
    }
}
