package excercise.set_insert_sort;


import java.util.Arrays;

public class InsertSort {
    static int[] list = {6,7,4,2,9,12,1};
    static void insertSort(int[] list) {
        int pos, x;
        boolean isTrue = false;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
                list[pos] = x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu là: ");
        System.out.println(Arrays.toString(list));
        insertSort(list);
        System.out.println("Kết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        System.out.println(Arrays.toString(list));
    }
}
