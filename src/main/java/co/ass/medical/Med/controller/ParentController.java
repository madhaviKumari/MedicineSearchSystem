package co.ass.medical.Med.controller;

import org.springframework.web.bind.annotation.RestController;

import co.ass.medical.Med.dto.ErrorResponse;
import co.ass.medical.Med.dto.ListResponse;
import co.ass.medical.Med.dto.SuccessResponse;
import co.ass.medical.Med.util.SystemCodes;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;


@RestController
public class ParentController {
	
	
	public ResponseEntity<?> getResponse(String message){
		SuccessResponse error = SystemCodes.buildSuccessResponse(message);
		ResponseEntity<SuccessResponse> res = new ResponseEntity<>(error,HttpStatus.OK);
		return res;
	}
	
	public ResponseEntity<?> getResponse(Exception e) {
		e.printStackTrace();
		ErrorResponse error = SystemCodes.buildServerErrorResponse(e.getLocalizedMessage());
		ResponseEntity<ErrorResponse> res = new ResponseEntity<>(error,HttpStatus.OK);
		return res;	
	}
	
	
	public <T> ResponseEntity<?> getResponse(T response){
		ResponseEntity<T> res=new ResponseEntity<>(response,HttpStatus.OK);
		return res;
	}
	
	
	public <T> ResponseEntity<?> getListResponse(List<T> list,@NonNull String message){
		ListResponse<T> r = new ListResponse<>();
		r.setData(list);
		r.setMessage(message);
		ResponseEntity<ListResponse<T>> res = new ResponseEntity<> (r,HttpStatus.OK);
		return res;
	}

}
