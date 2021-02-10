


import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Mechanics mechanics = new Mechanics();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Vapor Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(mechanics);

    }
}
