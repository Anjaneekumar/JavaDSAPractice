import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeAllEvenFromArrayList {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 45, 4);
        ArrayList<Integer> list1 = new ArrayList<Integer>(values);
        System.out.println(list1);
        removeAllEvenFromArrayList_InPlace(list1);
        System.out.println(list1);
    }

    public static ArrayList<Integer> removeAllEvenFromArrayList_InPlace(ArrayList<Integer> userList) {
        if (userList.size() != 0) {
            for (int i = userList.size() - 1; i > 0; i--) {
                if ((userList.get(i)%2) == 0) {
                    userList.remove(i);
                }
            }
            return userList;
        }
        return userList;
    }
}
