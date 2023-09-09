import java.util.Scanner;
public class SubArrays {
    public static void main(String[] args) {
        // find all the sub arrays of the input array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int arrayLength = sc.nextInt();
        int[] userArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            userArray[i]=sc.nextInt();
        }

        sc.close();

        subArraysPrint(userArray);
    }

    public static void subArraysPrint(int[] userArray){
        int userArrayLength = userArray.length;

        // counting starting index e,g ==> 0,1,2,3
        for(int startIndex =0; startIndex<userArrayLength; startIndex++){
            
            //counting endIndex for each startIndex. e.g -> 0, (0,1) , (0,1,2)
            for(int endIndex = startIndex; endIndex < userArrayLength ; endIndex++){
                //starting with startIndex because don't repeat

                //for print array between ( startIndex <--> endIndex )
                for(int printIndex = startIndex ; printIndex < endIndex;printIndex++){
                    System.out.print(userArray[printIndex]);
                }

                // newLine for new Array
                System.out.println();
            }
        }
    }
}
