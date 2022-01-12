package pane;

import javax.swing.*;

public class name {
    public static void main(String[] args) {
        String f_name,l_name;

        f_name= JOptionPane.showInputDialog("ENTER YOUR FIRST NAME");
        l_name= JOptionPane.showInputDialog("ENTER YOUR LAST NAME");
        JOptionPane.showInputDialog(null,("Your name is "+f_name+" "+l_name));
    }
}
