import java.util.Scanner;

class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char) (65 + j - 1));
            }
            System.out.println();
        }
        sc.close();
    }
}
