public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {3,10,99,1, 67, 4, 2,9,34,54};
        int x=0;
        int l = ar.length - 1;
        while (l>0) {
            for(int i=0;i<l;i++){
                if(ar[i]>ar[i+1]){
                    sap(ar,i,i+1);
                }
                x++;
            }
            l--;
        }
        for(int a: ar){
            System.out.print(a+" ");
        }
        System.out.println("\n"+x);
    }
    public static void sap(int[] ar,int i,int j){
        int k;
        k = ar[i];
        ar[i]= ar[j];
        ar[j] = k;

    }
}
