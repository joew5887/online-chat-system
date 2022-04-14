import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatScrn extends Gui {
    private JButton enterBtn;
    private JTextField inputTxt;
    private JTextArea chatTxt;
    private JScrollPane scrollArea;

    public ChatScrn() {
        super();
    }

    public void showInputBox() {
        GridLayout grid = new GridLayout(1, 2);
        JPanel panel = new JPanel();
        panel.setLayout(grid);
        enterBtn = new JButton("Enter");
        enterBtn.addActionListener(this);

        inputTxt = new JTextField();

        panel.add(inputTxt);
        panel.add(enterBtn);
        getWindow().add(panel, BorderLayout.SOUTH);
    }

    public void showMainChat() {
        chatTxt = new JTextArea();
        chatTxt.setEditable(false);
        scrollArea = new JScrollPane(chatTxt);

        getWindow().add(scrollArea);
    }

    public void show() {
        showInputBox();
        showMainChat();
        showWindow();
    }

    public void exit() {

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(inputTxt.getText());
    }
}