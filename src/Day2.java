import java.util.Arrays;

public class Day2 {


    /*🔷 TOPIC: Arrays
    📅 Day 2 Challenge: Sort an array of 0s, 1s and 2s
    ✅ Problem Statement:
    Given an array consisting only of 0s, 1s, and 2s,
    sort it without using any in-built sort function.
    Use a counting method (often called the "Dutch National Flag" approach).*/


   /* public void sort012(int[] arr){ This is bruth force approach by using sort function
        Arrays.sort(arr);
    }*/

    public void sort012(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count 0s, 1s, and 2s
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite array based on counts
        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;
    }

    public static void main(String[] args) {
        Day2 obj = new Day2();
        int[] arr = {0, 2, 1, 2, 0};

        obj.sort012(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Time complexity =
