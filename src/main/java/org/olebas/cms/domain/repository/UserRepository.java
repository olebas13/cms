package org.olebas.cms.domain.repository;

import org.olebas.cms.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
