import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JMenuTest extends JFrame
{
    private static final long serialVersionUID = 1L;

    public JMenuTest()
    {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());

        setJMenuBar(menuBar);


        menuBar.add(createFileMenu1());
        menuBar.add(createViewMenu());

        setJMenuBar(menuBar);
        menuBar.add(createFileMenu2());
        menuBar.add(createViewMenu());

        setJMenuBar(menuBar);

        setSize(300, 200);
        JButton button1 = new JButton();

        button1.setText("First button");
        button1.setMnemonic('F');
        JButton button2 = new JButton();

        button2.setText("Second button");
        button2.setMnemonic('F');
        JMenuItem exit = new JMenuItem(new ExitAction());
        JTextArea area2 = new JTextArea(1, 100);

        area2.setText("");

        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);


        JPanel contents = new JPanel();
        contents.add(button1, BorderLayout.WEST);
        contents.add(button2,BorderLayout.EAST);
        contents.add(new JScrollPane(area2),BorderLayout.SOUTH);
        setContentPane(contents);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {

        JMenu file = new JMenu("ФАЙЛ");

        JMenuItem open1 = new JMenuItem("СОХРАНИТЬ");


        JMenuItem exit = new JMenuItem(new ExitAction());



        file.add(open1);


        file.addSeparator();
        file.add(exit);


        return file;
    }
    private JMenu createFileMenu1()
    {

        JMenu file = new JMenu("ПРАВКА");

        JMenuItem open1 = new JMenuItem("КОПИРОВАТЬ");
        JMenuItem open2 = new JMenuItem("ВЫРЕЗАТЬТЬ");
        JMenuItem open3 = new JMenuItem("ВСТАВИТЬ");





        file.add(open1);
        file.add(open2);
        file.add(open3);






        return file;
    }
    private JMenu createFileMenu2()
    {

        JMenu file = new JMenu("ПОМОЩЬ");

        JMenuItem open1 = new JMenuItem("ВЫЗВАТЬ САНИТАРОВ");
        JMenuItem open2 = new JMenuItem("ВЫЗВАТЬ КАЩЕНКО");



        JMenuItem exit = new JMenuItem(new ExitAction());



        file.add(open1);
        file.add(open2);







        return file;
    }
    private JMenu createViewMenu()
    {

        JMenu viewMenu = new JMenu();

        return viewMenu;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");

        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {


        new JMenuTest();
    }
}