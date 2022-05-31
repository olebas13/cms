package org.olebas.cms.domain.exception;

import lombok.Getter;

public class UserNotFoundException extends RuntimeException {

    @Getter
    private final String id;

    public UserNotFoundException(String id) {
        this.id = id;
    }

}
