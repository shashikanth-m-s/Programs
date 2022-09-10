import java.util.Scanner;

public class fizzbuzz {
    public static  void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum1 = sum1 + i;
            } else if (i % 3 == 0) {
                sum2 = sum2 + i;
            } else if(i%5==0){
                sum3=sum3+i;
            }


        }
        System.out.println("" + sum1);
        System.out.println("" + sum2);
        System.out.println("" + sum3);
    }
}
