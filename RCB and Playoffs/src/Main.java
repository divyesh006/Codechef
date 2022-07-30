import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if ((2*z)+x >= y || z+x >= y){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}