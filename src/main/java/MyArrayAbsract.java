import java.util.Arrays;

public abstract class MyArrayAbsract {

    protected int num;
    protected int [] arr;
    protected final int NUM = 4;

    public MyArrayAbsract(int[] arr, int num) {
        this.arr = arr;
        this.num = num;
    }
    public MyArrayAbsract() {
        this.arr = new int[0];
        this.num = NUM;
    }
    public MyArrayAbsract(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
    public void info() {
        System.out.println(toString());
    }
}
