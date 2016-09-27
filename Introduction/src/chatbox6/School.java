package chatbox6;

public class School implements Topic {
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk(){
		inSchoolLoop=true;
		
		while(inSchoolLoop){
			SharonChatBox.print("Tell me about school.");
			schoolResponse=SharonChatBox.getInput();
			if (schoolResponse.indexOf("stop")>=0){
				inSchoolLoop=false;
				SharonChatBox.talkForever();
			}
			else {
			SharonChatBox.print("That's my favorite part of school too");
			}
		}
	}

}
