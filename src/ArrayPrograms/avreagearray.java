package ArrayPrograms;

import java.util.Scanner;

public class avreagearray {
    public double sumaverage(double a[],int n){
        int i; double sum=0;
        double psum=0,nsum=0;
        for (i= 0; i <n; i++) {
            if(a[i]>0) {
                psum = psum + a[i];
            }else{
                nsum=nsum+a[i];
            }
        }
        double s=(psum+nsum)/n;
        System.out.println("avreage= "+s);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        double a[]=new double[n];
        for (int i = 0; i <n ; i++) {
            a[i]= sc.nextDouble();
        }
        avreagearray ar=new avreagearray();
        ar.sumaverage(a,n);
    }
}
