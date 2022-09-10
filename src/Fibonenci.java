import java.util.Scanner;

public class Fibonenci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,p=0,q=1,r;
        n=sc.nextInt();
        if(n==1){
            System.out.println(""+p);
        }else
        {
            System.out.println(p+"\n"+q);
            for (int i=3;i<=n;i++){
                r=p+q;
                System.out.println(+r);
                p=q;
                q=r;
            }
        }


    }
}
