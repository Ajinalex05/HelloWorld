import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3og {
    static Scanner scanner= new Scanner(System.in);
    static List<Integer> l= new ArrayList<>();
    public static void main(String[] args) {
        boolean flag= true;
        while (flag){
            System.out.print("Operation P((U))sh or p(O)p or E(X)it: ");
            String s = scanner.nextLine();
            switch (s){
                case "U":{push();}
                break;
                case "O":{pop();}
                break;
                case "X": {
                    flag=false;
                    System.out.println("[program stopped]");
                }
                break;
            }
          //scanner.next();
        }
    }
    public static void push(){
        if(l.size()>=10){
            System.out.println("Stack Overflow");
        }else{
            System.out.print("push data: ");
            int n= scanner.nextInt();
            l.add(n);
        }
    }
    public static void pop(){
        if (l.size()<1){
            System.out.println("Empty Stack");
        }else{
            int n=l.get(l.size()-1);
            System.out.println(n);
            l.remove(n);
        }

    }
}
