import org.junit.Assert;
import org.junit.Test;

public class MyArray2Test {
    private static MyArray2 myArray;

    @Test
    public void testCheckNum() {
        myArray = new MyArray2(new int[]{1, 1, 1, 4, 4, 1, 4, 4});
        Assert.assertEquals(myArray.checkNum(1,4), true);
    }

    @Test
    public void testCheckNum2() {
        myArray = new MyArray2(new int[]{1, 1, 1, 1, 1, 1 });
        Assert.assertEquals(myArray.checkNum(1,4), false);
    }

    @Test
    public void testCheckNum3() {
        myArray = new MyArray2(new int[]{});
        Assert.assertEquals(myArray.checkNum(1,4), false);
    }



}