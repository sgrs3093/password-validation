package com.password.service;

public interface IPasswordVerificationService {

	void validateLength(String s);

	void isEmpty();

	void shouldHaveOneUppercase(String s);

	void shouldHaveOneLowercase(String s);

	void shouldHaveOneNumber(String s);

	void passwordOkIfThreeCondPass();

	void passwordNotOkIfNotLowerCaseFail();

}
