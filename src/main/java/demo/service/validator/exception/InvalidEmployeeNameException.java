package demo.service.validator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidEmployeeNameException extends RuntimeException {

  public InvalidEmployeeNameException(String name) {
    super("Invalid employee name:" + name);
  }
}
