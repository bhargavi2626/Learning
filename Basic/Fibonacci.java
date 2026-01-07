import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0, second = 1;
        int third, count = 0;
        System.out.println(+first + "\n" + second + " ");
        while (count < n) {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            count++;
        }
        sc.close();
    }
}