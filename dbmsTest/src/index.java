import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index extends JFrame{
    private JPanel mainPanel;
    private JButton customerButton;
    private JButton adminButton;
    private JButton fleeterButton;

    public index(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                customerDetails customerDetails = new customerDetails("Customer Details");
//                customerDetails.show();
//                customerDetails.dispose();

                customerDetails obj = new customerDetails("customerDetails");
                obj.setVisible(true);
                dispose();
            }
        });
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        fleeterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new index("Choose yourself");
        frame.setVisible(true);
    }
}
