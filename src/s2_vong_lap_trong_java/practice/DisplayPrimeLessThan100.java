package s2_vong_lap_trong_java.practice;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        int prime = 0;
        boolean isPrime = true;
        while (prime < 100) {
             if (prime >= 2) {
                 for (int i = 2; i <= Math.sqrt(prime); i++) {
                     if (prime % i == 0) {
                         isPrime = false;
                         break;
                     }
                 }
                 if (isPrime) {
                     System.out.println(prime);
                 }
                 isPrime = true;
             }
             prime++;
        }
    }
}
