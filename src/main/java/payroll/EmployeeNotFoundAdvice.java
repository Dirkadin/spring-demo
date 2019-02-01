package payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(EmployeeNotFoundException.class) //Only respond if this is thrown
	@ResponseStatus(HttpStatus.NOT_FOUND) //Respond with 404
	String employeeNotFoundHandler(EmployeeNotFoundException ex) {
		return ex.getMessage();
	}

}
