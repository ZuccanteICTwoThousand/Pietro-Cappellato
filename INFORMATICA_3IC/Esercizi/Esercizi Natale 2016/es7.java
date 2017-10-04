
public class es7 {

    public static boolean primo(int n) {
        if (n < 2) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i < n; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
