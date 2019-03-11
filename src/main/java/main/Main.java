package main;

import view.MainFrame;
import view.Visual;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Visual.setVisual("Nimbus");
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
}
