package pane;
import javax.swing.*;
public class calc {
    public static void main(String[] args) {
        String fnum,snum,symbol;
        double fnumcon,snumcon,result=0;
        char operation;

        fnum=JOptionPane.showInputDialog("Enter the first number");
        snum=JOptionPane.showInputDialog("Enter the second number");
        symbol=JOptionPane.showInputDialog("Enter the operation to be performed");

        fnumcon=Double.parseDouble(fnum);
        snumcon=Double.parseDouble(snum);
        operation=symbol.charAt(0);

        switch (operation){
            case '+':
            result=fnumcon+snumcon;
            break;
            case '-':
                result=fnumcon-snumcon;
                break;
            case '*':
                result=fnumcon*snumcon;
                break;
            case '/':
                result=fnumcon/snumcon;
                break;
            case '%':
                result=fnumcon%snumcon;
                break;
                default:
                    JOptionPane.showMessageDialog(null,"the operation you have entered does not exist");
        }
        JOptionPane.showMessageDialog(null,"the result is:"+String.valueOf(result));
    }
}
