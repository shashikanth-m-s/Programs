package ArrayPrograms;

import java.util.Scanner;

public class linearsearch {
    Scanner sc=new Scanner(System.in);
    public linearsearch(int ar[],int n){
        int key= sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (key==ar[i]){
                System.out.println(key+" element found");
            }else {
                System.out.println(key+" element not found");
            }
            return ;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();


        int ar[]=new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= sc.nextInt();
        }
        linearsearch ls=new linearsearch(ar,n);

    }
}
