package com.Raphael.mcfood.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository  extends JpaRepository<UserModal,Long> {
    UserDetails findByLogin(String username);
}