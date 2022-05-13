package org.olebas.cms.domain.vo;

import lombok.Data;
import org.olebas.cms.domain.model.Category;
import org.olebas.cms.domain.model.Tag;

import java.util.Set;

@Data
public class NewsRequest {
    private String title;
    private String content;
    private Set<Category> categories;
    private Set<Tag> tags;
}
