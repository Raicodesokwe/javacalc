package pane;

import javax.swing.*;
public class Numsub {
    public static void main(String[] args){
        String fnum,snum;
        double fnumCon,snumCon,answer;

        fnum= JOptionPane.showInputDialog("Enter First Number");
        snum= JOptionPane.showInputDialog("Enter Second Number");
        fnumCon=Double.parseDouble(fnum);
        snumCon=Double.parseDouble(snum);

        answer=fnumCon-snumCon;

        JOptionPane.showMessageDialog(null,String.valueOf(answer));
    }
}

