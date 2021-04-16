import org.junit.Assert;
import org.junit.Test;


public class MyArray1Test {

    private static MyArray1 myArray = new MyArray1();


    @Test
    public void testDelAllAfterNum() {
        myArray = new MyArray1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, 4);
        int[] b = new int[]{1, 2, 4, 4, 2, 3, 4};
        Assert.assertArrayEquals(myArray.delAllAfterNum(), b);

    }
    @Test
    public void testDelAllAfterNum2() {
        myArray = new MyArray1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, 3);
        int[] b = new int[]{1, 2, 4, 4, 2, 3};
        Assert.assertArrayEquals(myArray.delAllAfterNum(), b);
    }
    @Test
    public void testDelAllAfterNum3() {
        myArray = new MyArray1(new int[]{1, 2, 2, 3, 1, 7}, 4);
        int[] b = new int[0];
        try {
            Assert.assertArrayEquals(myArray.delAllAfterNum(), b);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDelAllAfterNum4() {
        myArray = new MyArray1(new int[]{}, 4);
        int[] b = new int[0];
        try {
            Assert.assertArrayEquals(myArray.delAllAfterNum(), b);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}