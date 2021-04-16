import java.util.Arrays;
import java.util.stream.IntStream;

/**
 1. Написать метод, которому в качестве аргумента передается не пустой одномерный
 целочисленный массив. Метод должен вернуть новый массив, который получен путем
 вытаскивания из исходного массива элементов, идущих после последней четверки. Входной
 массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить
 RuntimeException.
 Написать набор тестов для этого метода (по 3-4 варианта входных данных).
 Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

 */
public  class MyArray1 extends MyArrayAbsract{

    public MyArray1(int[] arr, int num) {
        super(arr, num);
    }

    public MyArray1() {
    }

    public int[] delAllAfterNum(int[] arr) {
        int[] arr2 = new int[0];
        boolean contains = IntStream.of(arr).anyMatch(x -> x == num);
        if (contains) {
            for (int i = arr.length - 1; i > 0; --i) {
                if (arr[i] == num) {
                    arr2 = new int[i + 1];
                    System.arraycopy(arr, 0, arr2, 0, i + 1);
                    break;
                }
            }
        }else {
            throw new RuntimeException("В массиве должна быть цифра " + num);
        }
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    public int[] delAllAfterNum() {
        int[] arr2 = new int[0];
        boolean contains = IntStream.of(arr).anyMatch(x -> x == num);
        if (contains) {
            for (int i = arr.length - 1; i > 0; --i) {
                if (arr[i] == num) {
                    arr2 = new int[i + 1];
                    System.arraycopy(arr, 0, arr2, 0, i + 1);
                    System.out.println(Arrays.toString(arr2));
                    break;
                }
            }
        }else {
            throw new RuntimeException("В массиве должна быть цифра " + num);
        }
        return arr2;
    }


}






