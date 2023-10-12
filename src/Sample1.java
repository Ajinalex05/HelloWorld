import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1= scanner.nextLine();
        String s= s1+" ";
        List<String> l1= new ArrayList<>();
        String s2="";
        for (int i=0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(c.equals(" ")){
                if(pal(s2)){
                    l1.add(s2);
                }
                s2="";
            }else {
                s2 = s2 + s.charAt(i);
            }
        }
        int c=0;
        List<String> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<String> l5 = new ArrayList<>();
        for (int i=0;i<l1.size();i++){
            for (int j=0;j<l1.size();j++) {
                String s4=l1.get(i).toUpperCase();
                String s5 = l1.get(j).toUpperCase();
                if (s4.equals(s5) && !l5.contains(l1.get(i).toUpperCase())) {
                    c++;
                }

            }
            if(!l5.contains(l1.get(i).toUpperCase())) {
                l3.add(l1.get(i));
                l5.add(l1.get(i).toUpperCase());
                l4.add(c);
            }
            c=0;
        }
        int x=0;
        for (int i=0;i<l4.size();i++){
            x=x+l4.get(i);
        }
        System.out.print(x+" (");
        for (int i=0;i<l3.size();i++){
            System.out.print(String.format("%s - %s time",l3.get(i),l4.get(i)));
            if(i!=l3.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }
    public static boolean pal(String c){
        if (c.length()<=1){
            return false;
        }else{
            String s2=c.toUpperCase();
            for (int i =0; i<c.length();i++){
                if(s2.charAt(i)!=s2.charAt(s2.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}

