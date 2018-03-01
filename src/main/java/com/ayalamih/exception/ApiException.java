package com.ayalamih.exception;

/**
 * com.ayalamih.exception
 *
 * @author ayalamih.
 * @date 3:06 PM, 29/01/2018
 * @contact 31007354@qq.com
 */
public class ApiException extends Exception {
    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
