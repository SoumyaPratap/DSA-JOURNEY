import com.sun.jdi.PathSearchingVirtualMachine;

public class DAY5 {
           /*TOPIC = ARRAYS.
     DAY 5 CHALLENGE :  FIND MISSING NUMBER IN THE ARRAY.
    PROBLEM STATEMENTS : Given an array arr. Your task is to find the MISSING number in that array..
      PLATFORM : GFG */

    public static void main(String[] args) {

        int[] inputNumber = {1,2,3,5};
        int result = missingNo(inputNumber);
        System.out.println("The missing number is :" + result);

    }
    public static  int missingNo(int[] arr)
    {


        int n = arr.length+1;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] != i+1)
            {
                return i+1;
            }
        }

        return n;
    }
}

/*Time Complexity = o(n)
Space complexity = o(1)*/
