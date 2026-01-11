import java.util.Scanner;

class Pattern14 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
        sc.close();
    }
}