import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_1 {

        public static void main(String args[]){
            List<String> nameList = new ArrayList<>();
            nameList.add("Ajin");
            nameList.add("Abin");
            nameList.add("Pranav");
            nameList.add("Robin");
            String[] array = nameList.toArray(new String[nameList.size()]);
            System.out.println("Printing Array: "+ Arrays.toString(array));
            System.out.println("Printing List: "+nameList);
            for(String s:nameList){
                System.out.println(s);
            }
        }

}
