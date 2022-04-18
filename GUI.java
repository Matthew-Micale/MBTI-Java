import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI implements ChangeListener {

	// declares variables
	private int width, height;
	private JFrame qframe, inframe;
	private JLabel lblQ, lblIntro;
	private JButton btnNex, btnPre,btnstart;
	private JSlider slider;
	private driver d;
	private GridBagConstraints gbc = new GridBagConstraints();

	// Constructor
	public GUI(int w, int h) {
		// declares all of the variables and gui we are going to use
		qframe = new JFrame();
		inframe = new JFrame();
		slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
		btnNex = new JButton("Next Question");
		btnPre = new JButton("Previous Question");
		btnstart = new JButton("Start Assessment");
		lblQ = new JLabel("Do you consider yourself a Think or a Feeler");
		lblIntro = new JLabel("<html>This program goal is to offer job recommendations to individuals based on their personality types, the questions of consist the 4 personality spheres from <br/>"
				+ "used in the Myers–Briggs Type Indicator. After X amount of questions a user will get a recommendation. The target audience is mainly individuals in a stage <br/>"
				+ "of transitions within their lives (people looking for new jobs, people entering the job market, people trying to find out what career they would want to <br/>"
				+ "study)<html>");
		
		// sets the width and height of the window
		width = w;
		height = h;
	}
	
	public void setupInfo() {
		lblIntro.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		btnstart.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		inframe.setSize(new Dimension(width,height));
		inframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inframe.setTitle("MBTI+");
		inframe.setVisible(true);
		
		inframe.setLayout(new GridBagLayout());
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		//gbc.insets = new Insets(5,5,5,5);
		inframe.add(lblIntro);
		
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		inframe.add(btnstart);
	}

	// sets all the GUI sizes and variables
	public void setupGUI() {
		
		
		qframe.setLocation(inframe.getLocation());
		
		// sets the window size and declares how the window is going to flow
		lblQ.setFont(new Font("Verdana", Font.PLAIN, 18));
		slider.setFont(new Font("Verdana", Font.PLAIN, 15));
		slider.setMajorTickSpacing(1);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);

		qframe.setPreferredSize(new Dimension(width, height));
		qframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		qframe.setTitle("MBTI+");

		// sets the flow of the windows an the layout
		qframe.setLayout(new GridBagLayout());
		
		//sets the position of each jbutton and jlabel
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(5,5,5,5);
		qframe.add(lblQ,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		qframe.add(slider,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		qframe.add(btnNex,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		//gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(5,5,5,5);
		qframe.add(btnPre,gbc);
		
		qframe.pack();
		qframe.setVisible(true);

	}

	public void setupButtonListeners() {
		// gives actions to button next
		ActionListener ActNex = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				//d.setCheck();
			}
		};
		// gives actions to button previous
		ActionListener ActPre = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				//System.out.println("I pass through Pre");
			}
		};
		
		//displays the questions screen and turns off the intro frame
		ActionListener ActStart = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				inframe.setVisible(false);
				setupGUI();
			}
		};

		btnstart.addActionListener(ActStart);
		btnNex.addActionListener(ActNex);
		btnPre.addActionListener(ActPre);
	}

	public void stateChanged(ChangeEvent e) {
		// lblQ.setText("Value is: " + slider.getValue());
		//answers = new driver(slider.getValue());
		
	}

	public void printQuestions(Question temp) {
		// final JTextArea textArea = new JTextArea();
		// textArea.setText(temp.getText());
		
		lblQ.setText(temp.getText());
	}
	
	//gets slider value and returns user answer
	public int getSlider() {
		
		return slider.getValue();
	}
	
	public boolean getNext() {
		
		return true;
	}

	
}
