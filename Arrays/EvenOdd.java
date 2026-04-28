import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1) {
                even++;
            } else {
                if (i % 2 == 0) {
                    odd++;
                }
            }
        }
        System.out.println("even " + even);
        System.out.println("odd " + odd);
        sc.close();
    }
}