
class Pattern16 {
    public static void main(String[] args) throws java.lang.Exception {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (64 + i));
                // (65+i-1)
            }
            System.out.println();
        }
    }
}