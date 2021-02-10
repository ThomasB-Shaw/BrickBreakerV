import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Mechanics extends JFrame implements KeyListener, ActionListener {
    private boolean play = false;
    private int score = 0;
    private int totalBricks = 21;
    private Timer timer;
    private int delay = 8;
    private int playerX = 310;
    private int ballposx = 120;
    private int ballposy = 350;
    private int balldirx = -1;
    private int balldiry = -2;

    public Mechanics() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();

    }

    public void paint(Graphics g) {
        //Background
        g.setColor(Color.black);
        g.fillRect(1,1,692,592);

        //Borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,592);
        g.fillRect(0,0,692,3);
        g.fillRect(691,0,3,592);

        //Bar
        g.setColor(Color.green);
        g.fillRect(playerX, 550, 100, 8);

        //Ball
        g.setColor(Color.yellow);
        g.fillRect(ballposx, ballposy, 20, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >= 600){
                playerX = 600
            } else {
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
