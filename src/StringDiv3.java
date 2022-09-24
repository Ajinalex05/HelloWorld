import java.util.Scanner;

public class StringDiv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numb = sc.nextLine();
        int rem = numb.length() % 3;
        int n = numb.length() - 1;
        String s = "";
        int k=3;
            for (int i = 0; i <= n; i++) {
                s = s + numb.charAt(i);
                if((rem==1) && (n-i<4)) {
                    k = 2;
                }
                if (s.length() == k) {
                    System.out.print(s);
                    s = "";
                    if (i != n) {
                        System.out.print("-");
                    }
                }
            }
            System.out.print(s);
        }
    }