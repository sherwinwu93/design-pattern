package headfirst.c03.myio;

import java.io.*;

/**
 * @author Wusd
 * @date 2025/8/18
 * @description
 */
public class UpperCaseInputStream extends FilterInputStream {
    protected UpperCaseInputStream(InputStream in) {
        super(in);
    }
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toUpperCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toUpperCase((char) b[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        InputStream in = null;
        try {
             in = new UpperCaseInputStream(
                    new BufferedInputStream(new FileInputStream("D:\\sherwinD\\wusd\\design-pattern\\src\\main\\java\\headfirst\\c03\\myio\\test.txt"))
            );
            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
