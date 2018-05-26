import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main3 {

    public static void main (String[] args) {

        int[] A = {9, 3, 9, 3, 9, 7, 9};
        List<Integer> list = new ArrayList<>();

        for (int i=0; i< A.length; i++) {

            if (list.contains(A[i])) {
                int a = A[i];

                Predicate<Integer> predicate = p -> p == a;
                list.removeIf(predicate);


            } else {
                list.add(A[i]);
            }
        }
        System.out.println(list.get(0));
    }
}
