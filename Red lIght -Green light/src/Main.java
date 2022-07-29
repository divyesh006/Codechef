import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            int [] a = new int[n];
            int count = 0;
            for (int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                if (a[i] > h){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}