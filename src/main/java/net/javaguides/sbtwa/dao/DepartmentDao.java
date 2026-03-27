package net.javaguides.sbtwa.dao;

import net.javaguides.sbtwa.domain.Department;

import java.util.List;

public interface DepartmentDao {

    void save(Department department);

    void update(Department department);

    void delete(Long id);

    Department findById(Long id);

    List<Department> findAll();
}
