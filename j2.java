import java.util.*;
public class j2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");

        list1.add("Wednesday");
        list1.set(1,"sunday");
        System.out.println(list.get(1));

        System.out.println(list1.getClass().getName());
        
        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);

    }
}
