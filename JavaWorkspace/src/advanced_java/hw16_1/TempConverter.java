package advanced_java.hw16_1;

//***************************
//파일명: TempConverter.java
//작성자: 201914089 오동재
//작성일: 2023-06-01
//내용: hw16_1
//***************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame {

    private JTextField field1;
    private JTextField field2;

    public TempConverter() {
    	setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel(new GridLayout(3, 2));
        add(panel);
        
        JLabel label1 = new JLabel("섭씨 온도:");
        field1 = new JTextField(15);

        JLabel label2 = new JLabel("화씨 온도:");
        field2 = new JTextField(15);
        field2.setEditable(false);

        JButton convertButton = new JButton("변환");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convert();
            }
        });
        
        
        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(convertButton);

        setTitle("온도변환기");
        setSize(300, 150);
        setVisible(true);
    }

    private void convert() {
        try {
            double c = Double.parseDouble(field1.getText());
            double f = c * 9 / 5 + 32;
            field2.setText(String.format("%.2f", f));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "잘못된 입력");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TempConverter();
            }
        });
    }
}
