package com.password.service;

import com.password.exception.NotValidException;

public interface IPasswordVerificationService {

	void validateLength(String s) throws NotValidException;

	void isEmpty(String pass) throws NotValidException;

	void shouldHaveOneUppercase(String s);

	void shouldHaveOneLowercase(String s);

	void shouldHaveOneNumber(String s);

	void passwordOkIfThreeCondPass();

	void passwordNotOkIfNotLowerCaseFail();

}
