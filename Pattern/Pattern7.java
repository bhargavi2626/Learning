import java.util.Scanner;

class Pattern7 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // or for (int j = 1; j < 2 * i; j++)
            for (int j = 1; j < i + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}