import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI implements ChangeListener {

	// declares variables
	private int width, height;
	private String career;
	private JFrame qframe, inframe;
	private JLabel lblQ, lblIntro,lblDis, lblu;
	private JButton btnNex, btnPre,btnstart;
	private JSlider slider;
	private GridBagConstraints gbc = new GridBagConstraints();
	private boolean checkNext, checkPre;
	
	

	// Constructor
	public GUI(int w, int h) {
		// declares all of the variables and gui we are going to use
		qframe = new JFrame();
		inframe = new JFrame();
		slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
		btnNex = new JButton("Next Question");
		btnPre = new JButton("Previous Question");
		
		lblu = new JLabel("1 is your strong disagree  0 is neutral  5 is you strongly agree");
		btnstart = new JButton("Start Assessment");
		lblQ = new JLabel("Do you consider yourself a Think or a Feeler");
		lblIntro = new JLabel("<html>This program goal is to offer job recommendations to individuals<br/>"
				+ "based on their personality types, the questions consist of the four<br/>"
				+ "personality spheres from the Myers–Briggs type indicator and also highly-stressed vs. lowly-stressed.<br/>"
				+ "After answering 50 questions the user will get recommendations. The <br/>"
				+ "target audience is mainly individuals in a stage of transitions within<br/>"
				+ "their lives (people looking for new jobs, people entering the job<br/>"
				+ "market, people trying to find out what career they would want<br/>"
				+ "to follow).<html>");
		
		lblDis = new JLabel(
				"<html>This is just a short disclaimer that this assesment<br/>"
				+ "is meant to be used as an auxilary tool and that<br/>"
				+ "everything displayed for the assesment is used for<br/>"
				+ "a better sense of direction in which career path you'd want<br/>"
				+ "to follow.<html>");
		
		career = "";
		// sets the width and height of the window
		width = w;
		height = h;
	}
	
	//sets up the home page
	public void setupInfo() {
		
		
		lblIntro.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDis.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnstart.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		inframe.setSize(new Dimension(width,height));
		inframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inframe.setTitle("MBTI+");
		inframe.setVisible(true);
		//inframe.setResizable(false);
		
		inframe.setLayout(new GridBagLayout());
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(5,5,5,5);
		inframe.add(lblIntro,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(5,5,5,5);
		inframe.add(lblDis,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(10,10,10,10);
		inframe.add(btnstart,gbc);
	}
	

	// sets all the GUI sizes and variables
	public void setupGUI() {
		
		
		qframe.setLocation(inframe.getLocation());
		qframe.setResizable(false);
		
		// sets the window size and declares how the window is going to flow
		lblQ.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblu.setFont(new Font("Verdana", Font.ITALIC, 16));
		slider.setFont(new Font("Verdana", Font.PLAIN, 14));
		slider.setMajorTickSpacing(1);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);

		qframe.setPreferredSize(new Dimension(950, 480));
		qframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		qframe.setTitle("MBTI+");

		// sets the flow of the windows an the layout
		qframe.setLayout(new GridBagLayout());
		
		//sets the position of each jbutton and jlabel
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10,10,10,10);
		qframe.add(lblQ,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(10,10,10,10);
		qframe.add(slider,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10,10,10,10);
		qframe.add(lblu,gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10,10,10,10);
		qframe.add(btnNex,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(10,10,10,10);
		qframe.add(btnPre,gbc);
		
		qframe.pack();
		qframe.setVisible(true);

	}

	//gives actions to the button
	public void setupButtonListeners() {
		// gives actions to button next
		ActionListener ActNex = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				setNext(true);
			}
		};
		// gives actions to button previous
		ActionListener ActPre = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				setPre(true);
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

	//used to take actions from the slider
	public void stateChanged(ChangeEvent e) {
		// lblQ.setText("Value is: " + slider.getValue());
		//answers = new driver(slider.getValue());
		
	}

	//prints the qustion for the user to answer
	public void printQuestions(Question temp) {
		// final JTextArea textArea = new JTextArea();
		// textArea.setText(temp.getText());
		
		lblQ.setText(temp.getText());
	}
	
	//gets slider value and returns user answer
	public int getSlider() {
		return slider.getValue();
	}
	
	//check if the user is ready for the next question
	public boolean getNext() {
		return checkNext;
	}
	
	//sets the next button to default
	public void setNext(boolean temp){
		checkNext = temp;	
	}
	
	//returns if the user wants to go back
	public boolean getPre(){	
		return checkPre;
	}
	
	
	//overide method to disable the button if it at the first question
	public void setPre(int i) {
		if(i == 0) {
			btnPre.setEnabled(false);
		}else {
			btnPre.setEnabled(true);
		}
	}
	
	//sets the back button to default
	public void setPre(boolean temp){
		checkPre = temp;
	}
	
	public void setLbl(){
		//String c = career.replaceAll(" ", ",");
		
		btnNex.setEnabled(false);
		btnPre.setEnabled(false);
		lblQ.setText("Career Recommendations: " + career);
		
	}
	
	public void setC(String c){
		career += c + ",";
	}
	
}

	
