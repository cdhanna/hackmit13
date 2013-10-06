package hackmit13.main.decisions;

public class MessagePair {

	
	private String message;
	private double feeling;
	
	public MessagePair(String message, double feeling){
		this.message = message;
		this.feeling = feeling;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public double getFeeling(){
		return this.feeling;
	}
	
}
