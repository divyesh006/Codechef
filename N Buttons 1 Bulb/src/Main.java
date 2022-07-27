import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int count = 0;
            for (int i = 0;i < n;i++){
                if (s1.charAt(i) != s2.charAt(i)){
                    count++;
                }
            }
            if (count % 2 == 0){
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }
    }
}