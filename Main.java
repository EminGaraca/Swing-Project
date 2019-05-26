package swingassignment;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int yourSide = JOptionPane.showOptionDialog(null, "Choose option", "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Settings", "Close"}, null);

        switch (yourSide) {
            case JOptionPane.YES_OPTION:
                NewJFrame frame=new NewJFrame();
                frame.setVisible(true);                
                break;                
            case JOptionPane.NO_OPTION:
                System.exit(0);               
                break;
        }
      
    }

}
