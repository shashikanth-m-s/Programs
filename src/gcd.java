import java.util.Scanner;

public class gcd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m,n,r;
        m=sc.nextInt();
        n=sc.nextInt();
        int lcm=m*n;
        while(n!=0) {
            r = m % n;
            m=n;
            n=r;

        }
        System.out.println("gcd= "+m);
        int reslcm= lcm/m;
        System.out.println("lcm= "+reslcm);


    }
}
