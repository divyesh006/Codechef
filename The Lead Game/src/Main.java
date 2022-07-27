import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][2];
        int diff = 0;
        int winner = 0;
        int current_diff, player1=0, player2=0;
        for (int i = 0;i < n;i++){
            for (int j = 0; j < 2;j++){
                a[i][j] = sc.nextInt();
            }
            player1 = player1 + a[i][0];
            player2 = player2 + a[i][1];
            current_diff = player1 - player2;
            if (Math.abs(current_diff) > diff){
                diff = Math.abs(current_diff);
                if (current_diff > 0){
                    winner = 1;
                }else {
                    winner = 2;
                }
            }
        }
        System.out.print(winner+ " " +diff);

    }
}