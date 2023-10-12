import java.util.Scanner;

public class TestProgram1 {

    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String s = String.valueOf(num);
        int length = s.length();
        if(length<4){
            System.out.println(s);
        }else{
            String s3="";
            for(int i=0;i<length;i++){
                s3=s3+s.charAt(i);
                if(s3.length()==3){
                    System.out.print(s3);
                    s3="";
                    if(i!=length-1){
                        System.out.print("-");
                    }
                }else if(i==length-3-1){
                    System.out.print(s3);
                    s3 = "";
                    if(i!=length-1){
                        System.out.print("-");
                    }
                }
            }
        }
    }
}
