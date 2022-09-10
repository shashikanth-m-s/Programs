import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.add("9");
    System.out.println("intially are :"+ll);
    ll.addFirst("1");
    ll.addLast("10");
    System.out.println("2ndly :"+ll);
    ll.add(1,"2");
        System.out.println("3rd step are :"+ll);
        ll.add(2,"3");
        ll.add(3,"4");
        ll.add(4,"5");
        ll.add(5,"6");
        ll.add(6,"7");
        ll.add(7,"8");
        System.out.println("4th step are :"+ll);
        // AddFirst and offerFirst()
        ll.offerFirst("B") ;
        ll.addFirst("A");
        System.out.println("values are :"+ll);
        // AddLast and offerLast()
        ll.addLast("Y");
        ll.offerLast("Z");
        System.out.println("values are :"+ll);
        //#remove
        ll.remove("Y");
        ll.remove(1);
        System.out.println("values are :"+ll);
        // get and peek
        System.out.println(ll.getFirst());
        System.out.println(ll.peekLast());

        //change
        System.out.println(ll.indexOf("Z"));
        String s= (String) ll.get(11);
        ll.set(11,s+"changed");
        System.out.println("values are :"+ll);
        //remove poll
        ll.removeFirst();
        ll.pollLast();

        System.out.println("values are :"+ll);

        ll.clear();
        ll.addFirst("Java");
        System.out.println(":"+ll.size());

}
}