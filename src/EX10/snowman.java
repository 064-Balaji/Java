package EX10;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

public class snowman extends JFrame {
    private int imageX;
    private int imageY;
    snowman(){
        JFrame frame =new JFrame();

        JLabel label=new JLabel();

        ImageIcon ogIcon = new ImageIcon("/home/edith/IdeaProjects/Java/src/EX10/snowman.png");
        Image ogImg = ogIcon.getImage();

        int width = 150;
        int height = 250;

        Image scaledImg = ogImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(scaledImg));

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(label);

        frame.add(centerPanel, BorderLayout.CENTER);

        //Buttons
        JPanel buttonPanel = new JPanel();

        BasicArrowButton up =new BasicArrowButton(BasicArrowButton.NORTH);
        BasicArrowButton down= new BasicArrowButton(BasicArrowButton.SOUTH);
        BasicArrowButton right= new BasicArrowButton(BasicArrowButton.EAST);
        BasicArrowButton left= new BasicArrowButton(BasicArrowButton.WEST);

        buttonPanel.add(up, FlowLayout.LEFT);
        buttonPanel.add(down, FlowLayout.CENTER);
        buttonPanel.add(right, FlowLayout.RIGHT);
        buttonPanel.add(left, FlowLayout.LEFT);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        //Button action Listener
        up.addActionListener(e -> moveImage(0, -10, label));
        down.addActionListener(e -> moveImage(0, 10, label));
        right.addActionListener(e -> moveImage(10, 0, label));
        left.addActionListener(e -> moveImage(-10, 0, label));


        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void moveImage(int dx, int dy, JLabel label) {
        imageX += dx;
        imageY += dy;
        label.setLocation(imageX, imageY);
    }

    public static void main(String []args){
        new snowman();
    }
}
