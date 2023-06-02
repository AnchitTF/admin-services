package io.mosip.hotlist.exception;
	
import io.mosip.kernel.core.exception.BaseCheckedException;
import io.mosip.hotlist.constant.HotlistErrorConstants;

/**
 * The Class ApisResourceAccessException.
 * 
 */
public class ApisResourceAccessException extends BaseCheckedException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new apis resource access exception.
	 */
	public ApisResourceAccessException() {
		super();
	}

	/**
	 * Instantiates a new apis resource access exception.
	 *
	 * @param message the message
	 */
	public ApisResourceAccessException(String message) {
		super(HotlistErrorConstants.API_RESOURCE_UNAVAILABLE.getErrorCode(), message);
	}

	/**
	 * Instantiates a new apis resource access exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ApisResourceAccessException(String message, Throwable cause) {
		super(HotlistErrorConstants.API_RESOURCE_UNAVAILABLE.getErrorCode(), message, cause);
	}
}