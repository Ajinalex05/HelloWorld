
//program to find min and max value from a set of input value

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       int i=1;
       while (true){
           System.out.println("Enter number #"+i);
           boolean isint= sc.hasNextInt();
           if (isint){
               int n = sc.nextInt();
               if (n<min){
                   min=n;
               }
               if (n>max){
                   max=n;
               }
               i++;
           }else {
               System.out.println("Invalid Input ");
               break;
           }
           sc.nextLine();
       }


        System.out.println("min of the number is : "+min+" \n max of the number is :"+max);
    }
}
