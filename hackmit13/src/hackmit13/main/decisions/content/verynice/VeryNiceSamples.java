package hackmit13.main.decisions.content.verynice;

import hackmit13.main.decisions.MessagePair;
import hackmit13.main.decisions.QuestionAnswer;
import hackmit13.main.decisions.content.Samples;

public class VeryNiceSamples extends Samples{

	@Override
	protected void fill() {
		
		
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("I. Flipping. Love. You.", 1), 
				new MessagePair[]{
			new MessagePair("...", -.1),
			new MessagePair("I love you too!", .7),
			new MessagePair("Leave, now, and NEVER come BACK!", -1)
		}));
	}


}
