public class X_pattern {

    public static void main(String[] args) {

       printSquareStar(15);
    }
    public static void printSquareStar(int n) {
        if (n < 5) {
            System.out.println("Invalid value");
        } else {
            for (int i = 0; i < n;  i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j == n - 1 || i == j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
