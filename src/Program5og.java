import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Program5og {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        List<Character> l1= new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if(!l1.contains(s.charAt(i))){
                l1.add(s.charAt(i));
            }
        }
        int count=0;
        for (int i=0;i<l1.size();i++){
            for (int j=0;j<s.length();j++){
                if(l1.get(i)==s.charAt(j)){
                    count++;
                }
            }
            System.out.print(l1.get(i)+""+count);
            count=0;
        }
    }
}
