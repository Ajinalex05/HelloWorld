import java.util.Scanner;
public class Program555 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count=0;
        char j= s.charAt(0);
        for (int i=0;i<s.length();i++){
            if (j == s.charAt(i)) {
                count++;
            }else{
                System.out.print(j+""+count);
                count=1;
                j=s.charAt(i);
            }
            if(i==(s.length()-1)){
                System.out.print(j+""+count);
            }
        }
    }
}
