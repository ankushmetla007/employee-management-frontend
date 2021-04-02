package com.nagarro.validation;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import com.nagarro.models.User;
public class UserValidator implements Validator {

	public boolean supports(Class<?> paramClass) {
		return User.class.equals(paramClass);
	}

	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "valid.username");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
	}

}
