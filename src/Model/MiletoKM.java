package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiletoKM extends JFrame implements ActionListener {
    JTextField name;
    JTextField pass;
    Popup p;
    MiletoKM(){
        JPanel p1= new JPanel();
        JPanel p2= new JPanel();
        JPanel p3= new JPanel();
        JPanel p4 = new JPanel();
        JLabel uname=new JLabel("Username: ");
        JLabel passl=new JLabel("Password: ");
        name=new JTextField(10);
        pass=new JTextField(10);
        p1.add(uname);
        p1.add(name);
        p2.add(passl);
        p2.add(pass);

        JButton jb=new JButton("Submit");
        p3.add(jb);

        jb.addActionListener(this);

        PopupFactory pf= new PopupFactory();
        JLabel lb= new JLabel("Login Successfull");
        p4.add(lb);

        JFrame f=new JFrame();
        p= pf.getPopup(f, p4, 180, 100);


        add(p1);
        add(p2);
        add(p3);
        add(Box.createVerticalGlue());
        add(Box.createVerticalStrut(1));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String use1= name.getText();
        String pas1= pass.getText();

        if(use1.equals("balaji")&&pas1.equals("123")){
            p.show();
        }
    }
    public static void main(String []args){
        new MiletoKM();
    }
}
