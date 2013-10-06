package hackmit13.main.decisions;


public class QuestionAnswer {

	
	
	
	private MessagePair question;
	private MessagePair[] responses;
	
	public QuestionAnswer(MessagePair question, MessagePair[] responses){
		this.question = question;
		this.responses = responses;
		
	}
	
	public MessagePair getQuestion(){
		return this.question;
	}
	
	public MessagePair[] getResponses(){
		return this.responses;
	}
	
	public String toString(){
		
		String txt = "Question:: ";
		
		txt += this.question.getMessage() + "\n";
		for (int i = 0 ; i < this.responses.length ; i ++){
			txt += " (" + (i+1) + ") " + this.responses[i].getMessage() + "\n";
		}
		
		return txt;
		
	}
	
	
}
