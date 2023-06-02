package advanced_java.hw16_2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Gui extends JFrame implements ItemListener {
	Container container; 
	JRadioButton[] pet = new JRadioButton[3];
	String[] name = { "강아지", "고양이", "금붕어" };
	ImageIcon[] image = { new ImageIcon("c:\\images/dog.png"), new ImageIcon("c:\\images/cat.png"),
			new ImageIcon("c:\\images/goldfish.png") };
	
	JLabel label = new JLabel();
	
	public Gui() {
		
		setTitle("애완 동물");
		
		container = getContentPane();
		container.setLayout(new BorderLayout());
		
		JPanel radioJPanel = new JPanel();
		
		
		ButtonGroup radioGroup = new ButtonGroup();
		
		for (int i=0; i<3; i++) {
			pet[i] = new JRadioButton(name[i]);
			radioGroup.add(pet[i]);
			radioJPanel.add(pet[i]);
			pet[i].addItemListener(this);
		}
		
		container.add(radioJPanel, BorderLayout.NORTH);
		container.add(label, BorderLayout.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		setBounds(250, 300, 400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Gui();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (pet[0].isSelected()) {
			label.setIcon(image[0]);
		} else if (pet[1].isSelected()) {
			label.setIcon(image[1]);
		} else {
			label.setIcon(image[2]);
		}
	}

}