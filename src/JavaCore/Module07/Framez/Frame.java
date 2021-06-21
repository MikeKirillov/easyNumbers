package JavaCore.Module07.Framez;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();// create frame

        jf.setSize(400, 300);// setting frame size

        jf.addMouseListener(new SimpleClickListener());
        jf.setVisible(true);

    }
}

class SimpleClickListener implements MouseListener {// listener of mouse click events
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }
}