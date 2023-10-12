import java.util.Scanner;

public class Palindrom_Og {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String s = scanner.nextLine();
        int n= s.length()/2;
        boolean flag = true;
        String s2=s.toUpperCase();
        for (int i =0; i<n;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag=false;
            }
        }
        if(flag){
            System.out.println(s2+" is a p");
        }else {
            System.out.println(s+" not a p");
        }

    }
}
