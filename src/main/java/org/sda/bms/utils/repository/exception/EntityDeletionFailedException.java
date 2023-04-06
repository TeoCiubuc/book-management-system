package org.sda.bms.utils.repository.exception;

public class EntityDeletionFailedException extends RuntimeException{
    public EntityDeletionFailedException(String message) {
        super(message);
    }

    public EntityDeletionFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}