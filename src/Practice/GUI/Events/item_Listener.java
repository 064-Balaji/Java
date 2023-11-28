package Practice.GUI.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class item_Listener extends JFrame implements ItemListener {

    JCheckBox check = new JCheckBox("Java");
    JCheckBox check1 = new JCheckBox("C");
    JLabel jl= new JLabel();
    item_Listener(){
        JPanel p= new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        p.add(check);
        p.add(check1);
        p.add(jl);

        add(p);

        check.addItemListener(this);
        check1.addItemListener(this);

        setSize(600, 400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == check && e.getStateChange() == ItemEvent.SELECTED)
            jl.setText(check.getText()+" is selected");
        if(e.getSource() == check1 && e.getStateChange() == ItemEvent.SELECTED)
            jl.setText(check1.getText()+ " is selected");
    }
    public static void main(String []args){
        new item_Listener();
    }
}
