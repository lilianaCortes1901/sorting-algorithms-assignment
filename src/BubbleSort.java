import java.util.Scanner;

//Question 6 Response

public class BubbleSort {
    public static int[] sorty(int[] input){
        //setting up for user input
        Scanner scanner = new Scanner(System.in);
        //initialize/declare sorty array with array dimension/size of 5
        //instead of initializing another variable for size
        input = new int[6];
        //get user input and add it to the array sorty[]
        System.out.println("Enter a 6 element array list: ");
        for(int i = 0; i < input.length; i++){
            if (scanner.hasNextInt()){
                input[i] = scanner.nextInt();
            }
        }
        //BubbleSort Algorithm
        int n = input.length;
        for (int i = 0; i < n-1; i++){
            for (int j=0; j < n-1-i; j++){
                int tmp = input[j+1];
                if (input[j+1] < input[j]){
                    input[j+1] = input[j];
                    input[j] = tmp;
                }
            }
        }
        return input;
    }
}

