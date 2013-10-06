package hackmit13.main.decisions.content.verymean;

import hackmit13.main.decisions.MessagePair;
import hackmit13.main.decisions.QuestionAnswer;
import hackmit13.main.decisions.content.Samples;

public class VeryMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are uglier than a broken toaster.", -1), 
				new MessagePair[]{
			new MessagePair("You are just a phone, shut up", -.2),
			new MessagePair("You don't phase me", 0),
			new MessagePair("I am literally in tears", 1)
		}));
		
		
	}


	
	
	
}
