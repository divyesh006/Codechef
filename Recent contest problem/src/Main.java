import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String [] a = new String[n];
            int count = 0, count1 = 0;
            for (int i = 0;i < n;i++){
                a[i] = sc.next();
            }
            for (int i = 0;i < n;i++){
                if(a[i].equals("START38")){
                    count++;
                }else {
                    count1++;
                }
            }
            System.out.println(count+ " " +count1);
        }
    }
}