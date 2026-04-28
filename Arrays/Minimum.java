import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = n;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}
