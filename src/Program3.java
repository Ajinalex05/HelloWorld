import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
    static List<Integer> l =new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        while(flag){
            String s1 = scanner.nextLine();
        switch (s1){
            case "O":push();
            case "U": pop();
            case "X": flag=false;
            case "P":
            }
            scanner.nextInt();
        }
        System.out.println("[program stopped]");

    }
    public static String push(){
        System.out.print("push data");
        int n1 = scanner.nextInt();
        l.add(n1);
        return "done";
    }

    public static String pop(){
        if(l.size()<=0){
            System.out.println("Empty Stack");
        }else{
            l.get(l.size()-1);
        }
        return "done";
    }

}


