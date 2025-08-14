public class Day10 {

    /*Topic = Arrays.

    Day 10 challenge =  Move all zeroes to end.
    Platform = GFG.
    Question Discription =  You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.*/


    public static void main(String[] args) {
        int count = 0;
        int arr[] = {1,2,3,4,5,0,4,3,0,2,0,4};
        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];}}
        while(count<arr.length){
            arr[count++] = 0;}}}

/*Time Complexity = o(n)
Space Complexity = o(1).*/
