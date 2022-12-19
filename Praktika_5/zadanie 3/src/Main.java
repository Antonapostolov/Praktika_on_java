
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;


public class Main extends JComponent implements KeyListener, ActionListener {
    Scanner a1=new Scanner(System.in);

    public void paint(Graphics g){
        Graphics2D gr=(Graphics2D) g;
        String h=a1.nextLine();
        Image grass=new ImageIcon(h).getImage();
        gr.drawImage(grass,0,0,null);
    }
    public static void main(String[] args) {
        Main t =new Main();
        JFrame f =new JFrame("Kapibara");
        f.setSize(600,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}