package hackmit13.main.decisions;

import hackmit13.main.decisions.content.QuestionAnswerLib;


public class Evalulator {
	
	
	private static Evalulator instance;
	public static Evalulator getInstance(){
		if (instance == null)
			instance = new Evalulator();
		return instance;
	}
	
	private QuestionAnswer lastQuestionAnswer;
	private double cpuFeeling, userFeeling, cumalativeFeeling;
	
	private Evalulator(){
		this.cpuFeeling = 0;
		this.userFeeling = 0;
		this.cumalativeFeeling = 0;
		this.lastQuestionAnswer = getStart();
	}
	
	public QuestionAnswer getStart(){
		return QuestionAnswerLib.startQuestion;
	}
	
	public QuestionAnswer selectResponse(int index){
		
		this.cpuFeeling = this.lastQuestionAnswer.getResponses()[index].getFeeling();
		
		QuestionAnswer qa = this.evalulate(this.cpuFeeling, this.userFeeling, this.cumalativeFeeling);
		this.lastQuestionAnswer = qa;
		return qa;
	}
	
	public QuestionAnswer evalulate(double cpuFeeling, double userFeeling, double cumalativeFeeling){
		System.out.println("CPU : " + cpuFeeling + ", USR : " + userFeeling);
		double d = (cpuFeeling - userFeeling) + cumalativeFeeling;
		System.out.println("D : " + d);
		if (isBetween(d, -1, -.5)) return this.getQuestionAnswerFromArray(QuestionAnswerLib.VERY_MEAN);
		else if (isBetween(d, -.5, 0)) return this.getQuestionAnswerFromArray(QuestionAnswerLib.SOME_MEAN);
		else if (isBetween(d, 0, .5)) return this.getQuestionAnswerFromArray(QuestionAnswerLib.SOME_NICE);
		else if (isBetween(d, .5, 1.1)) return this.getQuestionAnswerFromArray(QuestionAnswerLib.VERY_NICE);
		
		return null; //there must have been an error :(
	}
	
	private QuestionAnswer getQuestionAnswerFromArray(int index){
		
		QuestionAnswer[] qa = QuestionAnswerLib.QA[index];
		return this.getRandomQuestionAnswer(qa);
	}
	
	private QuestionAnswer getRandomQuestionAnswer(QuestionAnswer[] qa){
		int r = (int) Math.floor(Math.random() * qa.length);
		return qa[r];
	}
	
	private boolean isBetween(double val, double min, double max){
		return (min <= val && val < max);
	}
	
	
}
