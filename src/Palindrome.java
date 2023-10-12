import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the begining:");
        int a= sc.nextInt();

        System.out.println("enter the end: ");
        int b = sc.nextInt();

        for (int i=a;i<=b;i++){
            if(i==pal(i)){
                System.out.println(i);
            }
        }
    }

    private static int pal(int i) {
        int j=i;
        int x=0;
        int y;
        while (j>0){
            y=j%10;
            x=(x*10)+y;
            j=j/10;

        }
        return x;
    }


}
