public class FindPeakElement {
    public static void main(String[] args) {
        /**
         * 
         * Problem description.
         * 
         * Input: array[]= {5, 10, 20, 15}
         * Output: 20
         * Explanation: The element 20 has neighbors 10 and 15, both of them are less
         * than 20.
         * 
         * Input: array[] = {10, 20, 15, 2, 23, 90, 67}
         * Output: 20 or 90
         * Explanation: The element 20 has neighbors 10 and 15, both of them are less
         * than 20, similarly 90 has neighbors 23 and 67.
         * 
         */

        int[] testArray = { 10, 20, 15, 2, 23, 90, 67 };
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        System.out.println(findPeakElementString(testArray));
        System.out.println(findPeakElementString(arr));

    }

    public static String findPeakElementString(int[] userArray) {
        String result = "";
        if (userArray.length >= 3) {
            for (int i = 1; i < userArray.length - 1; i++) {
                if (userArray[i - 1] < userArray[i] && userArray[i] > userArray[i + 1]) {
                    if (result.isEmpty() == false) {
                        result += " or " + String.valueOf(userArray[i]);
                    } else {
                        result += String.valueOf(userArray[i]);
                    }
                }
            }
            return result;
        }
        return "No peak Found!";
    }
}
