package net.javaguides.sbtwa.dao;

import net.javaguides.sbtwa.domain.Role;

import java.util.List;

public interface RoleDao {
    void save(Role role);

    void update(Role role);

    void delete(Long id);

    Role findById(Long id);

    List<Role> findAll();
}
