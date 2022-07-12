package view;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
    private static final long serialVersionUID = 5744458576894912268L;
	private static MyJFrame myFrame;

    private MyJFrame() {
        

    }

    public static MyJFrame getMyFrame() {
        if (myFrame == null) {
            myFrame = new MyJFrame();
        }
        return myFrame;
    }

   
}
