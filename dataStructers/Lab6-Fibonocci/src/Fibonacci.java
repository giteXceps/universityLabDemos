import java.util.Scanner;

public class Fibonacci {
    public static long fib(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Bir sayi giriniz:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        

        long startTime = System.currentTimeMillis();
        long result = fib(n);
        long endTime = System.currentTimeMillis();
        double time = (endTime - startTime) / 1000;
        System.out.println("Fibonacci serisi: " + result);
        System.out.println ("Islem süresi: " + ( time + "ms"));
        scanner.close();
    }
}
