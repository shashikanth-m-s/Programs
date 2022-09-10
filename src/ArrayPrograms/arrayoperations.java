package ArrayPrograms;

import java.util.Scanner;
class operations{
    int n=6,value,i,pos;
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[n];
    int main() {
        int choice;
            do {
                System.out.println("Arr Operations\n 1.Create\n2.display\n3.insert\n4.delete\n5.exit\n enter choice");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        crete();
                        break;
                    case 2:
                        disply();
                        break;
                    case 3:
                        insert();
                        break;
                    case 4:
                        delete();
                        break;
                    default:
                        System.out.println(" enter choic crctly");
                        break;
                }
            }while(choice>0);
        return 0;
    }
    void crete(){
        System.out.println("hello");

        for (int i = 0; i <5 ; i++) {
            arr[i]= sc.nextInt();
        }
    }
    void disply(){
        System.out.println("hello");
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }

    }
    void insert(){
        System.out.println("pos");
        pos= sc.nextInt();
        System.out.println("enter element");
        value= sc.nextInt();
        for (int i = n-1; i >=pos ; i--) {
            arr[i+1]=arr[i];
        }
        arr[pos]=value;
        n=n+1;
    }
    void delete(){
        System.out.println("enter position");
        pos= sc.nextInt();
        value=arr[pos];
        for (int i = pos; i <n-1 ; i++) {
            arr[i]=arr[i+1];
        }
        n=n-1;
        System.out.println("the element deleted= "+value);
    }
}

public class arrayoperations {
    public static void main(String[] args) {

        operations op=new operations();
        op.main();

    }
}
