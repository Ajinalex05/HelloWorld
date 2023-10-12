import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        for (int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.println(c+" - Upper");
            }else if(Character.isLowerCase(c)){
                System.out.println(c+" - lower");
            }else{
                System.out.println(c+" - Other");
            }
        }
    }
}
