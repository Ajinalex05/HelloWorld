import java.util.Scanner;

public class arraySort {
        // write code here
        public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

          int[] ab = new int[5];
        System.out.println("ab : "+ ab);
//
        int[] aa = getIntegers(5);
        int[] bb = sortIntegers(aa);
        printArray(bb);
        for(int i=0; i<5;i++) {
            System.out.println("array " + aa[i]);
        }
    }


        public static int[] getIntegers(int n){

            int[] value = new int[n];
            for(int i=0; i<value.length; i++){
                value[i] = scanner.nextInt();
                System.out.println("entered no is: "+value[i]);
            }
            return value;
        }

        public static void printArray(int[] a){
            for(int i=0;i<a.length;i++){
                System.out.println("Element "+i+" contents "+ a[i]);
            }
        }

        public static int[] sortIntegers(int[] a){
            int b;
            for(int i=0; i<a.length; i++){
                for(int j=i; j<a.length;j++){
                    if(a[i]<a[j]){
                        b = a[i];
                        a[i] = a[j];
                        a[j] = b;
                    }
                }
            }
            return a;
        }

}
