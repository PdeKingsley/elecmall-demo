package com.example.elecsecurity.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author wd
 */
public class NotLoginException extends AuthenticationException {
    public NotLoginException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public NotLoginException(String msg) {
        super(msg);
    }
}
