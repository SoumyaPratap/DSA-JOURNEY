/*TOPIC = ARRAYS.
    DAY 4 CHALLENGE :  FIND MIN AND MAX IN THE ARRAY.
    PROBLEM STATEMENTS : Given an array arr. Your task is to find the minimum and maximum elements in the array.
    PLATFORM : GFG */

public class Day4 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 2};
        minMax(arr);
    }

    public static void minMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}

/*Time complexity = o(n)
space complexity = o(1) */









