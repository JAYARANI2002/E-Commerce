public class ZigZagPrint {
    public static void printZigZag(String s, int k) {
        if (k <= 1) {
            System.out.println(s);
            return;
        }

        int n = s.length();
        char[] str = s.toCharArray();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) 
            {
                int m=2*( k - 1);
                if (j % m== i || (j % m== m - i) ){
                    System.out.print(str[j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRINGPAYPALISHIRING";
        int k = 5;
        printZigZag(input, k);
    }
}
