package org.sda.bms.utils.repository.exception;

public class EntityFetchingFailedException extends RuntimeException{
    public EntityFetchingFailedException(String message) {
        super(message);
    }

    public EntityFetchingFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}