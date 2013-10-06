package hackmit13.main.decisions.content.somemean;

import hackmit13.main.decisions.MessagePair;
import hackmit13.main.decisions.QuestionAnswer;
import hackmit13.main.decisions.content.Samples;

public class SomeMeanSamples extends Samples{

	@Override
	protected void fill() {
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("You are an awful person.", -.5), 
				new MessagePair[]{
			new MessagePair("I know, and I like it", -.2),
			new MessagePair("Whatever, sparky.", 0),
			new MessagePair("Stoooop making fun of me!", 1)
		}));
		
	}



}
