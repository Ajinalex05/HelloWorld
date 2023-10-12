import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(isAmstrongNumber(num)){
            System.out.println("Amstrong Number");
        }else{
            System.out.println(" Not an Amstrong Number");
        }
    }

    public static boolean isAmstrongNumber(int num){
        int n = num;
        int temp = n;
        int count=0;
        int sum=0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = n;
        while (temp>0){
            sum = sum+((int)Math.pow(temp%10,count));
            temp = temp/10;
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }
}
