import java.util.Arrays;

public class  Day3 {
    public static void main(String[] args) {

    }

    //TOPIC: Arrays
    // 📅 Day 3 Challenge: Subset of array.
    // ✅ Problem Statement:Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].
    // first sort given 2 array:
    // Approach used is linear search.

    public boolean arraySub( int a[], int b[]){

        Arrays.sort(a);
        Arrays.sort(b);
        int i,count=0;

        for( i=0; i<a.length; i++){

            if(b[count] == a[i])
            {
                count++;
            }
            if(count==b.length){

                return true;
            }

        }

        return false;
    }




}

// Time complexity is o(n)
//Space complexity is o(1)