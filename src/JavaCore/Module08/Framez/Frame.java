package JavaCore.Module08.Framez;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Frame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();// create frame
        jf.setSize(400, 300);// setting frame size

//        new MyFrame();// to check MyFrame working


//        jf.addMouseListener(new SimpleClickListener());
//        jf.setVisible(true);

        jf.addMouseMotionListener(new MouseMotionListener() {// alternative with anonymous class
            @Override
            public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println(e.getX() + ", " + e.getY());
            }
        });

    }
}

//class SimpleClickListener implements MouseListener {// listener of mouse click events
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        // TODO Auto-generated method stub
//    }
//}

class MyFrame extends JFrame {
    public MyFrame() {
        setSize(400, 300);
        setVisible(true);

        addMouseListener(new MouseAdapter() {// another 1 example with anonymous class
            // Это класс окна, которое при нажатии на него центрируется относительно места нажатия
            @Override
            public void mousePressed(MouseEvent e) {
                setLocation(e.getXOnScreen() - getWidth() / 2, e.getYOnScreen() - getHeight() / 2);
            }
        });
    }
}