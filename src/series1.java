import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int k =1;
            double s0 = a+(1*b);
            System.out.print(s0);

            for(int j=1;j<n;j++){
                double sj= s0 + Math.pow(2,j)*b;
                System.out.print(" "+sj);
                s0 =sj;
            }
        }

        in.close();
    }
}
