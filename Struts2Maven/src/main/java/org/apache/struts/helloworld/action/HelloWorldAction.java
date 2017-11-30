package org.apache.struts.helloworld.action;
import org.apache.struts.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorldAction extends  ActionSupport{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -1426967826890296347L;
	private MessageStore messageStore;

	    public String execute() {
	        messageStore = new MessageStore() ;
	        
	        return SUCCESS;
	    }

	    public MessageStore getMessageStore() {
	        return messageStore;
	    }
}
