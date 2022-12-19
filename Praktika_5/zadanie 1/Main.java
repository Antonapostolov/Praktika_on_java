import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame window1 =new JFrame();
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setVisible(true);
        window1.setSize(600,600);
        window1.getContentPane().setLayout(null);
        final int[] n = {0};
        final int[] b = {0};
        JLabel Result=new JLabel("Result:"+ n[0] +"X"+ b[0]);
        Result.setSize(150,25);
        Result.setLocation(300,300);
        window1.add(Result);
        JLabel Last=new JLabel("Last Scorer: N/A");
        Last.setSize(150,25);
        Last.setLocation(300,350);
        window1.add(Last);
        JLabel Winner=new JLabel("Winner: DRAW");
        Winner.setSize(150,25);
        Winner.setLocation(300,400);
        window1.add(Winner);
        JButton AC_Milan=new JButton();
        AC_Milan.setText("AC Milan");
        AC_Milan.setSize(150,150);
        AC_Milan.setLocation(100,100);
        ActionListener ALiistener1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n[0]++;
                Result.setText("Result:"+ n[0] +"X"+ b[0]);
                Last.setText("Last Scorer: AC Milan");
                if(n[0]>b[0]){
                    Winner.setText("Winner: Milan");
                }
                else if(n[0]<b[0]){ Winner.setText("Winner:RealMadrid");
                }
                else if(n[0]==b[0]){ Winner.setText("Winner:Draw");
                }
            }
        };
        AC_Milan.addActionListener(ALiistener1);
        window1.add(AC_Milan);
        JButton Real_Madrid=new JButton();
        Real_Madrid.setText("Real Madrid");
        Real_Madrid.setSize(150,150);
        Real_Madrid.setLocation(400,100);
        ActionListener ALiistener2=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b[0]++;
                Result.setText("Result:"+ n[0] +"X"+ b[0]);
                Last.setText("Last Scorer: Real Madrid");
                if(n[0]>b[0]){
                    Winner.setText("Winner: Milan");
                }
                else if(n[0]<b[0]){ Winner.setText("Winner:RealMadrid");
                }
                else if(n[0]==b[0]){ Winner.setText("Winner:Draw");
                }
            }

        };
        Real_Madrid.addActionListener(ALiistener2);
        window1.add(Real_Madrid);
    }
}