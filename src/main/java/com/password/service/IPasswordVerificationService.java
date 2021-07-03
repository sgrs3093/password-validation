package com.password.service;

import com.password.exception.NotValidException;

public interface IPasswordVerificationService {

	void validateLength(String s) throws NotValidException;

	void isEmpty(String pass) throws NotValidException;

	void shouldHaveOneUppercase(String s) throws NotValidException;

	void shouldHaveOneLowercase(String s) throws NotValidException;

	void shouldHaveOneNumber(String s) throws NotValidException;

	void passwordOkIfThreeCondPass();

	void passwordNotOkIfNotLowerCaseFail();

}
