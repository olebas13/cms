package org.olebas.cms.domain.vo;

import lombok.Data;
import org.olebas.cms.domain.model.Role;

@Data
public class UserRequest {
    private String identity;
    private String name;
    private Role role;
}
