package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Cheffood;

public interface Chefmenurepo extends JpaRepository<Cheffood, Long> {

}
