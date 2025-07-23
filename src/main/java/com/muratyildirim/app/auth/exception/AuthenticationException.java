package com.muratyildirim.app.auth.exception;

import org.springframework.context.i18n.LocaleContextHolder;

import com.muratyildirim.app.shared.Messages;

public class AuthenticationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AuthenticationException() {
		super(Messages.getMessageForLocale("murtimur.auth.invalid.credentials", LocaleContextHolder.getLocale()));
	}

}
