import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewJFrame extends JFrame {

    Search obj = new Search();

    private JTextField size;
    private JButton setSizeButton;
    private JTextField num;
    private JButton linearSearchButton;
    private JLabel SetArray;
    private JTextArea Print;
    private JPanel panel;


    public NewJFrame() {
        setContentPane(panel);
        setSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n;

                String st = size.getText();
                n = Integer.parseInt(st);

                obj.initializeArray(n);
                SetArray.setText(obj.printArray());
            }
        });
        linearSearchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n;

                String st = num.getText();
                n = Integer.parseInt(st);

                String a = obj.serialSearch(n);
                Print.setText(a);

            }
        });
    }
}
