package com.iamneo.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Useracc;

public interface UseraccRepository extends JpaRepository<Useracc, Long> {
    Optional<Useracc> findByEmail(String email);

}
