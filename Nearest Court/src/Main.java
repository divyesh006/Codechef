import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = Math.abs(x - (x+y)/2);
            int b = Math.abs(y - (x+y)/2);
            System.out.println(Math.max(a,b));
        }
    }
}