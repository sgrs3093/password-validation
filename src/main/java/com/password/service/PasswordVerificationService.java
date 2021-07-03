package com.password.service;

import com.password.exception.NotValidException;

public class PasswordVerificationService implements IPasswordVerificationService {

	public void verifyPassword(String password) {

	}

	public void validateLength(String s) throws NotValidException {
		if (s.length() < 8) {
			throw new NotValidException("length should be grater than 8 characters");
		}

	}

	public void isEmpty(String pass) throws NotValidException {
		if (pass.length() == 0 || pass.isEmpty() || pass == null) {

			throw new NotValidException("password should not be empty");
		}

	}

	public void shouldHaveOneUppercase(String s) {
		// TODO Auto-generated method stub

	}

	public void shouldHaveOneLowercase(String s) {
		// TODO Auto-generated method stub

	}

	public void shouldHaveOneNumber(String s) {
		// TODO Auto-generated method stub

	}

	public void passwordOkIfThreeCondPass() {
		// TODO Auto-generated method stub

	}

	public void passwordNotOkIfNotLowerCaseFail() {
		// TODO Auto-generated method stub

	}

}
