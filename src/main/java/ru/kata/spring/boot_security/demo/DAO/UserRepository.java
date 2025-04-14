package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.Models.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    void save(User user);
    List<User> findAll();
    User findById(Long id);
    Optional<User> findByUsername(String username);
    void update(User user);
    void deleteById(Long id);
}