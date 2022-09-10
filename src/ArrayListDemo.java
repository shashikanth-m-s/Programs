import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        /*al.add("2");
        al.add("3");
        al.add("Shashikanth");
        al.remove(2);*/
        al.toArray();


        System.out.println(al.size());
        System.out.println(al);


    }
}