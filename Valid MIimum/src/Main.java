import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && b == c){
                System.out.println("Yes");
            } else if (a == b && b != c) {
                if (b < c){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            } else if (a != b && b == c) {
                if (b < a){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            } else if (a == c && a != b) {
                if (a < b){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else {
                System.out.println("No");
            }
        }
    }
}