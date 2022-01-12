package pane;

import javax.swing.*;

public class menu {
    public static void main(String[] args) {

        String order;

        char option;

        order=JOptionPane.showInputDialog("INSERT YOUR ORDER");
        option=order.charAt(0);

        switch (option) {
            case 'A':
                JOptionPane.showMessageDialog(null, ("YOU HAVE ORDERED FOR CHAPATI AND MADONDO"));
                break;
            case 'B':
                JOptionPane.showMessageDialog(null, ("YOU HAVE ORDERED FOR UGALI AND WHISKEY"));
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, ("YOU HAVE ORDERED FOR FISH AND CHIPS"));
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, ("YOU HAVE ORDERED FOR LOBSTER AND YAM"));
                break;
            default:
                JOptionPane.showMessageDialog(null, ("THAT'S NOT READY YET"));
        }
    }
}
