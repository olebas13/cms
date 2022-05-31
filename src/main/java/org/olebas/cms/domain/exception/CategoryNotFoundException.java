package org.olebas.cms.domain.exception;

import lombok.Getter;

public class CategoryNotFoundException extends RuntimeException {

    @Getter
    private final String id;

    public CategoryNotFoundException(String id) {
        this.id = id;
    }

}
