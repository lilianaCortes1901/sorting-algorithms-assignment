import java.util.Scanner;

//Question 6 - Response
public class SelectionSort {
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
        //Selection Sort Algorithm
        //int unsorted = 0;
        for (int i = 0; i < input.length; i++){
            int minIndex = i;
            for (int j = i; j < input.length; j++){
                int tmp = input[j];
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
                input[j] = input[minIndex];
                input[minIndex] = tmp;
            }
        }
        return input;
    }
}
