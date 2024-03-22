import java.util.Scanner;
public class Factorial02 {

    public static void main(String[] arags) {
        Scanner sc = new Scanner(System.in);
        Factorial3 a = new Factorial3();

        System.out.println(a.fibonacci(sc.nextInt()));
    }

    int fibonacci(int n) {
        int result = 0;
        if (n < 1)
            return result = n;
        
        return result = fibonacci(n-1) + fibonacci(n-2);       
    }


}