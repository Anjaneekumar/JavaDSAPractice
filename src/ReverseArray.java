import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int[] numArray = new int[sc.nextInt()];

        System.out.println("Enter array element:");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i]= sc.nextInt();
        }
        sc.close();

        // ReverseArrayMethod(numArray);

        int i=0; int j = numArray.length-1;
        while(i<j){
            int temp = numArray[i];
            numArray[i]=numArray[j];
            numArray[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(numArray));
        
    }

    public static int[] ReverseArrayMethod(int[] inputArray){
        int arrayLength = inputArray.length;
        for (int i = 0; i < arrayLength/2; i++) {
            swap(inputArray, i, arrayLength-i-1);
        }
        return inputArray;
    }

    public static void swap(int[] inputArray, int a, int b){
        int temp = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = temp;
    }
}
