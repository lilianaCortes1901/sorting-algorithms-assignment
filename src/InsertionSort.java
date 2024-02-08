import java.util.Scanner;

//Question 6 Response
public class InsertionSort {
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
        //InsertionSort Algorithm
        for(int p = 1; p < input.length; ++p){
            int tmp = input[p];
            int j;
            for (j = p; j > 0 && tmp < input[j-1]; j--){
                input[j] = input[j-1];
            }
            input[j] = tmp;
        }
        //returns sorted array list
        return input;
    }

}
