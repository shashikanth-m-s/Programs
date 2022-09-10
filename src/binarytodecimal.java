import java.util.Scanner;
public class binarytodecimal {
    public int display(int n){
        int sum=0,base=1,digit;
        while(n!=0){
            digit=n%10;
            n=n/10;
            sum=sum+digit*base;
            base=base*2;
        }
        System.out.println(""+sum);
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binarytodecimal bd =new binarytodecimal();
        bd.display(n);
    }
}
