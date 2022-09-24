import java.util.List;

public class StreamSort {
    public static void main(String[] args){
        List<Integer> l = List.of(12,15,8,49,25,98,98,32,15);
        List<Integer> l2;
        System.out.println("Descending order");

        System.out.println("Descending order");
        l.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
       // System.out.println(l2);
    }
}
