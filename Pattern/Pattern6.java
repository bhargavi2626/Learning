import java.util.Scanner;

class Pattern6 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}