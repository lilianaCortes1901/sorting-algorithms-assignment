import java.util.Arrays;
import java.util.Random;

//Question 7 - Performance Testing Framework
public class Tester {
    //constructor
    //public <sortingAlgorithm> Tester(sortingAlgorithm sa){}
    public static void singleTest(int size){
        Random random = new Random(); //initializing random variable
        int[] arrayRd = new int[size]; //random number generated array with set int size
        for (int i =0; i < arrayRd.length; i++){
            arrayRd[i] = random.nextInt(); //assigns random generated numbers to arrayRd
            System.out.println(Arrays.toString(arrayRd));
        }
        //Run the sorting algorithm's sort method in each class using generated random array list
        BubbleSort.sorty(arrayRd);
        InsertionSort.sorty(arrayRd);
        SelectionSort.sorty(arrayRd);
        ShellSort.sorty(arrayRd);
        QuickSort.sorty(arrayRd);
        MergeSort.sorty(arrayRd);

    }
    public static double test(int iterations, int size) {
        singleTest(size);
        //calculates the speed of an algorithm
        double start = System.currentTimeMillis();
        int a = 0;
        for (int i =0; i < iterations; i++){
            a++;
        }
        double end = System.currentTimeMillis();
        return (end - start)/iterations;
    }
}
