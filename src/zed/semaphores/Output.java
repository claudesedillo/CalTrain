package zed.semaphores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Output extends JFrame implements ActionListener{
	
	private JPanel panel2;
	private JScrollPane sp;
	public JTextArea st;
	private int count;
	private int size;
	private ArrayList<JLabel> info;
    private JLabel lblOutput;
	
	public Output(){
		info = new ArrayList<JLabel>();
		count=0;
		size=10;
		getContentPane().setBackground(SystemColor.control);
		setTitle("Train simulator Semaphores");
 		setSize(550, 615);
 		setLocationRelativeTo(null);
 		setLocation(0, 0);
 		setVisible(true);
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		getContentPane().setLayout(null);
 		
	    panel2 = new JPanel();
	    panel2.setBackground(Color.WHITE);
	    panel2.setLayout(null);
	    
	    sp = new JScrollPane();
	    sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    sp.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    sp.setViewportView(panel2);
	    getContentPane().add(sp);
	    sp.setSize(430, 500);
	    sp.setLocation(50,49);
	    panel2.setPreferredSize(new Dimension(500, 500));

	    st = new JTextArea();
		st.setEditable(false);
		sp.setViewportView(st);
		
		lblOutput = new JLabel("OUTPUTS:");
		lblOutput.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOutput.setBounds(203, 11, 159, 27);
		lblOutput.setVisible(true);
		getContentPane().add(lblOutput);
	
	}
	
	public void setText(String str){
//		panel2.removeAll();
		st.append(str);
		size+=30;
		count++;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}
