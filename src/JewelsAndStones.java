import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int i, count = 0;
        HashSet<Character> hashSet = new HashSet<>();
        for (i = 0; i < jewels.length(); i++) {
            hashSet.add(jewels.charAt(i));
        }
        for (i = 0; i < stones.length(); i++) {
            if (hashSet.contains(stones.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
