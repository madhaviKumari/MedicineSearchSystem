package co.ass.medical.Med.util;

import co.ass.medical.Med.dto.ErrorResponse;
import co.ass.medical.Med.dto.SuccessResponse;

public class SystemCodes {
	
	public static final int REQUEST_FAIL = 403;
	public static final int REQUEST_SUCCESS = 200;
	public static final int REQUEST_SERVEER_ERROR = 500;
	
	public static final ErrorResponse buildServerErrorResponse(String message) {
		return new ErrorResponse(REQUEST_SERVEER_ERROR,message);
	}
	
	public static final ErrorResponse buildErrorResponse(String message) {
		return new ErrorResponse(REQUEST_FAIL,message);
	}
	
	public static final SuccessResponse buildSuccessResponse(String message) {
		return new SuccessResponse(REQUEST_SUCCESS,message);
	}
	
	
	

}
