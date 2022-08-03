import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((n/a)*x > (n/b)*y){
                System.out.println("DIESEL");
            } else if ((n/a)*x < (n/b)*y) {
                System.out.println("PETROL");
            }else {
                System.out.println("ANY");
            }
        }
    }
}