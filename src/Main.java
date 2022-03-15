import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Dynamic Array manually
        Array numbers = new Array(1);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(10));
        numbers.print();

        //Another Dynamic Arrays Vector(Synchronous) & Arraylist
        //Integer = Wrapper Class, int = primitive type
        ArrayList<Integer> items = new ArrayList<>();
        items.add(10);
        items.add(20);
        items.add(30);
        items.add(40);
        System.out.println(items);
        System.out.println(items.indexOf(30));

        //Linked List
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        var array = list.toArray();
        System.out.println(Arrays.toString(array));

        var linkedList = new LinkedList();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        linkedList.removeLast();
        System.out.println(linkedList.contains(50));
    }
}
