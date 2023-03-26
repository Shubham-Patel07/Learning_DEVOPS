import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerDetails extends JFrame{
    private JPanel customPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextPane textPane1;
    private JButton submitButton;


    public customerDetails(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(customPanel);
        this.pack();
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame cusframe = new customerDetails("Customer details");
        cusframe.setVisible(true);
    }
}
