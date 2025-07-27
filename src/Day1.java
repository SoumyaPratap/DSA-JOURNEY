//Day 1 Challenge: Squares of a Sorted Array
//📌 Problem:
//You're given a sorted array in non-decreasing order. You need to return a new array containing the squares of each number, also sorted in non-decreasing order.

//Input: [-4, -1, 0, 3, 10]
//Output: [0, 1, 9, 16, 100]

public class Day1 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }

        return result;
    }
}
