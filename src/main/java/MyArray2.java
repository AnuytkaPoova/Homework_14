import java.util.Arrays;
import java.util.stream.IntStream;

/**
 2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
 четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4
 варианта входных данных).
 [ 1 1 1 4 4 1 4 4 ] -> true
 [ 1 1 1 1 1 1 ] -> false
 [ 4 4 4 4 ] -> false
 [ 1 4 4 1 1 4 3 ] -> false
 */

public class MyArray2 extends MyArrayAbsract {

    public MyArray2(int[] arr) {
        super(arr);
    }

    public boolean checkNum(int a, int b) {
        boolean contains = IntStream.of(arr).anyMatch(x -> x == a);
        boolean contains2 = IntStream.of(arr).anyMatch(x -> x == b);
        if (contains && contains2) {
            System.out.println(Arrays.toString(arr) + " --> " + true);
            return true;
        }
        System.out.println(Arrays.toString(arr) + " --> "  + false);
        return false;
    }

}
