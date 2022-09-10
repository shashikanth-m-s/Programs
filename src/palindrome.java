import java.util.Scanner;

public class palindrome {
    public int display(int n){
        int digit,rev=0;
        int temp=n;
        while(n!=0){
            digit=n%10;
            n=n/10;
            rev=digit+10*rev;
        }

        if(temp==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        return rev;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        palindrome pl= new palindrome();
        pl.display(n);
    }
}
