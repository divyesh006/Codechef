import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int A,B;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            A = Math.max(a, b);
            B = Math.max(c, d);
            System.out.println(A+B);
        }
    }
}