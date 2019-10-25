package com.example.testso58552671;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author Stephane Nicoll
 */
public class TransactionEvent extends ApplicationEvent {

	public TransactionEvent(Object source) {
		super(source);
	}

}
