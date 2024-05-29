package demo.service.validator;

import demo.service.validator.exception.InvalidEmployeeNameException;
import org.springframework.util.ObjectUtils;

public class EmployeeNameValidator {

  private static final String REG_EXP = "^[a-zA-Z\\s]+";

  public void checkEmployeeName(String name) {
    if (ObjectUtils.isEmpty(name) || !name.matches(REG_EXP)) {
      throw new InvalidEmployeeNameException(name);
    }
  }
}
