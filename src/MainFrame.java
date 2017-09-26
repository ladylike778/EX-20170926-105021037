import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
    private JButton b1=new JButton("EXIT");
    private JButton b2=new JButton("ADD");
    private JLabel l3=new JLabel("✌三(✌'ω')✌三✌");
    private JLabel l4=new JLabel("v(≧∇≦v)三(v≧∇≦)v");
    private JLabel l5=new JLabel("( =￣+∇￣=)v");
    private int ao=0;
    private int aa=0;
    private int bb=0;
    private int cc=0;
    private int ac=1;
    private int ad=3;
    private int ae=6;
    private  Timer t1;
    private  Timer t2;
    private  Timer t3;
    private  Timer t4;
    public MainFrame(){
        init();
    }
    private void init(){
        Random ran=new Random();
        this.setBounds(100,100,500,500);
        this.setLayout(null);
        b1.setBounds(100,400,150,50);
        b2.setBounds(300,400,150,50);
        l3.setBounds(100,220,150,50);
        l4.setBounds(100,300,150,50);
        l5.setBounds(200,150,150,50);
        this.add(b1);
        this.add(b2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
        t1=new Timer(3, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ao++;MainFrame.this.setTitle(Integer.toString(ao));
                l3.setLocation(ac,100);

                if(ac==380){
                    aa=1;
                }else if(ac==0){
                    aa=0;
                } if(aa==1){
                    ac--;

                }else if(aa==0){
                    ac++;

                }
            }
        });t2=new Timer(6, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l4.setLocation(ad,200);
                if(ad==380){
                    bb=1;
                }else if(ad==0){
                    bb=0;
                } if(bb==1){
                    ad--;
                }else if(bb==0){
                    ad++;
                }
            }
        });t3=new Timer(ran.nextInt(20), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                l5.setLocation(ae,300);
                if(ae==380){
                    cc=1;
                }else if(ae==0){
                    cc=0;
                } if(cc==1){
                    ae--;
                }else if(cc==0){
                    ae++;
                }
            }
        });



        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        b2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
                t2.start();
                t3.start();




            }
        });

    }

}
