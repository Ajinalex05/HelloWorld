import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        List<String> l1 = new ArrayList<>();
        int count =0;
        char j=s1.charAt(1);
        char f = 'a';
        int temp=0;
        String s3="";
        for(int i=0;i<s1.length();i++){
            temp=count;
            f=j;
            if(j==s1.charAt(i)){
                count++;
            }else
            if(i==s1.length()-1){
                System.out.print(j+" "+" "+s1.charAt(i)+" "+(count-1));
            }
            else{
               System.out.print(j+""+count);
                j=s1.charAt(i);
                count=1;

            }

        }
        System.out.print(f+" "+temp);
    }
}
