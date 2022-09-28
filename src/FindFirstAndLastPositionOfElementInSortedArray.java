public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[]{-1, -1};
        searchRange(nums, 0, nums.length - 1, target, range);
        return range;
    }

    private void searchRange(int[] nums, int start, int end, int target, int[] range) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                boolean foundLeftRange = (mid == 0 || (mid > 0 && nums[mid - 1] < target));
                boolean foundRightRange = (mid == nums.length - 1 || (mid < nums.length - 1 && nums[mid + 1] > target));
                if (foundLeftRange) {
                    range[0] = mid;
                }
                if (foundRightRange) {
                    range[1] = mid;
                }
                if (foundLeftRange && foundRightRange) {
                    return;
                } else if (foundLeftRange) {
                    searchRange(nums, mid + 1, end, target, range);
                } else if (foundRightRange) {
                    searchRange(nums, start, mid - 1, target, range);
                } else {
                    searchRange(nums, mid + 1, end, target, range);
                    searchRange(nums, start, mid - 1, target, range);
                }
            } else if (nums[mid] > target) {
                searchRange(nums, start, mid - 1, target, range);
            } else {
                searchRange(nums, mid + 1, end, target, range);
            }
        }
        return;
    }
}
