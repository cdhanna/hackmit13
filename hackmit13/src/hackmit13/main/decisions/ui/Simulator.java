package hackmit13.main.decisions.ui;

import hackmit13.main.decisions.Evalulator;
import hackmit13.main.decisions.QuestionAnswer;

public class Simulator {

	private static Window w;
	
	public static void main(String[] args){
		
		System.out.println("Simulator GO!");
		
		w = new Window(){
			@Override
			public void onSelection(int index, QuestionAnswer qa){
				set(Evalulator.getInstance().selectResponse(index));
			}
		};
		set(Evalulator.getInstance().getStart());
		//System.out.println(Evalulator.getInstance().getStart());
		
	}
	
	private static void set(QuestionAnswer q){
		w.setForQuestionAnswer(q);
		//System.out.println(q);
	}
	
}
