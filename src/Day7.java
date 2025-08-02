public class Day7 {

           /* TOPIC = ARRAYS.
            DAY 6 CHALLENGE :   TWO SUM:
          PROBLEM STATEMENTS : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

           You may assume that each input would have exactly one solution, and you may not use the same element twice.
            PLATFORM : LEETCODE (01)*/



    public int[] main(String[] args)
    {
        int arr[] = {1,2,3,4,6,8,7};
        int target = 10;
        for(int i =0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++ )
            {
                if(arr[i]+arr[j] == target)
                {

                    int a[] = {i,j};

                    return a;


                }
            }




        }

        return null;


       // TIME COMPLEXITY = O(N*N)



    }




}
