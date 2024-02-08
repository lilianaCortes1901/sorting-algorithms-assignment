import java.util.Scanner;

//Question 6 Response

public class ShellSort {

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
        //ShellSort Algorithm
        int n = input.length;
        for (int gap = n/2; gap >0; gap /= 2){
            for (int i = gap; i < n; ++i){
                int tmp = input[i];
                int j;
                for (j = i; j >= gap && tmp < input[j - gap]; j-=gap){
                    input[j] = input[j - gap];
                }
                input[j] = tmp;
            }
        }
        return input;
    }
}
