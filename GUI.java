import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI implements ChangeListener {

	// declares variables
	private int width, height;
	private JFrame frame;
	private JPanel p1, p2;
	private JLabel lblQ, lblfill;
	private JButton btnyes, btnno, btnNex, btnPre;
	private JSlider slider;

	// Constructor
	public GUI(int w, int h) {
		// declares all of the variables and gui we are going to use
		frame = new JFrame();
		p1 = new JPanel();
		p2 = new JPanel();
		slider = new JSlider(JSlider.HORIZONTAL, 1, 5, 1);
		btnNex = new JButton("Next Question");
		btnPre = new JButton("Previous Question");
		lblQ = new JLabel("Do you consider yourself a Think or a Feeler");
		lblfill = new JLabel("FILLING IN SPACE");
		// sets the width and height of the window
		width = w;
		height = h;
	}

	// sets all the GUI sizes and variables
	public void setupGUI() {
		// sets the window size and declares how the window is going to flow
		// frame.setSize(width,height);
		p1.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		p1.setLayout(new GridLayout(0, 2));
		// FlowLayout layout = new FlowLayout();
		p2.setLayout(new GridLayout(0, 2, 5, 10));

		slider.setFont(new Font("Serif", Font.PLAIN, 15));
		slider.setMajorTickSpacing(1);
		slider.setPaintTrack(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(this);

		frame.setPreferredSize(new Dimension(width, height));
		frame.add(p1, "North");
		frame.add(p2, "South");
		// frame.add(p1, BorderLayout.CENTER);
		// frame.add(panel2, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("MBTI+");

		// sets the flow of the windows an the layout
		p1.add(lblQ);

		p2.add(slider);
		p2.add(lblfill);

		p2.add(btnNex);
		p2.add(btnPre);

		frame.pack();
		frame.setVisible(true);

	}

	public void setupButtonListeners() {
		// gives actions to button yes
		/*ActionListener ActYes = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				lblQ.setText("Yes");
				System.out.println("I pass through Yes");
			}
		};
		// gives actions to button no
		ActionListener ActNo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				lblQ.setText("No");
				System.out.println("I pass through No");
			}
		};
		*/
		// gives actions to button next
		ActionListener ActNex = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				lblQ.setText("Nex");
				System.out.println("I pass through Nex");
			}
		};
		// gives actions to button previous
		ActionListener ActPre = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				lblQ.setText("Pre");
				System.out.println("I pass through Pre");
			}
		};

		btnNex.addActionListener(ActNex);
		btnPre.addActionListener(ActPre);
		//btnyes.addActionListener(ActYes);
		//btnno.addActionListener(ActNo);
	}

	public void stateChanged(ChangeEvent e) {
		lblQ.setText("Value is: " + slider.getValue());
	}
	
	public void printQuestions(Question temp)
	{
		 final JTextArea textArea = new JTextArea();
		 textArea.setText(temp.getText());
	}
	}
