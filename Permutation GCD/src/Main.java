import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (x < n){
                System.out.println("-1");
                continue;
            }
            System.out.println(x-n+1 +" ");
            for (int i =1; i <= n; i++){
                if (i != x-n+1){
                    System.out.println(i + " ");
                }
            }
            System.out.println("\n");
        }
    }
}