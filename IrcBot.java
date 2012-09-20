import org.jibble.pircbot.PircBot;

public class IrcBot extends PircBot {
	
	private String botName = "sudojavabot";
	private String channel = "#sudounlv-bots";
	
	public void doInit() {
		setName(botName);
		System.out.println("Connecting to IRC server...");	
		try{
        	connect("irc.freenode.net");			
		}catch (Exception e){
      		e.printStackTrace();
			return;
		}
		System.out.println("Connected to IRC server, joining channel");	
		joinChannel(channel);		
	}
	
	private void doHelpMessages(String channel){
		sendMessage(channel, "You can type '!help " + botName + "' to get a list of my commands");
		sendMessage(channel, "Channel Hello: You can say 'Hello " + botName + "' in the channel and I'll greet you back!");
		sendMessage(channel, "Private Message Hello:  You can private message me and say 'hello' and I'll greet you back.");
	}
	
	protected void onPrivateMessage(String sender,
	                                String login,
	                                String hostname,
	                                String message){
		if(message.equalsIgnoreCase("hello")){
			sendMessage(sender, helloMessage(sender));
		}
	}
	
	public static void main(String[] args) {
		IrcBot bot = new IrcBot();	
		bot.doInit();
	}    

    @Override
    protected void onMessage(String channel, String sender, String login, String hostname, String message) {
		if(message.trim().equalsIgnoreCase("hello " + botName)){
			sendMessage(channel, helloMessage(sender));
		}else if(message.trim().equalsIgnoreCase("!help " + botName)){
			doHelpMessages(channel);
		}
    }

	private String helloMessage(String person){
		return "Hello " + person;
	}
}
