import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public abstract class Gui implements ActionListener {
    private final int size = 500;
    private JFrame window;

    public Gui() {
        window = new JFrame();
        window.setSize(size, size);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public abstract void show();

    public abstract void exit();

    public JFrame getWindow() {
        return window;
    }

    public void showWindow() {
        window.setVisible(true);
    }
}