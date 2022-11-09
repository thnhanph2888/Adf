package excercise.stopwatch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        long totalTime;
        System.out.println("running!");
        stopWatch.start();
        int temp;
        int row = 100;
        int column = 600;
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int) Math.ceil(Math.random() * 100);
            }

        }

        for (int l = 0; l < row; l++) {
            for (int m = 0; m < column; m++) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        if (array[l][m] > array[i][j]) {
                            temp = array[l][m];
                            array[l][m] = array[i][j];
                            array[i][j] = temp;
                        }

                    }

                }

            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println("");
        }

        stopWatch.stop();
        totalTime = stopWatch.getElapsedTime();
        System.out.println(totalTime + " ms");
    }
}
