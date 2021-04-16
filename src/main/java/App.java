public class App {

    public static void main(String[] args) {
        /** задание 1 */

        //1-й вариант создания массива
        MyArray1 arr = new MyArray1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, 4);
        //удаление элементов после последнего (заданного) значения = 4
        arr.info();
        try {
            arr.delAllAfterNum();
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        //2-й вариант создания массива
        MyArray1 a = new MyArray1();
        int [] b = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        //удаление элементов после последнего final значения = 4
        try {
            a.delAllAfterNum(b);
        } catch (RuntimeException e){
            e.printStackTrace();
        }

        /** задание 1 */
        MyArray2 arr2 = new MyArray2(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
        arr2.checkNum(1,4);
    }

}
