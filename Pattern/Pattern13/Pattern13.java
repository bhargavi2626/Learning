import java.util.Scanner;

class Pattern13 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}