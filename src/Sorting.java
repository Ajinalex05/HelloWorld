import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> l = new ArrayList();
        for (int i=0;i<5;i++){
            l.add(scanner.nextInt());
        }
        int i=0;
        //int j =1;
        int k;
        while (i<l.size()-1){
            for (int j =i+1;j<l.size();j++){
                if (l.get(i)>l.get(j)){
                   k = l.get(i);
        System.out.println(k);
                    l.set(i,l.get(j));
        System.out.println(l);
                    l.set(j,k);
                    System.out.println(l);
                }
            }
            i++;
        }
        System.out.println(l);
    }
}
