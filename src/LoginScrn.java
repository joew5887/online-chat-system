import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginScrn extends Gui {
    private JButton submitBtn;
    private JLabel portLbl, addrLbl, titleLbl, nameLbl;
    private JTextField portTxt, addrTxt, nameTxt;

    public LoginScrn() {
        super();
    }

    private void showInputBoxes() {
        GridLayout grid = new GridLayout(3, 2);
        JPanel panel = new JPanel();
        panel.setLayout(grid);

        portLbl = new JLabel("Port: ");
        addrLbl = new JLabel("Address: ");
        nameLbl = new JLabel("Name: ");
        portTxt = new JTextField(ServerClient.defaultPort);
        nameTxt = new JTextField();
        addrTxt = new JTextField(ServerClient.defaultAddr);

        panel.add(portLbl);
        panel.add(portTxt);
        panel.add(addrLbl);
        panel.add(addrTxt);
        panel.add(nameLbl);
        panel.add(nameTxt);
        getWindow().add(panel, BorderLayout.CENTER);
    }

    private void showSubmitBtn() {
        submitBtn = new JButton("Enter Chat");
        submitBtn.addActionListener(this);
        getWindow().add(submitBtn, BorderLayout.SOUTH);
    }

    private void showTitle() {
        titleLbl = new JLabel("Online Chat");
        getWindow().add(titleLbl, BorderLayout.NORTH);
    }

    public void show() {
        showTitle();
        showSubmitBtn();
        showInputBoxes();
        showWindow();
        getWindow().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(addrTxt.getText());
    }

    public void exit() {

    }

    public static void main(String[] args) {
        // LoginScrn x = new LoginScrn();
        // x.show();
        ChatScrn y = new ChatScrn();
        y.show();
    }

}
