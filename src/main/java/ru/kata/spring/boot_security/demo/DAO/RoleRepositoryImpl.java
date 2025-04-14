package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.Models.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleRepositoryImpl implements RoleRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Role> findAll() {
        return entityManager.createQuery("FROM Role", Role.class)
                .getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Role findById(Long id) {
        return entityManager.find(Role.class, id);
    }
}