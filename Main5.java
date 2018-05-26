import java.util.Arrays;
import java.util.stream.IntStream;

public class Main5 {

    public static void main (String[] args) {
        int[] a = {2, 1, 4, 3, 5};
        int expected = 4;

        System.out.println(solution(a));
    }

    static int solution (int[] A) {
        int i=0;
        if (A.length>1) {
            Arrays.sort(A);
            if (A[0] != 1) {
                return 1;
            } else if (A[A.length - 1] == A.length) {
                return A.length + 1;
            } else {
                while (A[i] + 1 == A[i + 1]) {
                    i++;
                }
                return A[i] + 1;
            }
        } else if (A.length == 1) {
            if (A[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    static int sumOf (int[] A) {
        return Arrays.stream(A).sum();
    }
}
