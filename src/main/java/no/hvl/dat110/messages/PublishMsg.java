package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {

	//TODO - START
	// message sent from client to create publish a message on a topic
	private String topic;
	private String message;
	//TODO - END

	public PublishMsg(String user, String topic, String message) {
		//TODO - START
		super(MessageType.PUBLISH, user);
		this.topic = topic;
		this.message = message;
		//TODO - END
	}

	// TODO - START
	// Implement object variables - a topic and a message is required
	// Complete the constructor, get/set-methods, and toString method
	// as described in the project text
	public String getMessage() {
		return message;
		//throw new UnsupportedOperationException(TODO.method());
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "PublishMsg{" +
				"user='" + getUser() + '\'' +
				", topic='" + topic + '\'' +
				", message='" + message + '\'' +
				'}';
	}
	//TODO - END
}
