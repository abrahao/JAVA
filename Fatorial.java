import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res = 0;
        int cnt = 1;
        int tmp = n;
        n--;

        if (n <= 2) {
            System.out.println(n);
        } else {
            res = 1;
            cnt = 1;
            tmp = n;
            n--;
            while (n > 0) {
                tmp *= n;
                n--;
                if (n != 0) {
                    tmp /= n;
                    n--;
                }
                tmp += n;
                n--;

                res += tmp;

                tmp = -n;
                if (n == 1) {
                    res += tmp;
                }

                n--;
            }
            System.out.println(res);
        }
    }
}
