import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI implements ChangeListener {

	// declares variables
	private int width, height;
	private JFrame frame;
	private JLabel lblQ;
	private JButton btnNex, btnPre;
	private JSlider slider;
	private driver answers;
	private GridBagConstraints gbc = new GridBagConstraints();

	// Constructor
	public GUI(int w, int h) {
		// declares all of the variables and gui we are going to use
		frame = new JFrame();
		slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
		btnNex = new JButton("Next Question");
		btnPre = new JButton("Previous Question");
		lblQ = new JLabel("Do you consider yourself a Think or a Feeler");
		
		// sets the width and height of the window
		width = w;
		height = h;
	}

	// sets all the GUI sizes and variables
	public void setupGUI() {
		// sets the window size and declares how the window is going to flow
		lblQ.setFont(new Font("Verdana", Font.PLAIN, 18));
		slider.setFont(new Font("Verdana", Font.PLAIN, 15));
		slider.setMajorTickSpacing(1);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);

		frame.setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MBTI+");

		// sets the flow of the windows an the layout
		frame.setLayout(new GridBagLayout());
		
		//sets the position of each jbutton and jlabel
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(5,5,5,5);
		frame.add(lblQ,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		frame.add(slider,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		frame.add(btnNex,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		frame.add(btnPre,gbc);

		frame.pack();
		frame.setVisible(true);

	}

	public void setupButtonListeners() {
		// gives actions to button next
		ActionListener ActNex = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				// lblQ.setText("Nex");
				System.out.println("false");
			}
		};
		// gives actions to button previous
		ActionListener ActPre = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("I pass through Pre");
			}
		};

		btnNex.addActionListener(ActNex);
		btnPre.addActionListener(ActPre);
	}

	public void stateChanged(ChangeEvent e) {
		// lblQ.setText("Value is: " + slider.getValue());
		answers = new driver(slider.getValue());
		
	}

	public void printQuestions(Question temp) {
		// final JTextArea textArea = new JTextArea();
		// textArea.setText(temp.getText());
		lblQ.setText(temp.getText());
	}
}
