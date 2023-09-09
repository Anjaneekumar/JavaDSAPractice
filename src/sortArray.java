import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        /**
         * program to sort an array in ascending order
         */
        int[] userArray = new int[] {10, 20, 15, 2, 23, 90, 67};
        sortArray_InPlace_linear(userArray);
        System.out.println(Arrays.toString(userArray));
    }

    public static void sortArray_InPlace_linear(int[] userArray){
        if(userArray.length>1){
            boolean isSorted = false;
            // int minimumValue = minOfArray(userArray);
            // int maximumValue = maxOfArray(userArray);
            int arrayLength = userArray.length;
            while(!isSorted){
                // if(userArray[0]==minimumValue && userArray[-1]==maximumValue){
                //     isSorted = true;
                // }
                // swapping element
                isSorted = true;

                for (int i = 0; i < arrayLength-1; i++) {
                    if(userArray[i]> userArray[i+1]){
                        swapping(userArray, i, i+1);
                        isSorted=false; // because swapping occur means that the array is not sorted
                    }
                }
            }
        }
    }

    // public static int minOfArray(int[] userArray){
    //     int minOfArray = userArray[0];
    //     for (int i = 1; i < userArray.length; i++) {
    //         if(minOfArray>userArray[i]){
    //             minOfArray=userArray[i];
    //         }
    //     }
    //     return minOfArray;
    // }

    // public static int maxOfArray(int[] userArray){
    //     int maxOfArray = userArray[0];
    //     for (int i = 1; i < userArray.length; i++) {
    //         if(maxOfArray<userArray[i]){
    //             maxOfArray=userArray[i];
    //         }
    //     }
    //     return maxOfArray;
    // }

    public static void swapping(int[] userArray, int i, int j){
        int temp = userArray[i];
        userArray[i] = userArray[j];
        userArray[j]=temp;
    }
}
