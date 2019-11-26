import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("from");
//        int start = scanner.nextInt();
//        System.out.println("till");
//        int end = scanner.nextInt();
//        System.out.println(start + end);
//        for (int i = start; i<= end; i++){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isPrime(int n){
//        if (n<=1){
//            return false;
//        }
//        for (int i = 2; i <=Math.sqrt(n); i++) {
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;


//        int j;
//        int from = 0;
//        int to = 10000;
//        boolean isPrime;
//        isPrime = true;
//        String primeNum = "";
//        for (j = 1; j <=to ; j++) {
//            isPrime = CheckPrime(j);
//            if (isPrime){
//                primeNum = primeNum + j + " ";
//            }
//        }
//        System.out.println("Prime numbers " + to );
//        System.out.println(primeNum);
//    }
//    public static boolean CheckPrime(int Check){
//        int remainder;
//        for (int i = 2; i <=Check ; i++) {
//            remainder = Check%i;
//
//            if (remainder==0){
//                return false;
//            }
//        }
//        return true;

        int i;
        int num = 0;
        int max = 10000;
        boolean isPrime = true;
        String primeNum = "";
        for (i = 1; i <= max; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNum = primeNum + i + " ";
            }
        }
        System.out.println("Prime numbers " + max );
        System.out.println(primeNum);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}

