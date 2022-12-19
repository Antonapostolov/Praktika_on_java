

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JLabel;


public class Cacultor extends JFrame {

    private JPanel contentPane;
    private JTextArea textArea;
    private JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3, btnNewButton_4,btnNewButton_5,btnNewButton_6,btnNewButton_7,button,button_1, button_2,button_3,button_4,button_5,button_6,button_7, button_8,button_9,button_10,button_11,button_12;
    private String textA = "";
    private String cString = "";
    private JTextField textField;
    private int count = 0;
    private int cleft = 0;
    private int cright = 0;
    private int point = 0;
    private int cnum = 0;
    private int flag = 0;
    private int fsum = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Cacultor frame = new Cacultor();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Cacultor() {
        super("Super intelligent calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 500, 620, 430);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        btnNewButton = new JButton("C");
        btnNewButton.setBounds(10, 78, 83, 44);
        contentPane.add(btnNewButton);

        btnNewButton_1 = new JButton(".");
        btnNewButton_1.setBounds(92, 78, 83, 44);
        contentPane.add(btnNewButton_1);

        btnNewButton_3 = new JButton("BackSace");
        btnNewButton_3.setBounds(174, 78, 200, 44);
        contentPane.add(btnNewButton_3);

        btnNewButton_4 = new JButton("7");
        btnNewButton_4.setBounds(10, 129, 83, 44);
        contentPane.add(btnNewButton_4);

        btnNewButton_5 = new JButton("8");
        btnNewButton_5.setBounds(92, 129, 83, 44);
        contentPane.add(btnNewButton_5);

        btnNewButton_6 = new JButton("9");
        btnNewButton_6.setBounds(174, 129, 83, 44);
        contentPane.add(btnNewButton_6);

        btnNewButton_7 = new JButton("+");
        btnNewButton_7.setBounds(256, 129, 118, 44);
        contentPane.add(btnNewButton_7);

        button = new JButton("4");
        button.setBounds(10, 182, 83, 44);
        contentPane.add(button);

        button_1 = new JButton("5");
        button_1.setBounds(92, 182, 83, 44);
        contentPane.add(button_1);

        button_2 = new JButton("6");
        button_2.setBounds(174, 182, 83, 44);
        contentPane.add(button_2);

        button_3 = new JButton("1");
        button_3.setBounds(10, 236, 83, 44);
        contentPane.add(button_3);

        button_4 = new JButton("2");
        button_4.setBounds(92, 236, 83, 44);
        contentPane.add(button_4);

        button_5 = new JButton("3");
        button_5.setBounds(174, 236, 83, 44);
        contentPane.add(button_5);

        button_6 = new JButton("(");
        button_6.setBounds(10, 288, 83, 44);
        contentPane.add(button_6);

        button_7 = new JButton("0");
        button_7.setBounds(92, 288, 83, 44);
        contentPane.add(button_7);

        button_8 = new JButton(")");
        button_8.setBounds(174, 288, 83, 44);
        contentPane.add(button_8);

        button_9 = new JButton("-");
        button_9.setBounds(256, 182, 118, 44);
        contentPane.add(button_9);

        button_10 = new JButton("x");
        button_10.setBounds(256, 236, 118, 44);
        contentPane.add(button_10);

        button_11 = new JButton("/");
        button_11.setBounds(256, 288, 118, 44);
        contentPane.add(button_11);

        button_12 = new JButton("=");
        button_12.setBounds(10, 337, 364, 44);
        contentPane.add(button_12);

        textField = new JTextField();
        textField.setBounds(10, 10, 364, 44);
        textField.setEditable(false);
        textField.setFont(new Font("Hua Wencaiyun",Font.BOLD, 18));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblByYoungit = new JLabel("by: ТОХИ228");
        lblByYoungit.setBounds(309, 56, 75, 22);
        contentPane.add(lblByYoungit);

        textArea = new JTextArea();
        textArea.setBounds(380, 10, 194, 371);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Hua Wencaiyun",Font.BOLD, 18));
        Color b = new Color(194,214,233);
        Color c = new Color(238,238,238);
        textArea.setBackground(c);
        textArea.setBorder(BorderFactory.createMatteBorder(2,2,2,2,b));
        JScrollPane scrollpane = new JScrollPane(textArea);

        scrollpane.setBounds(384, 10, 210, 371);
        contentPane.add(scrollpane);

        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        button_1.addActionListener(handler);
        button_2.addActionListener(handler);
        button_3.addActionListener(handler);
        button_4.addActionListener(handler);
        button_5.addActionListener(handler);
        button_6.addActionListener(handler);
        button_7.addActionListener(handler);
        button_8.addActionListener(handler);
        button_9.addActionListener(handler);
        button_10.addActionListener(handler);
        button_11.addActionListener(handler);
        button_12.addActionListener(handler);
        btnNewButton.addActionListener(handler);
        btnNewButton_1.addActionListener(handler);
        btnNewButton_3.addActionListener(handler);
        btnNewButton_4.addActionListener(handler);
        btnNewButton_5.addActionListener(handler);
        btnNewButton_6.addActionListener(handler);
        btnNewButton_7.addActionListener(handler);
    }

    public void doInit() {
        textA = "";
        textField.setText(textA);
        count = 0;
        cleft = 0;
        cright = 0;
        point = 0;
        cnum = 0;
        flag = 0;
        fsum = 0;
    }

    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String Ename = e.getActionCommand();
            switch (Ename) {
                case "C":
                    doInit();
                    break;
                case "BackSace":
                    if(fsum==1) {
                        doInit();
                    }
                    try {
                        if(textA.length()>0) {
                            String laString = textA.substring(textA.length() - 1);
                            if(laString.equals(")")) {
                                cleft++;
                            }else if(laString.equals("0")) {
                                cnum = 0;
                            }
                            textA = textA.isEmpty()?"":textA.substring(0,textA.length() - 1);
                            textField.setText(textA);

                            char c = textA.charAt(textA.length()-1);
                            switch (c) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    flag = 1;break;
                                case '+':
                                case '-':
                                case 'x':
                                case '/':
                                    flag = 2;break;
                                case '.':
                                    flag = 3;break;
                                case '(':
                                    flag = 4;break;
                                case ')':
                                    flag = 5;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }catch (Exception e2) {
                        System.err.println("Не удаляйте это");
                    }
                    break;
                case "0":
                    if(fsum==1) {
                        doInit();
                    }
                    if(flag == 2 || flag == 0){
                        cnum = 1;
                        textA = textA + Ename;
                        textField.setText(textA);
                        flag = 1;
                    }else if(flag == 1 || flag == 3|| flag == 4) {
                        textA = textA + Ename;
                        textField.setText(textA);
                        flag = 1;
                    }
                    break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    if(fsum==1) {
                        doInit();
                    }
                    if(flag != 5&&cnum == 0){
                        textA = textA + Ename;
                        textField.setText(textA);
                        flag = 1;
                    }
                    break;
                case "+":
                case "-":
                case "x":
                case "/":
                    if(fsum==1) {
                        doInit();
                        break;
                    }
                    if(flag == 1||flag == 5){
                        textA = textA + Ename;

                        point = 0;
                        cnum = 0;
                        textField.setText(textA);
                        flag = 2;
                    }
                    break;
                case ".":
                    if(fsum==1) {
                        doInit();
                        break;
                    }
                    if(flag == 1&&point == 0) {
                        textA = textA + Ename;
                        point = 1;
                        textField.setText(textA);
                        cnum = 0;
                        flag = 3;
                    }
                    break;
                case "(":
                    if(fsum==1) {
                        doInit();
                    }
                    if(flag == 0 || flag == 2) {
                        textA = textA + Ename;
                        cleft++;

                        textField.setText(textA);
                        flag = 4;
                    }
                    System.out.println("cleft:"+cleft);
                    break;
                case ")":
                    if(fsum==1) {
                        doInit();
                        break;
                    }
                    if(((flag == 1 || flag == 4) && cleft > 0)||(flag == 5 && cleft > 0)) {
                        textA = textA + Ename;

                        cleft--;
                        textField.setText(textA);
                        flag = 5;
                    }
                    System.out.println("cleft2:"+cleft);
                    break;
                case "=":
                    if(fsum==1) {
                        doInit();
                        break;
                    }
                    try {
                        System.out.println("****************************");
                        System.out.println("Expression entered:"+textA);
                        StackToCacultor stackToCacultor = new StackToCacultor();
                        String lastStr = String.valueOf(textA.charAt(textA.length()-1));
                        if(!stackToCacultor.isNum(lastStr)&&!lastStr.equals(")")) {
                            textA = textA.isEmpty()?"":textA.substring(0, textA.length() - 1);
                        }
                        int i = 0,ckey = 0;
                        char c;
                        while (i<textA.length()) {//To make up for)
                            c = textA.charAt(i);
                            if(c=='(') {
                                ckey++;
                            }else if(c==')') {
                                ckey--;
                            }
                            i++;
                        }
                        if(ckey > 0) {
                            for(int j=0;j<ckey;j++) {
                                textA = textA+")";
                            }
                        }
                        System.out.println("Expression passed in for evaluation:"+textA);
                        cString += textA;
                        String text2 = String.valueOf(stackToCacultor.ToCacultor(textA));
                        textField.setText(text2);
                        cString += " = "+text2 + '\n'+"******************"+ '\n';
                        textArea.setText(cString);
                        textA = text2;
                        fsum = 1;
                    }catch (Exception e2) {
                        System.err.println("Please input!");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}