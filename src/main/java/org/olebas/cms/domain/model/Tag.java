package org.olebas.cms.domain.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class Tag {
    private String value;
}
