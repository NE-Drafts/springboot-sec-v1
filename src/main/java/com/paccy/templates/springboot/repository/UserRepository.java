package com.paccy.templates.springboot.repository;

import com.paccy.templates.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {


    Optional<User> findByEmail(String email);
    Optional<User> findByActivationCode(String activationCode);
}
