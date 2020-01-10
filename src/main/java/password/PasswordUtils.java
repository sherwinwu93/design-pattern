package password;

import java.util.Scanner;

/**
 * @author wusd
 * @date 2020/1/10 11:01
 */
public class PasswordUtils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String next = scan.next();
            System.out.println(prefix(next));
        }
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
        prefix = String.format("%07d", Integer.valueOf(prefix));
        return prefix;
    }
}
