import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        switch(number){
            case 1: System.out.println("sun");break;
            case 2: System.out.println("mon");break;
            case 3: System.out.println("tue");break;
            case 4: System.out.println("w");break;
            case 5: System.out.println("thu");break;
            case 6: System.out.println("fri");break;
            case 7: System.out.println("sat");break;
            default:System.out.println(" invalid ");
        }
    }
}
