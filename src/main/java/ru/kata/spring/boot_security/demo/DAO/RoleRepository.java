package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.Models.Role;

import java.util.List;

@Repository
public interface RoleRepository {
    void save(Role role);
    List<Role> findAll();
    Role findById(Long id);
}