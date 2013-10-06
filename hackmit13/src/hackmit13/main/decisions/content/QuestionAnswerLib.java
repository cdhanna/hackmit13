package hackmit13.main.decisions.content;

import hackmit13.main.decisions.MessagePair;
import hackmit13.main.decisions.QuestionAnswer;
import hackmit13.main.decisions.content.somemean.SomeMeanSamples;
import hackmit13.main.decisions.content.somenice.SomeNiceSamples;
import hackmit13.main.decisions.content.verymean.VeryMeanSamples;
import hackmit13.main.decisions.content.verynice.VeryNiceSamples;


public class QuestionAnswerLib {

	public static final QuestionAnswer[] VERY_MEAN_ARRAY = (new VeryMeanSamples()).getQuestionAnswers();
	public static final QuestionAnswer[] SOME_MEAN_ARRAY = (new SomeMeanSamples()).getQuestionAnswers();
	public static final QuestionAnswer[] SOME_NICE_ARRAY = (new SomeNiceSamples()).getQuestionAnswers();
	public static final QuestionAnswer[] VERY_NICE_ARRAY = (new VeryNiceSamples()).getQuestionAnswers();
	
	public static final QuestionAnswer[][] QA = {VERY_MEAN_ARRAY, SOME_MEAN_ARRAY, SOME_NICE_ARRAY, VERY_NICE_ARRAY};
	
	public static final int VERY_MEAN = 0;
	public static final int SOME_MEAN = 1;
	public static final int SOME_NICE = 2;
	public static final int VERY_NICE = 3;
	
	
	public static final QuestionAnswer startQuestion = new QuestionAnswer(new MessagePair("How are you feeling?", 0),
			new MessagePair[]{
		new MessagePair("I'm feeling great!", 1),
		new MessagePair("I'm feeling pretty meh.", 0),
		new MessagePair("I'm not feeling so great...", -1)
	});
	
	private QuestionAnswerLib(){}
	
	
}
