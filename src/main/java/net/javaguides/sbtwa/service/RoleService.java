package net.javaguides.sbtwa.service;

import net.javaguides.sbtwa.domain.Role;

import java.util.List;

public interface RoleService {

    void save(Role role);

    void edit(Role role);

    void delete(Long id);

    Role searchById(Long id);

    List<Role> searchAll();
}
