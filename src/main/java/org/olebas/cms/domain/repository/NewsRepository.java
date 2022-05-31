package org.olebas.cms.domain.repository;

import org.olebas.cms.domain.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, String> {
}
