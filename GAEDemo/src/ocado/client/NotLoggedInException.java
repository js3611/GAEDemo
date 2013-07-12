package ocado.client;

import java.io.Serializable;

public class NotLoggedInException extends Exception implements Serializable {
	public NotLoggedInException() {
		super();
	}

	public NotLoggedInException(String msg) {
		super(msg);
	}
}
