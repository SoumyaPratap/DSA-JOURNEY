public class DAY6 {

   /* TOPIC = ARRAYS.
    DAY 6 CHALLENGE : Count 1's in binary array

    PROBLEM STATEMENTS : You are given a binary array that is sorted in non-increasing order, meaning all the 1's appear before the 0's. Find the total number of 1's present in the array
    PLATFORM : GFG  */


    public static void main(String[] args) {

    }


    public int countOnes(int[] arr){

        int count=0;
        for(int i =0; i<arr.length;i++)
        {

            count = count + arr[i];
        }

        return count;
    }


}


 /*Time complexity =   o(n)
 Space complexity = o(1)  */
