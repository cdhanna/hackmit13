package hackmit13.main.decisions.content;

import java.util.ArrayList;
import java.util.List;

import hackmit13.main.decisions.QuestionAnswer;


public abstract class Samples {

	private List<QuestionAnswer> questionAnswers;
	
	public Samples(){
		this.questionAnswers = new ArrayList<>();
		this.fill();
	}
	
	protected abstract void fill();
	
	protected final void addQuestionAnswer(QuestionAnswer q){
		this.questionAnswers.add(q);
	}
	
	public final QuestionAnswer[] getQuestionAnswers(){
		return this.questionAnswers.toArray(new QuestionAnswer[]{});
	}
	
}
