package io.mosip.kernel.templatemanager.freemarker.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;

/**
 * TemplateConfigurationException if problem occurs while Configuring the template Manager.
 * 
 * @author Abhishek Kumar
 * @since 2018-10-9
 * @version 1.0.0
 */
public class TemplateConfigurationException extends BaseUncheckedException {

	private static final long serialVersionUID = -6167648722650250191L;

	/**
	 * constructor for setting error code and message
	 * @param errorCode
	 * @param errorMessage
	 */
	public TemplateConfigurationException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

}
