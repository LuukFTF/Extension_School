package nl.dragontamerfred.extension;

import javax.swing.*;

public class Main {

    private static JFrame frame = new JFrame("");
    private static JLabel lbl1 = new JLabel();
    private static JButton btn1 = new JButton();

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(300, 400, 400, 400);

        lbl1.setText("sample Text");
        lbl1.setBounds(100, 10, 100, 20);

        btn1.setText("Sample Button");
        btn1.setBounds(100, 30, 200, 20);

        frame.add(btn1);
        frame.add(lbl1);
    }
}
