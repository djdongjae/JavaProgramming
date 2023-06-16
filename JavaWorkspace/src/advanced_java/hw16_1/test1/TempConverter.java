package advanced_java.hw16_1.test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TempConverter extends JFrame{
	
	private JTextField f1;
	private JTextField f2;
	
	public TempConverter() {
		setTitle("온도 변환기");
		setLayout(new BorderLayout(10, 10));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(3, 0));
		
		JLabel l1 = new JLabel("화씨 온도");
		JLabel l2 = new JLabel("섭씨 온도");
		
		f1 = new JTextField(10);
		f2 = new JTextField(10);
		f1.setEnabled(false);
		
		JButton convertButton = new JButton("변환");
		convertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				convert();
			}
		});
		
		p1.add(l1);
		p1.add(f1);
		p2.add(l2);
		p2.add(f2);
		p3.add(convertButton);
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		
		add(panel, BorderLayout.NORTH);
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	private void convert() {
		try {
			double c = Double.parseDouble(f2.getText());
			double f = c * 9 / 5 + 32;
			f1.setText(String.format("%.2f", f));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "잘못된 입력");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new TempConverter();
				
			}
		});

	}

}
