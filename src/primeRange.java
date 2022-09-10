import java.util.Scanner;

public class primeRange {
    public int display(int n){

        for(int i=2;i<=n/2;i++) {
            if (n % i == 0) {
               // System.out.println(n + "is not prime ");
                return 0;
            }
        }
        System.out.println(n+" ");
        return 0;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        primeRange pr=new primeRange();
        for (int i = n; i < m; i++) {
            pr.display(i);
        }

    }
}
