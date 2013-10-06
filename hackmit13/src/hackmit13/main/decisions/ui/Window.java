package hackmit13.main.decisions.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import hackmit13.main.decisions.QuestionAnswer;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Window extends JFrame{

	
	private JPanel panel;
	
	private JLabel questionTitle;
	private List<JLabel> responseTitles;
	
	public Window(){
		this.setLayout(new MigLayout());
		this.panel = new JPanel();
		this.panel.setLayout(new MigLayout());
		this.questionTitle = new JLabel("Question...");
		
		this.responseTitles = new ArrayList<>();
		
		this.setPreferredSize(new Dimension(500,400));
		
		this.add(this.panel, "grow, push");
		
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void setForQuestionAnswer(final QuestionAnswer qa){
		//this.remove(this.panel);
		//this.panel = new JPanel(new MigLayout());
		//this.panel.removeAll();
		
		this.panel.remove(this.questionTitle);
		for (int i = 0 ; i < this.responseTitles.size() ; i ++){
			this.panel.remove(this.responseTitles.get(i));
		}
		this.panel.revalidate();
		this.panel.setBorder(BorderFactory.createLineBorder(Color.black));
		//this.add(this.panel, "grow, push");
		
		this.responseTitles.clear();
		
		this.questionTitle.setText(qa.getQuestion().getMessage());
		this.panel.add(this.questionTitle, "cell 0 0");
		//System.out.println("LENGTH : " + qa.getResponses().length);
		for (int i = 0 ; i < qa.getResponses().length ; i ++){
			//System.out.println(i);
			this.responseTitles.add( new JLabel("  " + qa.getResponses()[i].getMessage()));
			this.panel.add(this.responseTitles.get(i), "cell 0 " + (i + 1) + ", pushx, growx");
			final int x = i;
			this.responseTitles.get(i).addMouseListener(new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e){
					onSelection(x, qa);
				}
			});
		}
		this.panel.revalidate();
		this.repaint();
		//this.panel.repaint();
		//this.repaint();
		
	}
	
	public void onSelection(int index, QuestionAnswer qa){
		//override me!
	}
	
}
