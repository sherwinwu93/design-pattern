package headfirst.c08.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @author Wusd
 * @date 2025/8/26
 * @description
 */
public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 300);
        setVisible(true);
    }
    // 默认情况,paint是不做事情的,她是钩子
    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
