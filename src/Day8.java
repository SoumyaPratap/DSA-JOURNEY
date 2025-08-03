public class Day8 {

    /*Topic : Sorted and Rotated Minimum:
    Day 8 Challenge:

    Question Discription is : A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it.
    Approach Used is :  Linear Search.

    Platform : Gfg */


    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,7,6};
        int i;
        int min = arr[0];

        for(i=1 ; i<arr.length; i++){

            if(arr[i] < min){

                min=arr[i];
            }
        }

    }
}

    /*Time Complexity is O(n)
    space Complexity is O(1)*/
