package ArrayPrograms;

import java.util.Scanner;

public class PositionLargest {
    public PositionLargest(int a[],int n){
        int i,pos=0;
        for ( i = 0; i <n ; i++) {
            if(a[i]>a[pos])
                pos=i;
        }
        System.out.println(pos+1);
        System.out.println(a[pos]);
    }
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        int n= ss.nextInt();;
        int a[]=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]= ss.nextInt();
        }
        PositionLargest pl=new PositionLargest(a,n);

    }
}
