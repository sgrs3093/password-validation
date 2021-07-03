package com.password.service;

import java.util.List;
import java.util.regex.Pattern;

import com.password.exception.NotValidException;

public class PasswordVerificationService implements IPasswordVerificationService {

	Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
	Pattern lowerCasePatten = Pattern.compile("[a-z ]");
	Pattern digitCasePatten = Pattern.compile("[0-9 ]");

	boolean flag = true;
	List<String> errorList;

	public void verifyPassword(String password) {

	}

	public void validateLength(String s) throws NotValidException {
		if (s.length() < 8) {
			flag = false;
			errorList.add("length should be grater than 8 characters");
			throw new NotValidException("length should be grater than 8 characters");
		}

	}

	public void isEmpty(String pass) throws NotValidException {
		if (pass.length() == 0 || pass.isEmpty() || pass == null) {
			flag = false;
			errorList.add("password should not be empty");
			throw new NotValidException("password should not be empty");
		}

	}

	public void shouldHaveOneUppercase(String s) throws NotValidException {
		if (!UpperCasePatten.matcher(s).find()) {
			flag = false;
			errorList.add("Password must have atleast one uppercase character !!");
			throw new NotValidException("Password must have atleast one uppercase character !!");
		}

	}

	public void shouldHaveOneLowercase(String s) throws NotValidException {
		if (!lowerCasePatten.matcher(s).find()) {
			flag = false;
			errorList.add("Password must have atleast one lowercase character !!");
			throw new NotValidException("Password must have atleast one lowercase character !!");
		}

	}

	public void shouldHaveOneNumber(String pass) throws NotValidException {
		if (!digitCasePatten.matcher(pass).find()) {
			flag = false;
			errorList.add("Password must have atleast one digit character !!");
			throw new NotValidException("Password must have atleast one digit character !!");
		}

	}

	public void passwordOkIfThreeCondPass() {
		// TODO Auto-generated method stub

	}

	public void passwordNotOkIfNotLowerCaseFail() {
		// TODO Auto-generated method stub

	}

}
