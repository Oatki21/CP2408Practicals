import javax.swing.*;

public class MinutesConversion {
    public static void main(String[] args)
    {
        String result;
        result = JOptionPane.showInputDialog("Enter a number of minutes");
        double hours = Integer.parseInt(result)/60;
        double days = hours/24;
        JOptionPane.showMessageDialog(null, result+" minutes equals "+hours+" hours and equals "+days+" days");
    }
}
