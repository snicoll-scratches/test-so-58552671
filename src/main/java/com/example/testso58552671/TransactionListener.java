package com.example.testso58552671;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionListener {

	private static final Log logger = LogFactory.getLog(TransactionListener.class);

	@TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK, classes = TransactionEvent.class)
	public void onEventHandler(TransactionEvent event) {
		logger.info("after rollback. event = " + event);
	}

}