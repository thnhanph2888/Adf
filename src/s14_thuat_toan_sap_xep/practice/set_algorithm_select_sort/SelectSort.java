package practice.set_algorithm_select_sort;

public class SelectSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.6};

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length; i++){

            int currenMinIndex = i;
            double currenMin = list[i];
            for (int j = i + 1; j < list.length; j++ ){
                if (currenMin > list[j]) {
                    currenMinIndex = j;
                    currenMin = list[j];
                }
            }

            if (currenMinIndex != i) {
               list[currenMinIndex] = list[i];
               list[i] = currenMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
       for (double e : list){
           System.out.print(e + " ");
       }
    }
}
