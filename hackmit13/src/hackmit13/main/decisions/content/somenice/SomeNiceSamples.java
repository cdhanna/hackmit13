package hackmit13.main.decisions.content.somenice;

import hackmit13.main.decisions.MessagePair;
import hackmit13.main.decisions.QuestionAnswer;
import hackmit13.main.decisions.content.Samples;

public class SomeNiceSamples extends Samples{

	@Override
	protected void fill() {
		this.addQuestionAnswer(new QuestionAnswer(new MessagePair("Hey dude, you're the man!", .5), 
				new MessagePair[]{
			new MessagePair("I don't need your compliments!", -1),
			new MessagePair("Psh, like I don't know that already...", -.2),
			new MessagePair("And you a pathetic piece of technology", -1)
		}));
	}


}
