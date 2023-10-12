import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> l = new ArrayList<>();
        String s1="";
        for(int i=0;i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            System.out.println(c);
            String c1=" ";

            if(c.equals(" ") || i==s.length()-1){
                System.out.println("in c space check");
                if(i==s.length()-1){
                    s1=s1+c;
                    System.out.println("check in last "+s1);
                }
                if(pal(s1)) {
                    l.add(s1);
                }
                s1="";
            }else {
                s1=s1+c;
                System.out.println(s1);
            }
        }
        System.out.println(l);
        int count=0;
        List<String> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        for (int j =0; j<l.size();j++){
            for(int k=0;k<l.size();k++){
                if(l.get(j).toUpperCase()==l.get(k).toUpperCase() && !l2.contains(l.get(j))){
                    count++;
                }
            }
            if(!l2.contains(l.get(j))){
                l2.add(l.get(j));
                l3.add(count);
            }

            System.out.println(l2);
            System.out.println(l3);

        }
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
