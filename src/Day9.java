public class Day9 {

    /*Topic = Arrays.

     Day 9 Challenge :  Triplet Sum in Array.

  Question discription is : Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.
         Return true if such a triplet exists, otherwise, return false.

    platform = gfg*/

    public static boolean main(String[] args) {

        int arr[] = { 1,3,4,5,6,7,8};
        int target = 12;
        for(int i =0; i<arr.length; i++) {
            for(int j =i+1; j<arr.length; j++ ) {
                for(int k = j+1; k<arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target) {
                        return true;}}}}
        return false;}}

 /*Time Complexity = o(n*n)
  space Complexity = o(1) */

