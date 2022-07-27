import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int c = sc.nextInt();
            if (c <= 20){
                System.out.println("COLD");
            }else {
                System.out.println("HOT");
            }
        }
    }
}