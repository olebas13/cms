package org.olebas.cms.domain.exception;

import lombok.Getter;

public class NewsNotFoundException extends RuntimeException {

    @Getter
    private final String id;

    public NewsNotFoundException(String id) {
        this.id = id;
    }

}
