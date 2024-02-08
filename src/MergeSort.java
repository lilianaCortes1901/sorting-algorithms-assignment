import java.util.Scanner;

//Question 6 Response

public class MergeSort {
    public static int[] sorty(int[] input){
        //setting up for user input
        Scanner scanner = new Scanner(System.in);
        //initialize/declare sorty array with array dimension/size of 5
        input = new int[6];
        //get user input and add it to the array sorty[]
        System.out.println("Enter a 6 element array list: ");
        for(int i = 0; i < input.length; i++){
            if (scanner.hasNextInt()){
                input[i] = scanner.nextInt();
            }
        }
        //MergeSort Algorithm
        int n = input.length;
        //finding the right, middle, and left of the array list
        int midIndex = n / 2; //splits array list in half
        int[] left = new int[midIndex]; //assigns what elements fall in the left
        int[] right = new int[n - midIndex]; //assigns what elements fall in the right

        //Create left sublist array
        for (int i =0; i < midIndex; i++){ //looping from element 0 to the leftside of the array
            left[i] = input[i]; //copies elements from original list into the left sublist array
        }
        //Create right sublist array
        for (int i = midIndex; i < n; i++){ //looping from middle of array (to the end of the array) to the rightside of the array
            right[i - midIndex] = input[i]; //copies elements from original list into the right sublist array
        }

        int tmp = input.length;
        int j;
        for (j = 0; j >= input[j] && tmp < input[j]; j--){
            input[j] = input[j - left[j]];
        }
        input[j] = tmp;

        return input;
    }

}

/*Resources to help understand how to split array into sub lists:
* Merge Sort Algorithm in Java by Coding with John
* https://www.youtube.com/watch?v=bOk35XmHPKs&ab_channel=CodingwithJohn */