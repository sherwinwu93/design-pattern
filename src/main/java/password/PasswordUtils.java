package password;

/**
 * @author wusd
 * @date 2020/1/10 11:01
 */
public class PasswordUtils {
    public static void main(String[] args) {
        System.out.println(prefix("https://github.com/"));
    }

    public static String prefix(String website) {
        String prefix = "";
        for (int i = 0; i < website.length() % 10; i++) {
            char ch = website.charAt(i);
            int chInt = (int) ch;
            if (Math.abs(chInt) > 9) {
                chInt = chInt % 10 + 1;
            }
            prefix += chInt;
        }
        return prefix;
    }
}
