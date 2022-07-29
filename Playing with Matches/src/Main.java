import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = a + b;
            int ans = 0;
            while (n != 0){
                int reminder = n % 10;
                switch (reminder){
                    case 0:
                    case 6:
                    case 9:
                        ans = ans + 6;
                        break;
                    case 1:
                        ans= ans + 2;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        ans = ans + 5;
                        break;
                    case 4:
                        ans = ans + 4;
                        break;
                    case 7:
                        ans = ans + 3;
                        break;
                    case 8:
                        ans = ans + 7;
                        break;
                }
                n = n/10;
            }
            System.out.println(ans);
        }
    }
}