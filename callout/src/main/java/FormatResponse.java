package com.apigeesample;

import com.apigee.flow.execution.ExecutionContext;
import com.apigee.flow.execution.ExecutionResult;
import com.apigee.flow.execution.spi.Execution;
import com.apigee.flow.message.MessageContext;


public class FormatResponse implements Execution {

	public ExecutionResult execute(MessageContext messageContext, ExecutionContext executionContext) {
		
		try {

			// get the payload
			String payload = messageContext.getMessage().getContent();

			// code here to modify payload

			String newPayload = payload.toUpperCase();   // convert payload text to uppercase

			// replace the payload with a new, formatted payload
			messageContext.getMessage().setContent(newPayload);
            
            return ExecutionResult.SUCCESS;
		}
		catch (Exception e) {
			return ExecutionResult.ABORT;
		}
	}
}